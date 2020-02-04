package com.yash.pta.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yash.pta.model.Technology;
import com.yash.pta.repository.TechnologyRepository;
import com.yash.pta.service.TechnologyService;

@Service
public class TechnologyServiceImpl implements TechnologyService {

	@Autowired
	TechnologyRepository techRepo;
	
	@Override
	public List<Technology> getTechnoloyList() {
		// TODO Auto-generated method stub
		return  (List<Technology>) techRepo.findAll();
		
		
		
//		List<Technology> list = (List<Technology>) techRepo.findAll(); 
//		if(list!=null) {
//			return  new ResponseEntity<>(list, HttpStatus.OK);
//		}else {
//			return  new ResponseEntity<>("List is empty", HttpStatus.NOT_FOUND);
//		}
		
	}

}
