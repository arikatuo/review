package com.hy.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by dell on 2017/7/21.
 */
public class Grade {
    private int gid;
    private String gname;
    private String gdesc;
    //private Set<Students> student=new HashSet<Students>();


    public Grade() {

    }

    public Grade(String gname, String gdesc) {
        this.gname = gname;
        this.gdesc = gdesc;
    }

    public int getId() {
        return gid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

//    public Set<Students> getStudent() {
//        return student;
//    }

//    public void setStudent(Set<Students> student) {
//        this.student = student;
//    }
}
