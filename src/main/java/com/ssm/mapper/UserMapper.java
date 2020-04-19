package com.ssm.mapper;

import com.ssm.pojo.employee;

import java.util.List;

public interface UserMapper {

	void  addUser(employee employee);
	void deleteUser(int id);
	List<employee> findAll();
	List<employee> searchEmployee(employee employee);
	void  updateUser(employee employee);


}
