package com.easyloan.bean.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.sql.Date;

/**
 * <p>
 * 合同_合同属性表
 * </p>
 *
 * @author xuan
 * @since 2018-08-18
 */
@TableName("nplm_contract_attribute")
public class ContractAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 合同id
     */
    private Integer loanContractId;
    /**
     * 合同编号
     */
    private Integer loanContractNum;
    /**
     * 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     */
    private String businessType;
    /**
     * 是否加急 Y : 是   N ： 否
     */
    private String isExpedited;
    /**
     * 签署时间
     */
    private Date signDate;
    /**
     * 签约方式 1：纸质  2：电子签约
     */
    private Integer signType;
    /**
     * 审核日期
     */
    private String approveDate;
    /**
     * 首期还款时间
     */
    private String firstRepayDate;
    /**
     * 收费方式 1:趸缴 2:双棒 3:期缴
     */
    private Integer feeFlag;
    /**
     * 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     */
    private String interestFlag;
    /**
     * 计息类型 1: 按期计息 2 :按实际天数计息
            
     */
    private Integer interestType;
    /**
     * 宽限期
     */
    private Integer graceDays;
    /**
     * IRR
     */
    private Integer irr;
    /**
     * 利率
     */
    private Integer lnsRate;
    /**
     * 进件渠道代码：GD，CX，XW，RZ
     */
    private String channelCode;
    /**
     * 进件渠道：个贷、创新、小微、融资
     */
    private String channelName;
    /**
     * 所属信贷员ID
     */
    private String loanOfficerId;
    /**
     * 管辖城市ID
     */
    @TableField("cityID")
    private String cityID;
    /**
     * 管辖城市
     */
    private String city;
    /**
     * 是否合同变更 Y:是  N:否
     */
    private String isModify;
    /**
     * 是否还款方案变更 Y:是  N:否
     */
    private String isSchemeModify;
    /**
     * 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     */
    private Integer recycleWay;
    /**
     * 是否循环贷 Y:是  N:否
     */
    private String isRecycleLoad;
    /**
     * 循环贷次数
     */
    private Integer recycleLoanCnt;
    /**
     * 旧合同号
     */
    private String oldContractNum;
    /**
     * 循环贷结清上一笔金额
     */
    private Integer settleAmount;
    /**
     * 合同变更后新合同编号
     */
    private String newContractNum;
    /**
     * 是否缩期 Y:是  N:否
     */
    private String isShorten;
    /**
     * 是否展期 Y:是  N:否
     */
    private String isExtend;
    /**
     * 是否转产品
     */
    private String isChangeProduce;
    /**
     * 是否违约 Y:是  N:否
     */
    private String isOverdue;
    /**
     * 是否一次性提前还款
     */
    private String isPayAhead;
    /**
     * 是否部分提前还款
     */
    private String isPayPart;
    /**
     * 借款用途
     */
    private String purpose;
    /**
     * 借款子用途
     */
    private String purposeSon;
    /**
     * 详细借款用途
     */
    private String purposeDetail;
    /**
     * 是否分账户回款 Y：是  N：否
     */
    private String isDivAccount;
    /**
     * 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     */
    private String systemType;
    /**
     * 高危标识 1:高位 0或空 非高危
     */
    private String highRisk;
    /**
     * 是否买断 Y：是  N：否
     */
    private String isBuyout;
    /**
     * 前期费用处理模式 1:线上   2:线下? 默认线上
     */
    private String feeProcessType;
    /**
     * 助学贷合作机构名称
     */
    private String studentCorpName;
    /**
     * 合同结清日期
     */
    private String settleDate;
    /**
     * 习惯打款时间
     */
    private String habitTime;
    /**
     * 还款日
     */
    @TableField("RepayDay")
    private String RepayDay;
    /**
     * 系统申请进件编号
     */
    @TableField("apply_Id")
    private String applyId;
    /**
     * 系统申请进件父编号
     */
    @TableField("old_Apply_Id")
    private String oldApplyId;
    /**
     * 营业部编号
     */
    private String deptId;
    /**
     * 营业部名称
     */
    private String deptName;
    /**
     * 创建者
     */
    private String creator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 末次修改者
     */
    private String updater;
    /**
     * 末次修改时间
     */
    private Date updateTime;
    /**
     * 修改类型
     */
    private String updateType;
    /**
     * 前期服务费折扣
     */
    private Integer frontChargeDiscount;
    /**
     * 月管理费率
     */
    private Integer monthMRate;
    /**
     * 手续费率
     */
    private Integer handleChargeRate;
    /**
     * 贷款次数
     */
    private Integer loanTimes;
    /**
     * 抵押物
     */
    private String pawn;
    /**
     * 手续费
     */
    private Integer handleCharge;
    /**
     * 分期服务费折扣
     */
    private Integer monthChargeDiscount;
    /**
     * 担保费
     */
    private Integer guaranteeFee;
    /**
     * 担保公司
     */
    private String guaranteeCompany;
    /**
     * 自定义字段1
     */
    private String def1;
    /**
     * 自定义字段1
     */
    private String def2;
    /**
     * 自定义字段1
     */
    private String def3;
    /**
     * 自定义字段1
     */
    private String def4;
    /**
     * 自定义字段1
     */
    private String def5;
    /**
     * 自定义字段1
     */
    private String def6;
    /**
     * 自定义字段1
     */
    private String def7;
    /**
     * 自定义字段1
     */
    private String def8;
    /**
     * 自定义字段1
     */
    private String def9;
    /**
     * 自定义字段1
     */
    private String def10;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanContractId() {
        return loanContractId;
    }

    public void setLoanContractId(Integer loanContractId) {
        this.loanContractId = loanContractId;
    }

    public Integer getLoanContractNum() {
        return loanContractNum;
    }

    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getIsExpedited() {
        return isExpedited;
    }

    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public String getFirstRepayDate() {
        return firstRepayDate;
    }

    public void setFirstRepayDate(String firstRepayDate) {
        this.firstRepayDate = firstRepayDate;
    }

    public Integer getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(Integer feeFlag) {
        this.feeFlag = feeFlag;
    }

    public String getInterestFlag() {
        return interestFlag;
    }

    public void setInterestFlag(String interestFlag) {
        this.interestFlag = interestFlag;
    }

    public Integer getInterestType() {
        return interestType;
    }

    public void setInterestType(Integer interestType) {
        this.interestType = interestType;
    }

    public Integer getGraceDays() {
        return graceDays;
    }

    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    public Integer getIrr() {
        return irr;
    }

    public void setIrr(Integer irr) {
        this.irr = irr;
    }

    public Integer getLnsRate() {
        return lnsRate;
    }

    public void setLnsRate(Integer lnsRate) {
        this.lnsRate = lnsRate;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getLoanOfficerId() {
        return loanOfficerId;
    }

    public void setLoanOfficerId(String loanOfficerId) {
        this.loanOfficerId = loanOfficerId;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIsModify() {
        return isModify;
    }

    public void setIsModify(String isModify) {
        this.isModify = isModify;
    }

    public String getIsSchemeModify() {
        return isSchemeModify;
    }

    public void setIsSchemeModify(String isSchemeModify) {
        this.isSchemeModify = isSchemeModify;
    }

    public Integer getRecycleWay() {
        return recycleWay;
    }

    public void setRecycleWay(Integer recycleWay) {
        this.recycleWay = recycleWay;
    }

    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }

    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad;
    }

    public Integer getRecycleLoanCnt() {
        return recycleLoanCnt;
    }

    public void setRecycleLoanCnt(Integer recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }

    public String getOldContractNum() {
        return oldContractNum;
    }

    public void setOldContractNum(String oldContractNum) {
        this.oldContractNum = oldContractNum;
    }

    public Integer getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Integer settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getNewContractNum() {
        return newContractNum;
    }

    public void setNewContractNum(String newContractNum) {
        this.newContractNum = newContractNum;
    }

    public String getIsShorten() {
        return isShorten;
    }

    public void setIsShorten(String isShorten) {
        this.isShorten = isShorten;
    }

    public String getIsExtend() {
        return isExtend;
    }

    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend;
    }

    public String getIsChangeProduce() {
        return isChangeProduce;
    }

    public void setIsChangeProduce(String isChangeProduce) {
        this.isChangeProduce = isChangeProduce;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    public String getIsPayAhead() {
        return isPayAhead;
    }

    public void setIsPayAhead(String isPayAhead) {
        this.isPayAhead = isPayAhead;
    }

    public String getIsPayPart() {
        return isPayPart;
    }

    public void setIsPayPart(String isPayPart) {
        this.isPayPart = isPayPart;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurposeSon() {
        return purposeSon;
    }

    public void setPurposeSon(String purposeSon) {
        this.purposeSon = purposeSon;
    }

    public String getPurposeDetail() {
        return purposeDetail;
    }

    public void setPurposeDetail(String purposeDetail) {
        this.purposeDetail = purposeDetail;
    }

    public String getIsDivAccount() {
        return isDivAccount;
    }

    public void setIsDivAccount(String isDivAccount) {
        this.isDivAccount = isDivAccount;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk;
    }

    public String getIsBuyout() {
        return isBuyout;
    }

    public void setIsBuyout(String isBuyout) {
        this.isBuyout = isBuyout;
    }

    public String getFeeProcessType() {
        return feeProcessType;
    }

    public void setFeeProcessType(String feeProcessType) {
        this.feeProcessType = feeProcessType;
    }

    public String getStudentCorpName() {
        return studentCorpName;
    }

    public void setStudentCorpName(String studentCorpName) {
        this.studentCorpName = studentCorpName;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getHabitTime() {
        return habitTime;
    }

    public void setHabitTime(String habitTime) {
        this.habitTime = habitTime;
    }

    public String getRepayDay() {
        return RepayDay;
    }

    public void setRepayDay(String RepayDay) {
        this.RepayDay = RepayDay;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getOldApplyId() {
        return oldApplyId;
    }

    public void setOldApplyId(String oldApplyId) {
        this.oldApplyId = oldApplyId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public Integer getFrontChargeDiscount() {
        return frontChargeDiscount;
    }

    public void setFrontChargeDiscount(Integer frontChargeDiscount) {
        this.frontChargeDiscount = frontChargeDiscount;
    }

    public Integer getMonthMRate() {
        return monthMRate;
    }

    public void setMonthMRate(Integer monthMRate) {
        this.monthMRate = monthMRate;
    }

    public Integer getHandleChargeRate() {
        return handleChargeRate;
    }

    public void setHandleChargeRate(Integer handleChargeRate) {
        this.handleChargeRate = handleChargeRate;
    }

    public Integer getLoanTimes() {
        return loanTimes;
    }

    public void setLoanTimes(Integer loanTimes) {
        this.loanTimes = loanTimes;
    }

    public String getPawn() {
        return pawn;
    }

    public void setPawn(String pawn) {
        this.pawn = pawn;
    }

    public Integer getHandleCharge() {
        return handleCharge;
    }

    public void setHandleCharge(Integer handleCharge) {
        this.handleCharge = handleCharge;
    }

    public Integer getMonthChargeDiscount() {
        return monthChargeDiscount;
    }

    public void setMonthChargeDiscount(Integer monthChargeDiscount) {
        this.monthChargeDiscount = monthChargeDiscount;
    }

    public Integer getGuaranteeFee() {
        return guaranteeFee;
    }

    public void setGuaranteeFee(Integer guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
    }

    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }

    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6;
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }

    @Override
    public String toString() {
        return "ContractAttribute{" +
        "id=" + id +
        ", loanContractId=" + loanContractId +
        ", loanContractNum=" + loanContractNum +
        ", businessType=" + businessType +
        ", isExpedited=" + isExpedited +
        ", signDate=" + signDate +
        ", signType=" + signType +
        ", approveDate=" + approveDate +
        ", firstRepayDate=" + firstRepayDate +
        ", feeFlag=" + feeFlag +
        ", interestFlag=" + interestFlag +
        ", interestType=" + interestType +
        ", graceDays=" + graceDays +
        ", irr=" + irr +
        ", lnsRate=" + lnsRate +
        ", channelCode=" + channelCode +
        ", channelName=" + channelName +
        ", loanOfficerId=" + loanOfficerId +
        ", cityID=" + cityID +
        ", city=" + city +
        ", isModify=" + isModify +
        ", isSchemeModify=" + isSchemeModify +
        ", recycleWay=" + recycleWay +
        ", isRecycleLoad=" + isRecycleLoad +
        ", recycleLoanCnt=" + recycleLoanCnt +
        ", oldContractNum=" + oldContractNum +
        ", settleAmount=" + settleAmount +
        ", newContractNum=" + newContractNum +
        ", isShorten=" + isShorten +
        ", isExtend=" + isExtend +
        ", isChangeProduce=" + isChangeProduce +
        ", isOverdue=" + isOverdue +
        ", isPayAhead=" + isPayAhead +
        ", isPayPart=" + isPayPart +
        ", purpose=" + purpose +
        ", purposeSon=" + purposeSon +
        ", purposeDetail=" + purposeDetail +
        ", isDivAccount=" + isDivAccount +
        ", systemType=" + systemType +
        ", highRisk=" + highRisk +
        ", isBuyout=" + isBuyout +
        ", feeProcessType=" + feeProcessType +
        ", studentCorpName=" + studentCorpName +
        ", settleDate=" + settleDate +
        ", habitTime=" + habitTime +
        ", RepayDay=" + RepayDay +
        ", applyId=" + applyId +
        ", oldApplyId=" + oldApplyId +
        ", deptId=" + deptId +
        ", deptName=" + deptName +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", updateType=" + updateType +
        ", frontChargeDiscount=" + frontChargeDiscount +
        ", monthMRate=" + monthMRate +
        ", handleChargeRate=" + handleChargeRate +
        ", loanTimes=" + loanTimes +
        ", pawn=" + pawn +
        ", handleCharge=" + handleCharge +
        ", monthChargeDiscount=" + monthChargeDiscount +
        ", guaranteeFee=" + guaranteeFee +
        ", guaranteeCompany=" + guaranteeCompany +
        ", def1=" + def1 +
        ", def2=" + def2 +
        ", def3=" + def3 +
        ", def4=" + def4 +
        ", def5=" + def5 +
        ", def6=" + def6 +
        ", def7=" + def7 +
        ", def8=" + def8 +
        ", def9=" + def9 +
        ", def10=" + def10 +
        "}";
    }
}
