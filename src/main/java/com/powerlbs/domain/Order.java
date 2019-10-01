package com.powerlbs.domain;

import java.io.Serializable;

/**
 * ClassName:${name}
 * package:com.powerlbs.domain
 *
 * @date:2019/9/28 12:04
 * @author:Yaoxiaoming
 **/
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    //订单id
    private String id;
    //商品名称
    private String goodsName;
    //商品单价
    private float price;
    //购买数量
    private Integer amount;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
