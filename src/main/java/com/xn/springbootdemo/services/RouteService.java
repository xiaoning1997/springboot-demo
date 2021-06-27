package com.xn.springbootdemo.services;

import com.xn.springbootdemo.enums.ActivityEnum;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @author XiaoNing
 * @date 2021/3/25
 */
@Service
public class RouteService {

    private final Map<String, SendCardService> sendCardServiceMap;

    public RouteService(Map<String, SendCardService> sendCardServiceMap) {
        this.sendCardServiceMap = sendCardServiceMap;
    }

    public void sendCard(ActivityEnum activityName) {
        SendCardService sendCardService = sendCardServiceMap.get(activityName.name());
        sendCardService.sendCard();
    }


}