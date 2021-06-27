package com.xn.springbootdemo.contoller;

import com.xn.springbootdemo.enums.ActivityEnum;
import com.xn.springbootdemo.services.RouteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiaoNing
 * @date 2021/3/25
 */
@RestController
public class StrategyPatternDemoController {

    private final RouteService routeService;

    public StrategyPatternDemoController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/send-card/{activity}")
    public void sendCard(@PathVariable("activity") ActivityEnum activity){
        routeService.sendCard(activity);

    }

}
