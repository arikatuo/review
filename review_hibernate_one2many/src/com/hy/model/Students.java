package com.hy.model;

/**
 * Created by dell on 2017/7/21.
 */
public class Students {
    private int sid;
    private String sname;
    private String sex;

    public Students(String sname, String sex) {
        this.sname = sname;
        this.sex = sex;
    }

    public Students() {

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
