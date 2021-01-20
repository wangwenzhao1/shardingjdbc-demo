package com.cxytiandi.sharding.po;

/**
 *<p>Description: </p>
 * @ClassName: OrderExtend
 * @author wangwenzhao
 * @date Aug 18, 20202:19:45 PM
 * @version: V1.0
 */
public class OrderExtend extends Order{


    /**
     * @author wangwenzhao
     */
    private static final long serialVersionUID = -1034379961563914523L;

    /**
     * 订单用户名
     */
    private String username;

    private String city;


    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }


    /**
     * @return the 订单用户名
     */
    public String getUsername() {
        return username;
    }



    /**
     * @param 订单用户名 the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }



    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }


}
