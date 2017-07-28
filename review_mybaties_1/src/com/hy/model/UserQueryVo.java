package com.hy.model;

import java.util.List;

/**
 * Created by sumimasah on 2017/7/25.
 */
public class UserQueryVo {
    //在这里添加所需要的查询条件

    //用户查询条件，这里假设一个User就已经够了
    private User user;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
