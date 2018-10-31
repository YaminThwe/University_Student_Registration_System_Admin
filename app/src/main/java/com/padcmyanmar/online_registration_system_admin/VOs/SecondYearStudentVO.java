package com.padcmyanmar.online_registration_system_admin.VOs;

public class SecondYearStudentVO {

    String No,Name, RollNo,Key;

    SecondYearStudentVO(){}

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public SecondYearStudentVO(String no, String name, String rollNo, String key) {

        No = no;
        Name = name;
        RollNo = rollNo;
        Key = key;
    }
}
