package com.hy.reflection;

/**
 * Created by dell on 2017/8/11.
 */
public Object class  getProperty(Object owner,String fieldName)throws Exception{
        Class ownerClass=owner.getClass();

        Field field=ownerClass.getField(fieldName);

        Object property=field.get(owner);

        return property;
        }