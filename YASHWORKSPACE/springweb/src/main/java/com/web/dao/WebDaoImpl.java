package com.web.dao;

import org.springframework.stereotype.Repository;

@Repository
public class WebDaoImpl implements WebDao{

	@Override
	public String getData() {
		String name="PandurangPoonam";
		return name;
	}

}
