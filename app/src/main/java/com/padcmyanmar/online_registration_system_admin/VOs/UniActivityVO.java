package com.padcmyanmar.online_registration_system_admin.VOs;

public class UniActivityVO {

    String PostedImage,PostedName,PostedTitle;

    public UniActivityVO(){}

    public String getPostedImage() {
        return PostedImage;
    }

    public void setPostedImage(String postedImage) {
        PostedImage = postedImage;
    }

    public String getPostedName() {
        return PostedName;
    }

    public void setPostedName(String postedName) {
        PostedName = postedName;
    }

    public String getPostedTitle() {
        return PostedTitle;
    }

    public void setPostedTitle(String postedTitle) {
        PostedTitle = postedTitle;
    }

    public UniActivityVO(String postedImage, String postedName, String postedTitle) {

        PostedImage = postedImage;
        PostedName = postedName;
        PostedTitle = postedTitle;
    }
}
