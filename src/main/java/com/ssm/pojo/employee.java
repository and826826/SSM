package com.ssm.pojo;
import java.sql.*;

public class employee {
    //id是主键
    int id;
    //部门主键
    int dept_id;
    //姓名
    char name;
    //身份证号
    int card_id;
    //地址
    char address;
    //邮编
    char post_code;
    //电话
    int tel;
    //手机
    int phone;
    //qq
    int qq;
    //邮箱
    char email;
    //性别
    char sex;
    //政党
    char party;
    //生日
    Timestamp birthday;
    //民族
    char race;
    //学历
    char education;
    //专业
    char speciality;
    //爱好
    char hobby;
    //备注
    char remark;
    //创建日期
    Timestamp createdate;

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

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

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public char getAddress() {
        return address;
    }

    public void setAddress(char address) {
        this.address = address;
    }

    public char getPost_code() {
        return post_code;
    }

    public void setPost_code(char post_code) {
        this.post_code = post_code;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getParty() {
        return party;
    }

    public void setParty(char party) {
        this.party = party;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public char getRace() {
        return race;
    }

    public void setRace(char race) {
        this.race = race;
    }

    public char getEducation() {
        return education;
    }

    public void setEducation(char education) {
        this.education = education;
    }

    public char getSpeciality() {
        return speciality;
    }

    public void setSpeciality(char speciality) {
        this.speciality = speciality;
    }

    public char getHobby() {
        return hobby;
    }

    public void setHobby(char hobby) {
        this.hobby = hobby;
    }

    public char getRemark() {
        return remark;
    }

    public void setRemark(char remark) {
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
