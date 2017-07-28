package com.hy.model;

/**
 * Created by dell on 2017/7/26.
 */
public class OrdersCustom extends Orders {
    //添加属性
    private String username;
    private String sex;
    private String address;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + super.getId() +
                ", userId=" + super.getUserId() +
                ", number='" + super.getNumber() + '\'' +
                ", createtime=" + super.getCreatetime() +
                ", note='" + super.getNote() + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
