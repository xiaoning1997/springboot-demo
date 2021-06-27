package com.xn.springbootdemo.services.impl;

import com.xn.springbootdemo.enums.ActivityEnum;
import com.xn.springbootdemo.services.SendCardService;
import org.springframework.stereotype.Service;

/**
 * @author XiaoNing
 * @date 2021/3/25
 */
@Service("J_GLAD_LOTTERY")
public class JeepGladLotteryImpl implements SendCardService {

    @Override
    public void sendCard() {

    }

    @Override
    public ActivityEnum activity() {
        return ActivityEnum.J_GLAD_LOTTERY;
    }
}
