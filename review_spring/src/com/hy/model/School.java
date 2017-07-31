package com.hy.model;

import java.util.*;

/**
 * Created by dell on 2017/7/27.
 */
public class School {
    private List listStu ;
    private Set setStu;
    private Map mapStu;


    public void printSchool(){
        System.out.println("--------list--------");
//        for (int i = 0; i < listStu.size(); i++) {
//            System.out.println(listStu.get(i));
//        }
        for(Object l: listStu){
            System.out.println(l);
        }
        System.out.println("--------set--------");
        for(Object s : setStu){
            System.out.println(s);
        }
        System.out.println("--------map--------");
        Iterator it=mapStu.entrySet().iterator();
        System.out.println(mapStu.entrySet().size());
        String key;
        String value;
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            key=entry.getKey().toString();
            value=entry.getValue().toString();
            System.out.println(key+"===="+value);
        }
    }

    public List getListStu() {
        return listStu;
    }

    public void setListStu(List listStu) {
        this.listStu = listStu;
    }

    public Set getSetStu() {
        return setStu;
    }

    public void setSetStu(Set setStu) {
        this.setStu = setStu;
    }

    public Map getMapStu() {
        return mapStu;
    }

    public void setMapStu(Map mapStu) {
        this.mapStu = mapStu;
    }
}
