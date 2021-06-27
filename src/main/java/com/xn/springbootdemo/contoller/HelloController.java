package com.xn.springbootdemo.contoller;

import com.xn.springbootdemo.dto.CampaignDto;
import com.xn.springbootdemo.dto.Opportunity;
import com.xn.springbootdemo.dto.RawClient;
import com.xn.springbootdemo.repo.OpportunityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * @author ...
 */
@Controller
public class HelloController {

    private final OpportunityRepo opportunityRepo;

    public HelloController(OpportunityRepo opportunityRepo) {
        this.opportunityRepo = opportunityRepo;
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String helloSpring(String text) {
        System.out.println(text);

        return text;

    }



    @GetMapping(value = "/hello1")
    @ResponseBody
    public RawClient hello(RawClient rawClient) {

        rawClient.setClientName(rawClient.getLastName() + " " + rawClient.getFirstName());

        System.out.println(rawClient);



        return rawClient;

    }

    @PostMapping(value = "/newCampaign")
    @ResponseBody
    public CampaignDto newCampaign2EtMt(@RequestBody CampaignDto campaignDto){


        System.out.println(campaignDto);


        Opportunity opportunity = new Opportunity();
        opportunity.setCreatedDate(LocalDateTime.now());
        opportunityRepo.save(opportunity);

        return campaignDto;

    }



}
