package com.ssm.pojo;
import java.sql.*;

public class employee {
    //id是主键
    int id;
    //部门主键
    int dept_id;
    //职位主键
    int job_id;
    //姓名
    String name;
    //身份证号
    String card_id;
    //地址
    String address;
    //邮编
    String post_code;

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public employee(int dept_id, String name, String card_id, String address, String post_code, String tel, String phone, String qq, String email, String sex, String party, Timestamp birthday, String race, String education, String speciality, String hobby, String remark, int job_id) {
        this.dept_id = dept_id;
        this.job_id=job_id;
        this.name = name;
        this.card_id = card_id;
        this.address = address;
        this.post_code = post_code;
        this.tel = tel;
        this.phone = phone;
        this.qq = qq;
        this.email = email;
        this.sex = sex;
        this.party = party;
        this.birthday = birthday;
        this.race = race;
        this.education = education;
        this.speciality = speciality;
        this.hobby = hobby;
        this.remark = remark;
    }

    //电话
    String tel;
    //手机
    String phone;
    //qq
    String qq;
    //邮箱
    String email;
    //性别
    String sex;
    //政党
    String party;
    //生日
    Timestamp birthday;
    //民族
    String race;
    //学历
    String education;
    //专业
    String speciality;
    //爱好
    String hobby;
    //备注
    String remark;
//    //创建日期
//    Timestamp createdate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", dept_id=" + dept_id +
                ", name=" + name +
                ", card_id=" + card_id +
                ", address=" + address +
                ", post_code=" + post_code +
                ", tel=" + tel +
                ", phone=" + phone +
                ", qq=" + qq +
                ", email=" + email +
                ", sex=" + sex +
                ", party=" + party +
                ", birthday=" + birthday +
                ", race=" + race +
                ", education=" + education +
                ", speciality=" + speciality +
                ", hobby=" + hobby +
                ", remark=" + remark +
                '}';
    }
}
