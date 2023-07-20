package com.multicampus.models;

public class Student {
    //Properties
    private String stdID;
    private String stdName;
    private String stdMobile;

    //Constructor

    public Student(String stdID, String stdName, String stdMobile) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.stdMobile = stdMobile;
    }


    //Setter and Getter

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdMobile() {
        return stdMobile;
    }

    public void setStdMobile(String stdMobile) {
        this.stdMobile = stdMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdID='" + stdID + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdMobile='" + stdMobile + '\'' +
                '}';
    }
}
