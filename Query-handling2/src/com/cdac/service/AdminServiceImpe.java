package com.cdac.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AdminDao;
import com.cdac.model.NontechnicalQuery;
import com.cdac.model.Query;
import com.cdac.model.User;
@Service
public class AdminServiceImpe implements AdminService
{
	
	
	@Autowired
	private AdminDao dao;

	@Override
	public boolean registerStudent(User user) {
	
		return dao.registerStudent(user);
	}

	@Override
	public boolean registerFaculty(User user) {
		
		return dao.registerFaculty(user);
	}

	@Override
	public ArrayList<NontechnicalQuery> getQueries() {
		 
		return dao.getQueries();
	}

	@Override
	public boolean updateStatus(int id) {
		 
		return dao.updateStatus(id);
	}

}
