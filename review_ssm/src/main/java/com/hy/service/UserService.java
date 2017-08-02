package com.hy.service;

import com.hy.entity.User;
import com.hy.util.PagedResult;

import java.util.List;

/**
 * Created by dell on 2017/8/2.
 */
public interface UserService {

    User selectUserById(Integer userId);

    List<User> selectUserByUserName(String userName);

    /**
     *
     * @author linbingwen
     * @since  2015年10月23日
     * @param userName 查询条件，可为空
     * @param pageNo 查询条件，可为空，默认取1
     * @param pageSize 查询条件，可为空，默认取10
     * @return
     */
    PagedResult<User> queryByPage(String userName, Integer pageNo, Integer pageSize);

}
