package com.xn.springbootdemo.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by Feng on 2017/8/2.
 */
@Data
public class CampaignDto {
    private long id;
    private String campaignId;
    private String campaignNameCn;
    private String campaignNameEn;
    private boolean needFollow;
    @Deprecated
    private int activeYear;
    private List<Integer> activeYears;
    private Date expireDate;
    private Long channelId;
    private Long channelParentId;
    private Long dealerId;

    private LocalDateTime now = LocalDateTime.now();


    public boolean isExpired() {
        return Objects.nonNull(expireDate) && new Date().after(expireDate);
    }
}
