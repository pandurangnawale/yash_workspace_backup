package com.yash.pta.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yash.pta.model.Questions;
import com.yash.pta.service.QuestionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/question")
public class QuestionsController {

	private final Logger LOGGER = LoggerFactory.getLogger(QuestionsController.class);	
	@Autowired
	QuestionService quesService;
	
	@PostMapping("/technology/{id}/addQuestion")
	public Questions addQues(@PathVariable(value="id") int id,@Valid @RequestBody Questions ques)
	{
		return quesService.addQuestion(id,ques);
	}
	
	@GetMapping("/getQuestions")
	public List<Questions> getQuestions()
	{
		List<Questions> lst=quesService.getAllQuestions();
		return lst;
	}
	
	
	@GetMapping("/getByQuestionById/{id}")
    public List<Questions> getById(@PathVariable("id") int id)
    {
           return quesService.getQuestionsById(id);
    }
	
	@PostMapping(value = "/uploadExcel")
	public ResponseEntity<?> saveExelData(@RequestParam MultipartFile file) throws IOException {
	LOGGER.info(file.getOriginalFilename());

		if (!file.getContentType().contentEquals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {

			return new ResponseEntity<>("Invalid file type..", HttpStatus.BAD_REQUEST);
		}

		quesService.saveExelData(file);
		return new ResponseEntity<>("file uploaded successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteQuestionById/{no}")
    public ResponseEntity<?> deleteQues(@PathVariable("no") int no)
    { if(quesService.deleteQues(no)==true) {
           return new ResponseEntity<>("Delete successfully ..", HttpStatus.OK);
    }
    else
           return new ResponseEntity<>(" Not Deleted  ..", HttpStatus.NOT_FOUND);
    }
    
    @PutMapping("/updateQuestion/{no}")
    public Questions updateQues(@PathVariable(value="id") int id,@Valid @RequestBody Questions ques)
    {
           return quesService.addQuestion(id,ques);
    }
}
