package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.web.dao.WebDao;

@Service
@Repository
@Controller
public class WebServiceImpl implements WebService{

	@Autowired
	WebDao dao;
	
	@Override
	public String getData() {
		String name=dao.getData();
		return name;
	}

}
