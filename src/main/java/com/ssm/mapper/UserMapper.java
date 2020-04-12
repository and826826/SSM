package com.ssm.mapper;

import com.ssm.pojo.employee;

import java.util.List;

public interface UserMapper {

	//�����������xml�ļ��е�id��ͬ
	//����û�
	void  addUser();
	//��������Ҳ�����xml�ļ��Ĳ�������һ��
	void  deleteUser(int id);
	//����ֵ����Ҳ����һ��
	employee findOne();

}
