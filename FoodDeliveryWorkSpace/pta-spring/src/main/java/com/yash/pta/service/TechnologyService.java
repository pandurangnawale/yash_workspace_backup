package com.yash.pta.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yash.pta.model.Technology;



@Service
public interface TechnologyService {
	List<Technology> getTechnoloyList();
}
