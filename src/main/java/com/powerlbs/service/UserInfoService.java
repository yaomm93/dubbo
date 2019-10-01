package com.powerlbs.service;

import com.powerlbs.domain.Address;

import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.service
 *
 * @date:2019/9/28 16:39
 * @author:Yaoxiaoming
 **/
public interface UserInfoService {
    List<Address> queryAddress(Integer userId);
}
