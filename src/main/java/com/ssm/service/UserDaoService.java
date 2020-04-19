package com.ssm.service;

import com.ssm.pojo.employee;

import java.sql.Date;
import java.util.List;

public interface UserDaoService {
//

    List<employee> findAll();


    void addEmployee(String name, String card_id, int sex, int job_id, String education, String email, String tel,
                     String phone, String party, String qq_num, String address, String post_code, Date birthday, String race,
                     String speciality, String hobby, String remark, int dept_id);

    void deleteEmployee(int id);
    void updateEmployee(employee employee);

    List<employee> searchEmployee(employee employee);

}

