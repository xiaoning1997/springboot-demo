package com.xn.springbootdemo.services.impl;

import com.xn.springbootdemo.enums.ActivityEnum;
import com.xn.springbootdemo.services.SendCardService;
import org.springframework.stereotype.Service;

/**
 * @author XiaoNing
 * @date 2021/3/25
 */
@Service("BACK_FACTORY")
public class BackFactoryImpl implements SendCardService {
    @Override
    public void sendCard() {
        System.out.println("护航J喜回厂好礼...正在发奖...");
    }

    @Override
    public ActivityEnum activity() {
        return ActivityEnum.BACK_FACTORY;
    }
}
