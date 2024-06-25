package com.itheima.bean;
// 商家
public class Business extends User{
    private String shopName;    // 店铺名称
    private String address;     // 店铺地址

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
