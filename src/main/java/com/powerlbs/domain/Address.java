package com.powerlbs.domain;

import java.io.Serializable;

/**
 * ClassName:${name}
 * package:com.powerlbs.domain
 *
 * @date:2019/9/28 16:36
 * @author:Yaoxiaoming
 **/
public class Address implements Serializable {
    private static final long serialVersionUID = 1l;

    private String name;

    private String city;
    private String street;
    private String zipcode;
    private String mobile;
    private Boolean use;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", mobile='" + mobile + '\'' +
                ", use=" + use +
                '}';
    }
}
