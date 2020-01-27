package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cdac.model.Faculty;
import com.cdac.model.Login;
import com.cdac.model.NontechnicalQuery;
import com.cdac.model.Query;
import com.cdac.model.Student;
import com.cdac.model.User;
@Repository
public class AdminDaoImple implements AdminDao
{
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerStudent(User user) {
		System.out.println("In admin Dao");
		String sql ="insert into users(userName,password,phone,email,userRole) values(?,?,?,?,?)";
		int validate = jdbcTemplate.update(sql, new Object[] { user.getUsername(),user.getPassword(), user.getPhone(), user.getEmail(),
		        user.getUserRole()});
		Student student = new Student();

		student.setUserName(user.getUsername());
		if(user.getUserRole().equalsIgnoreCase("student"))
		{
			String sql1 = "insert into student(userName) values(?)";
			int result2 = jdbcTemplate.update(sql1,new Object[] {student.getUserName()});
			
		}
		if(validate>0)
		{
			return true;
		}
	 
		return false;
	}

	@Override
	public boolean registerFaculty(User user) {
		System.out.println("In admin Dao");
		String sql ="insert into users(userName,password,phone,email,userRole,sub_expert) values(?,?,?,?,?,?)";
		int validate = jdbcTemplate.update(sql, new Object[] { user.getUsername(),user.getPassword(), user.getPhone(), user.getEmail(),
		        user.getUserRole(), user.getSubjectExpert()});
		Faculty faculty = new Faculty();
		faculty.setUserName(user.getUsername());
		if(user.getUserRole().equalsIgnoreCase("faculty"))
		{
			String sql1 = "insert into student(userName) values(?)";
			int result2 = jdbcTemplate.update(sql1,new Object[] {faculty.getUserName()});
			
		}
		
		if(validate>0)
		{
			return true;
		}
		return false;
	}

	 
	 
	
	@Override
	public ArrayList<NontechnicalQuery> getQueries() {
		System.out.println("In admin Dao for get Queries");
		String sql="select * from nontech_queries";
		return (ArrayList<NontechnicalQuery>) jdbcTemplate.query(sql, new BeanPropertyRowMapper(NontechnicalQuery.class));
	}

	@Override
	public boolean updateStatus(int id) {
		System.out.println("In admin Dao for update Queries");
		String sql="update nontech_queries set status='Yes' where id=?";
		int status = jdbcTemplate.update(sql, id);
		if(status>0)
		{
			return true;
		}
		
		return false;
	}



}
