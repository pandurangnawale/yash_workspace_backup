package com.yash.pta.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pta.model.ExamCriteria;
import com.yash.pta.serviceApi.TrainerServiceApi;

@RestController
public class TrainerController {
	
	@Autowired
	ExamCriteria examCriteria;
	
	@Autowired
	TrainerServiceApi trainerServiceApi;
	
	

}
