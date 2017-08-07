package com.hy.bookstore.domain;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by sumimasah on 2017/8/5.
 */
public class User {
    private  Integer userId;
    private String userName;
    private int accountId;

    private Set<Trade> trades=new LinkedHashSet<Trade>();
}
