package com.hy.dao;

import com.hy.model.Orders;
import com.hy.model.OrdersCustom;
import com.hy.model.User;

import java.util.List;

/**
 * Created by dell on 2017/7/26.
 */
public interface UserMapperOrders {
    //查询订单，关联查询用户信息
    public List<OrdersCustom> findOrdersUser() throws Exception;
    //查询订单，关联查询用户信息,使用resultMap
    public List<OrdersCustom> findOrdersUserResultMap() throws Exception;

    //查询订单（关联用户）及订单明细
    public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;

    //查询用户购买商品信息
    public List<User> findUserAndItemsResultMap() throws Exception;
}
