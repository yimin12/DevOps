package com.yimin.user.response;

/*
 *   @Author : Yimin Huang
 *   @Contact : hymlaucs@gmail.com
 *   @Date : 2021/2/7 18:02
 *   @Description :
 *
 */
public class LoginResponse extends Response{

    private String token;

    public LoginResponse(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }
}
