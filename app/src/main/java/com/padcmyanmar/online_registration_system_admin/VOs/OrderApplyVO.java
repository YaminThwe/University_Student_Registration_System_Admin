package com.padcmyanmar.online_registration_system_admin.VOs;

public class OrderApplyVO {

    String firstName;
    String secondName;
    String thirdName;
    String fourthName;
    String fifthName;

    public OrderApplyVO(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getFourthName() {
        return fourthName;
    }

    public void setFourthName(String fourthName) {
        this.fourthName = fourthName;
    }

    public String getFifthName() {
        return fifthName;
    }

    public void setFifthName(String fifthName) {
        this.fifthName = fifthName;
    }

    public String getSixthName() {
        return SixthName;
    }

    public void setSixthName(String sixthName) {
        SixthName = sixthName;
    }

    public OrderApplyVO(String firstName, String secondName, String thirdName, String fourthName, String fifthName, String sixthName) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.fourthName = fourthName;
        this.fifthName = fifthName;
        SixthName = sixthName;
    }

    String SixthName;




}
