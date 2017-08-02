package com.hy.test_1;

/**
 * Created by dell on 2017/8/2.
 */
import java.util.List;

import javax.annotation.Resource;

import com.hy.entity.User;
import com.hy.service.UserService;
import com.hy.util.PagedResult;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 功能概要：UserService单元测试
 *
 * @author linbingwen
 * @since 2015年9月28日
 */
public class UserServiceTest extends SpringTestCase {
    @Resource
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Test
    public void selectUserByIdTest() {
        User user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
    }

    @Test
    public void selectUserByUserName() {
        List<User> list = userService.selectUserByUserName("apple");
        logger.debug("查找结果" + list);
    }

    /**
     * 分页测试
     *
     * @author linbingwen
     * @since 2015年10月22日
     */
    @Test
    public void queryByPage() {
        PagedResult<User> pagedResult = userService.queryByPage(null, 1, 10);//null表示查全部
        logger.debug("查找结果" + pagedResult);

    }


}
