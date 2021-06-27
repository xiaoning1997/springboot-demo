package com.xn.springbootdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 线索信息
 *
 * @Author Barry
 * @Date 2016/10/13 14:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Opportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @EntityMeta(title = "contactId", description = "contact表id")
    private Long contactId;

    @EntityMeta(title = "rawClientId", description = "RawClient表主键id")
    private Long rawClientId;

    @EntityMeta(title = "dmsId", description = "DMS线索唯一id")
    private String dmsId;

    @EntityMeta(title = "dccId", description = "DCC线索唯一id")
    private String dccId;

    @EntityMeta(title = "fcaId", description = "FCA线索唯一id")
    private String fcaId;

    @EntityMeta(title = "dealerId", description = "经销商id")
    private Long dealerId;

    @EntityMeta(title = "createdUserId", description = "创建人id")
    private Long createdUserId;

    @EntityMeta(title = "dealerUserId", description = "跟进人id")
    private Long dealerUserId;

    @EntityMeta(title = "salesConsultantId", description = "销售顾问id")
    private Long salesConsultantId;

    @EntityMeta(title = "phone", description = "手机号")
    private String phone;

    @EntityMeta(title = "sourcePhone", description = "初始电话, 线索创建时的电话")
    private String sourcePhone;

    @EntityMeta(title = "name", description = "潜客姓名")
    private String name;

    @EntityMeta(title = "topChannelId", description = "一级渠道")
    private Integer topChannelId;

    @EntityMeta(title = "secondChannelId", description = "二级渠道")
    private Integer secondChannelId;

    @EntityMeta(title = "thirdChannelId", description = "三级渠道")
    private Integer thirdChannelId;

    @EntityMeta(title = "channelId", description = "四级级渠道")
    private Integer channelId;

    @EntityMeta(title = "sourceId", description = "五级渠道")
    private Integer sourceId;

    @EntityMeta(title = "status", description = "首次到店/试驾/报价/跟进中/成功邀约/实际到店/赢单/战败")
    private String status;

    @EntityMeta(title = "integererestedReasonId", description = "兴趣原因:内饰/外形/价格/安全, ID在字典表中")
    private Integer integererestedReasonId;

    @EntityMeta(title = "brandId", description = "品牌id")
    private Integer brandId;

    @EntityMeta(title = "modelId", description = "意向车型")
    private Integer modelId;

    @EntityMeta(title = "styleId", description = "意向车款")
    private Integer styleId;

    @EntityMeta(title = "carColorId", description = "车型颜色(DCCM)")
    private Integer carColorId;

    @EntityMeta(title = "buyCarType", description = "购车属性(新购,换购,增购)")
    private String buyCarType;

    @EntityMeta(title = "opportunityLevel", description = "线索级别DCCM:A,B,C,N,H;PMP:H,W,C,N")
    private String opportunityLevel;

    @EntityMeta(title = "campaignId", description = "活动id,做活动来的线索")
    private Integer campaignId;

    @EntityMeta(title = "mediaId", description = "媒体id")
    private Integer mediaId;

    @EntityMeta(title = "conventionWalkInDate", description = "成功邀约时间")
    private LocalDateTime conventionWalkInDate;

    @EntityMeta(title = "conventionWalkInDateStart", description = "预约到店时间范围(开始)")
    private LocalDateTime conventionWalkInDateStart;

    @EntityMeta(title = "conventionWalkInDateEnd", description = "预约到店时间范围(结束)")
    private LocalDateTime conventionWalkInDateEnd;

    @EntityMeta(title = "firstFollowDate", description = "首次跟进")
    private LocalDateTime firstFollowDate;

    @EntityMeta(title = "secondFollowDate", description = "二次跟进(DCCM)")
    private LocalDateTime secondFollowDate;

    @EntityMeta(title = "giveUpReasonId", description = "战败原因id列表")
    private String giveUpReasonId;

    @EntityMeta(title = "prospectRepeatReasonId", description = "撞单原因")
    private Integer prospectRepeatReasonId;

    @EntityMeta(title = "giveUpDate", description = "战败时间")
    private LocalDateTime giveUpDate;

    @EntityMeta(title = "walkInDate", description = "到店时间")
    private LocalDateTime walkInDate;

    @EntityMeta(title = "orderDate", description = "订单日期(下订单DCCM)")
    private LocalDateTime orderDate;

    @EntityMeta(title = "winOrderDate", description = "赢单日期(交车DCCM)")
    private LocalDateTime winOrderDate;

    @EntityMeta(title = "expectedBuyYear", description = "期望购买年份")
    private String expectedBuyYear;

    @EntityMeta(title = "expectedBuyMonth", description = "期望购买月")
    private String expectedBuyMonth;

    @EntityMeta(title = "opportunityImportLogId", description = "关联导入日志")
    private Long opportunityImportLogId;

    @EntityMeta(title = "calledNumber", description = "400电话号码")
    @Column(length = 200)
    private String calledNumber;

    @EntityMeta(title = "callBeginTime", description = "400电话开始时间")
    @Column(length = 200)
    private String callBeginTime;

    @EntityMeta(title = "callEndTime", description = "400呼叫结束时间")
    @Column(length = 200)
    private String callEndTime;

    @EntityMeta(title = "callDurationSecond", description = "400电话时长,单位秒")
    private Integer callDurationSecond;

    @EntityMeta(title = "线索类型", description = "标记该线索是来自垂直网站INCOME／经销商新建NEW")
    @Column(length = 200)
    private String category;

    @EntityMeta(title = "description", description = "备注")
    @Column(length = 200)
    private String description;

    @EntityMeta(title = "线索传入时原始经销商Id", description = "")
    private Long originDealerId;

    @EntityMeta(title = "firstCreatedDate", description = "线索首次创建时间[多次进入的线索使用第一次创建的时间]")
    private LocalDateTime firstCreatedDate;

    @EntityMeta(title = "线索从垂直网站的注册时间", description = "注册时间")
    private LocalDateTime prospectCreateDate;

    @EntityMeta(title = "数据创建时间")
    private LocalDateTime createdDate;

    @EntityMeta(title = "线索修改时间", description = "该条数据记录的最近更新时间")
    private LocalDateTime modifiedDate;

    @Column(columnDefinition = "BOOLEAN")
    @EntityMeta(title = "数据是否有效")
    private boolean valid = true;

    @Column(columnDefinition = "BOOLEAN")
    @EntityMeta(title = "historyData", description = "数据是否是历史数据")
    private Boolean historyData;

    private String spotId;
    private String gacId;
    @EntityMeta(title = "leadsSource", description = "pmp中与商城线索关联的标识")
    private String leadsSource;

    private String source;
    private String topSource;

    public boolean isEndStatus() {
        boolean check = false;
        if (CustomerStatusEnum.lost.getNameEn().equals(status)
                || CustomerStatusEnum.salesConflict.getNameEn().equals(status)
                || CustomerStatusEnum.invitedShowUp.getNameEn().equals(status)
                || CustomerStatusEnum.noInvitedShowUp.getNameEn().equals(status)
                || CustomerStatusEnum.success.getNameEn().equals(status)) {
            check = true;
        }
        return check;
    }

    enum CustomerStatusEnum {
        /**
         * 线索状态
         */
        newProspect("1", "新潜在机会"),
        toBeFollowUp("2", "待处理"),
        followUp("3", "跟进中"),
        successfulInvitation("4", "成功邀约"),
        invitedShowUp("5", "邀约到店"),
        noInvitedShowUp("6", "非邀约到店"),
        salesConflict("7", "撞单"),
        applyLost("8", "战败申请"),
        lost("9", "已战败"),
        success("10", "赢单");

        private String nameEn;
        private String nameCn;

        CustomerStatusEnum(String nameEn, String nameCn) {
            this.nameEn = nameEn;
            this.nameCn = nameCn;
        }

        public static CustomerStatusEnum getCustomerStatusByNameEn(String nameEn) {
            for (CustomerStatusEnum state : CustomerStatusEnum.values()) {
                if (state.getNameEn().equals(nameEn)) {
                    return state;
                }
            }
            return null;
        }

        public static String getNameCn(String nameEn) {
            for (CustomerStatusEnum state : CustomerStatusEnum.values()) {
                if (state.getNameEn().equals(nameEn)) {
                    return state.nameCn;
                }
            }
            return null;
        }

        public String getNameEn() {
            return nameEn;
        }

        public String getNameCn() {
            return nameCn;
        }

        @Override
        public String toString() {
            return this.nameEn + "_" + this.nameCn;
        }
    }

    @EntityMeta(title = "lastSentCapDate", description = "最近一次传送C@P时间")
    private LocalDateTime lastSentCapDate;

    @EntityMeta(title = "lastSentCapScId", description = "最近一次传送C@P的SC ID")
    private Long lastSentCapScId;

    @EntityMeta(title = "initialFollowUpTaskDate", description = "线索进入首次待跟进列表时间")
    private LocalDateTime initialFollowUpTaskDate;

    public boolean isNoInvited() {
        return CustomerStatusEnum.toBeFollowUp.nameEn.equals(status)
                || CustomerStatusEnum.followUp.nameEn.equals(status)
                || CustomerStatusEnum.applyLost.nameEn.equals(status);
    }

    public boolean isInvited() {
        return CustomerStatusEnum.successfulInvitation.nameEn.equals(status);
    }

    public boolean isShowUp() {
        return CustomerStatusEnum.invitedShowUp.getNameEn().equals(status) || CustomerStatusEnum.noInvitedShowUp.getNameEn().equals(status);
    }

    public boolean isLostStatus(){
        return CustomerStatusEnum.lost.getNameCn().equalsIgnoreCase(status) || CustomerStatusEnum.applyLost.getNameCn().equalsIgnoreCase(status);
    }

    public boolean isToBeFollowUpStatus(){
        return CustomerStatusEnum.toBeFollowUp.getNameCn().equalsIgnoreCase(status);
    }


    @PrePersist
    private void prePersist(){
        if(StringUtils.isEmpty(this.getSourcePhone())){
            this.sourcePhone = this.phone;
        }
    }
}
