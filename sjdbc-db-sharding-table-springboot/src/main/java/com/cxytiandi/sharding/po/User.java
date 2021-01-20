package com.cxytiandi.sharding.po;


public class User {

    private Integer userid;

    private String city;

    private String name;

    /**
     * @return the userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     *            the userid to set
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{" + "userid" + userid + "name" + name + "}";
    }
}
