package com.padcmyanmar.online_registration_system_admin.VOs;

public class TodayActivityVO {

    String ActivityName, Time;

    public TodayActivityVO(String activityName, String time) {
        ActivityName = activityName;
        Time = time;
    }

    public TodayActivityVO(){
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String activityName) {
        ActivityName = activityName;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
