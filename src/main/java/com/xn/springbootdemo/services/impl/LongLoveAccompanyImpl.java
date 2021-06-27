package com.xn.springbootdemo.services.impl;

import com.xn.springbootdemo.enums.ActivityEnum;
import com.xn.springbootdemo.services.SendCardService;
import org.springframework.stereotype.Service;

/**
 * @author XiaoNing
 * @date 2021/3/25
 */
@Service("LONG_LOVE_ACCOMPANY")
public class LongLoveAccompanyImpl implements SendCardService {
    @Override
    public void sendCard() {
        System.out.println("长情陪伴礼遇...正在发奖...");
    }


    @Override
    public ActivityEnum activity() {
        return ActivityEnum.LONG_LOVE_ACCOMPANY;
    }
}
