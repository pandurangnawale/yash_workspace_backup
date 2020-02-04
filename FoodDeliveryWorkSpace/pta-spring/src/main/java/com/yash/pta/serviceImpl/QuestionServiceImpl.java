package com.yash.pta.serviceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yash.pta.exception.InvalidFileContentException;
import com.yash.pta.model.Questions;
import com.yash.pta.model.Technology;
import com.yash.pta.repository.QuestionRepository;
import com.yash.pta.repository.TechnologyRepository;
import com.yash.pta.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	QuestionRepository questionRepo;
	@Autowired
	TechnologyRepository techRepo;

	public List<Questions> getAllQuestions() {

		List<Questions> queslst = questionRepo.findAll();

		if (queslst.size() > 0) {
			return queslst;
		} else {
			return new ArrayList<Questions>();
		}
	}

	@Override
	public Questions addQuestion(int id, Questions ques) {

		Optional<Technology> techOpt = techRepo.findById(id);
		Technology technology = techOpt.get();

		/// tie Subject to Questions
		ques.setTechnology(technology);
		Questions question = questionRepo.save(ques);

		/// tie Questions to Subject
		Technology techObj = new Technology();
		Set<Questions> setQues = new HashSet<Questions>();
		setQues.add(question);
		techObj.setQue(setQues);

		return question;

	}

	@Override
	public List<Questions> getQuestionsById(int techID) {

		return questionRepo.getQuesByTechID(techID);
		
	}

	@Override
	public void saveExelData(MultipartFile file) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
		
		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.rowIterator();

		Questions question = null;

		List<Questions> listOfquestion = new ArrayList<>();

		List<String> headers = new ArrayList<>();

		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			question = new Questions();

			if (headers.isEmpty()) {
				headers = builderHeaders(row);
				continue; // skip header row
			}
			//System.out.println(headers.get);
				Iterator<Cell> cellIterator = row.cellIterator();
				int cellCount = 0;

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (headers.get(cellCount).toUpperCase()) {
					case "S.NO":
						question.setNo((int) cell.getNumericCellValue());

						break;
					case "QUESTION":
						question.setQues(cell.getStringCellValue());
						break;
					case "OPTION1":
						question.setOption1(cell.getStringCellValue());
						break;
					case "OPTION2":
						question.setOption2(cell.getStringCellValue());
						break;
					case "OPTION3":
						question.setOption3(cell.getStringCellValue());
						break;
					case "OPTION4":

						question.setOption4(cell.getStringCellValue());
						break;
					case "RIGHT":
						question.setRightOption(cell.getStringCellValue());
						break;
					default:
						System.out.println("not matching header found...");
						throw new InvalidFileContentException("File headers are not accepted..!");
						
						
					}
					cellCount++;
				}
				listOfquestion.add(question);
			
			}

		System.out.println(listOfquestion);

		questionRepo.saveAll(listOfquestion);
	}

	private static List<String> builderHeaders(Row row) {
		Iterator<Cell> cellIterator = row.cellIterator();
		List<String> headers = new ArrayList<String>();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			if (cell.getCellType() == 0) {
				headers.add(cell.getNumericCellValue() + "");
			} else if (cell.getCellType() == 1) {
				headers.add(cell.getStringCellValue());
			}
		}

		return headers;
	}
	@Override
    public boolean deleteQues(int no)
    { 
           try {
                  questionRepo.deleteById(no);
                  return true;
           } catch (Exception e) {
                  
                  e.printStackTrace();
           }
    return false;
    }

	


}
