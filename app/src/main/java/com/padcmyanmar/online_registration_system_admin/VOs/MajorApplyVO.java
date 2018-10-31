package com.padcmyanmar.online_registration_system_admin.VOs;

public class MajorApplyVO {

    String StudentNameInMyanmar, StudentNameInEnglish, StudentNRC, StudentBirthday, LastClass, FatherNameInMyanmar, FatherNameInEnglish, FatherNRC, FatherJob, MotherNameInMyanmar, MotherNameInEnglish, MotherNRC, MotherJob, Address, StudentPhoneNumber, PermanentAddress, PermanentPhoneNumber;
    String Marks;

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        this.Marks = marks;
    }

    public MajorApplyVO(String studentNameInMyanmar, String studentNameInEnglish, String studentNRC, String studentBirthday, String lastClass, String fatherNameInMyanmar, String fatherNameInEnglish, String fatherNRC, String fatherJob, String motherNameInMyanmar, String motherNameInEnglish, String motherNRC, String motherJob, String address, String studentPhoneNumber, String permanentAddress, String permanentPhoneNumber, String marks) {
        StudentNameInMyanmar = studentNameInMyanmar;
        StudentNameInEnglish = studentNameInEnglish;
        StudentNRC = studentNRC;
        StudentBirthday = studentBirthday;
        LastClass = lastClass;
        FatherNameInMyanmar = fatherNameInMyanmar;
        FatherNameInEnglish = fatherNameInEnglish;
        FatherNRC = fatherNRC;
        FatherJob = fatherJob;
        MotherNameInMyanmar = motherNameInMyanmar;
        MotherNameInEnglish = motherNameInEnglish;
        MotherNRC = motherNRC;
        MotherJob = motherJob;
        Address = address;
        StudentPhoneNumber = studentPhoneNumber;
        PermanentAddress = permanentAddress;
        PermanentPhoneNumber = permanentPhoneNumber;
        this.Marks = marks;
    }

    public MajorApplyVO() {
    }

    public String getStudentNameInMyanmar() {
        return StudentNameInMyanmar;
    }

    public void setStudentNameInMyanmar(String studentNameInMyanmar) {
        StudentNameInMyanmar = studentNameInMyanmar;
    }

    public String getStudentNameInEnglish() {
        return StudentNameInEnglish;
    }

    public void setStudentNameInEnglish(String studentNameInEnglish) {
        StudentNameInEnglish = studentNameInEnglish;
    }

    public String getStudentNRC() {
        return StudentNRC;
    }

    public void setStudentNRC(String studentNRC) {
        StudentNRC = studentNRC;
    }

    public String getStudentBirthday() {
        return StudentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        StudentBirthday = studentBirthday;
    }

    public String getLastClass() {
        return LastClass;
    }

    public void setLastClass(String lastClass) {
        LastClass = lastClass;
    }

    public String getFatherNameInMyanmar() {
        return FatherNameInMyanmar;
    }

    public void setFatherNameInMyanmar(String fatherNameInMyanmar) {
        FatherNameInMyanmar = fatherNameInMyanmar;
    }

    public String getFatherNameInEnglish() {
        return FatherNameInEnglish;
    }

    public void setFatherNameInEnglish(String fatherNameInEnglish) {
        FatherNameInEnglish = fatherNameInEnglish;
    }

    public String getFatherNRC() {
        return FatherNRC;
    }

    public void setFatherNRC(String fatherNRC) {
        FatherNRC = fatherNRC;
    }

    public String getFatherJob() {
        return FatherJob;
    }

    public void setFatherJob(String fatherJob) {
        FatherJob = fatherJob;
    }

    public String getMotherNameInMyanmar() {
        return MotherNameInMyanmar;
    }

    public void setMotherNameInMyanmar(String motherNameInMyanmar) {
        MotherNameInMyanmar = motherNameInMyanmar;
    }

    public String getMotherNameInEnglish() {
        return MotherNameInEnglish;
    }

    public void setMotherNameInEnglish(String motherNameInEnglish) {
        MotherNameInEnglish = motherNameInEnglish;
    }

    public String getMotherNRC() {
        return MotherNRC;
    }

    public void setMotherNRC(String motherNRC) {
        MotherNRC = motherNRC;
    }

    public String getMotherJob() {
        return MotherJob;
    }

    public void setMotherJob(String motherJob) {
        MotherJob = motherJob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getStudentPhoneNumber() {
        return StudentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        StudentPhoneNumber = studentPhoneNumber;
    }

    public String getPermanentAddress() {
        return PermanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        PermanentAddress = permanentAddress;
    }

    public String getPermanentPhoneNumber() {
        return PermanentPhoneNumber;
    }

    public void setPermanentPhoneNumber(String permanentPhoneNumber) {
        PermanentPhoneNumber = permanentPhoneNumber;
    }
}
