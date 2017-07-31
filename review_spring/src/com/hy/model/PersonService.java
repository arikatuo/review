package com.hy.model;

/**
 * Created by dell on 2017/7/31.
 */
public class PersonService {
    private String  message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public void init(){
        System.out.println("init");
    }
    //  how  validate the  destory method is  a question
    public void  cleanUp(){
        System.out.println("cleanUp");
    }
}
