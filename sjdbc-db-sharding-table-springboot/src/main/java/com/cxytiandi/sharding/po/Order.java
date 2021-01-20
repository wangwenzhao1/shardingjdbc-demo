package com.cxytiandi.sharding.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *<p>Description: </p>
 * @ClassName: Order
 * @author wangwenzhao
 * @date Aug 17, 20203:43:01 PM
 * @version: V1.0
 */
public class Order implements Serializable{

    /**
     * @author wangwenzhao
     */
    private static final long serialVersionUID = 3932741295395706290L;

    private Integer orderid;

    private String ordernum;

    private Integer userid;

    private BigDecimal price;

    private Integer addtime;

    private String name;

    /**
     * @return the orderid
     */
    public Integer getOrderid() {
        return orderid;
    }


    /**
     * @param orderid the orderid to set
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }


    /**
     * @return the ordernum
     */
    public String getOrdernum() {
        return ordernum;
    }


    /**
     * @param ordernum the ordernum to set
     */
    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }


    /**
     * @return the userid
     */
    public Integer getUserid() {
        return userid;
    }


    /**
     * @param userid the userid to set
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }


    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }


    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    /**
     * @return the addtime
     */
    public Integer getAddtime() {
        return addtime;
    }


    /**
     * @param addtime the addtime to set
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
