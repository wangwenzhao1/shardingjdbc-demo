package com.cxytiandi.sharding.service;

import java.math.BigDecimal;
import java.util.List;

import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.po.OrderExtend;
import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.po.UserVO;
import com.cxytiandi.sharding.po.Zuser;

public interface UserService {

	List<User> list();

	Long add(User user);

	User findById(Integer userid);

	List<User> findByName(String name);

    /**
     * @author wangwenzhao
     * @param order
     */
    int addOrder(Order order);

    /**
     * @author wangwenzhao
     * @param ids
     * @return
     */
    List<User> findByIds(List<Integer> ids);

    /**
     * @author wangwenzhao
     * @param id
     * @return
     */
    List<OrderExtend> getUserOrder(Integer id);

    int addOrderTR();

    /**
     * @author wangwenzhao
     * @param userVO
     */
    List<User> listPage(UserVO userVO);

    /**
     * @author wangwenzhao
     * @param city
     * @return
     */
    User findBycity(String city);

    /**
     * @author wangwenzhao
     * @param name
     * @return
     */
    Zuser getzuser(String name);

    /**
     * @author wangwenzhao
     * @param id
     * @return
     */
    Zuser getzuserId(Integer id);

    /**
     * @author wangwenzhao
     * @param age
     * @return
     */
    Zuser getzuserAge(Integer age);

    /**
     * @author wangwenzhao
     * @param price
     * @return
     */
    Order getUserOrderprice(BigDecimal price);

    /**
     * @author wangwenzhao
     * @param addTime
     * @return
     */
    Order getUserOrderaddTime(Integer addTime);

}
