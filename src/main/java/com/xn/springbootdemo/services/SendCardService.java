package com.xn.springbootdemo.services;

import com.xn.springbootdemo.enums.ActivityEnum;

/**
 * @author XiaoNing
 * @date 2021/3/25
 */
public interface SendCardService {

    default void t1(){

    }

    void sendCard();

    ActivityEnum activity();

}
