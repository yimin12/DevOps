package com.yimin.thrift.user.dto;

/*
 *   @Author : Yimin Huang
 *   @Contact : hymlaucs@gmail.com
 *   @Date : 2021/2/7 17:49
 *   @Description :
 *
 */
public class TeacherDTO extends UserDTO{

    private String intro;
    private int stars;

    public String getInfo(){
        return intro;
    }

    public void setIntro(String intro){
        this.intro = intro;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
