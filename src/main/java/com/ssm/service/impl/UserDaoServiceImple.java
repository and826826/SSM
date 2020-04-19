package com.ssm.service.impl;

import com.ssm.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.service.UserDaoService;

import java.sql.Date;
import java.util.List;

@Service
public class UserDaoServiceImple implements UserDaoService{

	@Autowired
	UserMapper mapper;

	@Override
	public List<employee> findAll() {
		return mapper.findAll();

	}

	@Override
	public void addEmployee(String name, String card_id, int sex, int job_id, String education, String email, String tel, String phone, String party, String qq_num, String address, String post_code, Date birthday, String race, String speciality, String hobby, String remark, int dept_id) {

	}

	@Override
	public void deleteEmployee(int id) {
		mapper.deleteUser(id);

	}

	@Override
	public void updateEmployee(employee employee) {
		mapper.updateUser(employee);
	}

	@Override
	public List<employee>  searchEmployee(employee employee) {
		return mapper.searchEmployee(employee);
	}




}
