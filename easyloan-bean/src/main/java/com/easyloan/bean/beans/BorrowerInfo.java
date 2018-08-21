package com.easyloan.bean.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.sql.Date;

/**
 * <p>
 * 客户_借款人信息
 * </p>
 *
 * @author xuan
 * @since 2018-08-18
 */
@TableName("nplm_borrower_info")
public class BorrowerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 进件客户编号
     */
    private Integer applyClientId;
    /**
     * ECIF客户号
     */
    private Integer ecifId;
    /**
     * 客户姓名
     */
    private String clientName;
    /**
     * 发短信移动电话
     */
    private String mobile;
    /**
     * 曾用名
     */
    private String oldName;
    /**
     * 性别
     */
    private String sex;
    /**
     * 民族
     */
    private String nation;
    /**
     * 出生日期
     */
    private String birthday;
    /**
     * 婚姻状况
     */
    private String marital;
    /**
     * 有无子女 1为没有，2为有
     */
    private Integer haveChildren;
    /**
     * 子女数量
     */
    private Integer childrenCount;
    /**
     * 国籍
     */
    private String nationality;
    /**
     * 户籍所在省
     */
    private String hProvince;
    /**
     * 户籍所在市
     */
    private String hCity;
    /**
     * 户籍所在地
     */
    private String hDress;
    /**
     * 证件类型
     */
    private String identityType;
    /**
     * 证件号码
     */
    private String identityNum;
    /**
     * 证件有效期限
     */
    private String identityValidDate;
    /**
     * 有无车产 Y:有  N:无
     */
    private String haveCar;
    /**
     * 房产情况
     */
    private String houseExplain;
    /**
     * 居住情况
     */
    private String resideExplain;
    /**
     * 居住年限
     */
    private String resideYear;
    /**
     * 学历
     */
    private String degree;
    /**
     * 学位
     */
    private String diploma;
    /**
     * 年收入
     */
    private Integer yearIncome;
    /**
     * 行业
     */
    private String industry;
    /**
     * 职业
     */
    private String job;
    /**
     * 公司名称
     */
    private String company;
    /**
     * 单位性质
     */
    private String companyType;
    /**
     * 所在部门
     */
    private String department;
    /**
     * 职位
     */
    private String position;
    /**
     * 该单位工作时间
     */
    private Integer workTime;
    /**
     * 该单位工作时间单位
     */
    private String workTimeUnit;
    /**
     * 客户所在地域
     */
    private String clientArea;
    /**
     * 客户类型
     */
    private String clientType;
    /**
     * 家庭地址_国家
     */
    private String fNation;
    /**
     * 家庭地址_省州
     */
    private String fProvince;
    /**
     * 家庭地址_城市
     */
    private String fCity;
    /**
     * 家庭地址_区县
     */
    private String fArea;
    /**
     * 家庭地址_街道单元
     */
    private String fStreet;
    /**
     * 家庭地址_邮政编码
     */
    private String fZipcode;
    /**
     * 公司地址_国家
     */
    private String cNation;
    /**
     * 公司地址_省州
     */
    private String cProvince;
    /**
     * 公司地址_城市
     */
    private String cCity;
    /**
     * 公司地址_区县
     */
    private String cArea;
    /**
     * 公司地址_街道单元
     */
    private String cStreet;
    /**
     * 公司地址_邮政编码
     */
    private String cZipcode;
    /**
     * 移动电话1
     */
    private String mobile1;
    /**
     * 移动电话2
     */
    private String mobile2;
    /**
     * 移动电话3
     */
    private String mobile3;
    /**
     * 家庭电话1 
     */
    private String fTel1;
    /**
     * 家庭电话2
     */
    private String fTel2;
    /**
     * 家庭电话3
     */
    private String fTel3;
    /**
     * 公司电话1
     */
    private String cTel1;
    /**
     * 公司电话2
     */
    private String cTel2;
    /**
     * 公司电话3
     */
    private String cTel3;
    /**
     * 电子邮箱1
     */
    private String email1;
    /**
     * 电子邮箱2
     */
    private String email2;
    /**
     * 电子邮箱3
     */
    private String email3;
    /**
     * 信用卡额度
     */
    private Integer creditAmount;
    /**
     * 是否拥有社保基金 Y：有  N：无
     */
    @TableField("SOCIALl_SECURITY")
    private String sociallSecurity;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplyClientId() {
        return applyClientId;
    }

    public void setApplyClientId(Integer applyClientId) {
        this.applyClientId = applyClientId;
    }

    public Integer getEcifId() {
        return ecifId;
    }

    public void setEcifId(Integer ecifId) {
        this.ecifId = ecifId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public Integer getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }

    public Integer getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String gethProvince() {
        return hProvince;
    }

    public void sethProvince(String hProvince) {
        this.hProvince = hProvince;
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    public String gethDress() {
        return hDress;
    }

    public void sethDress(String hDress) {
        this.hDress = hDress;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getIdentityValidDate() {
        return identityValidDate;
    }

    public void setIdentityValidDate(String identityValidDate) {
        this.identityValidDate = identityValidDate;
    }

    public String getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(String haveCar) {
        this.haveCar = haveCar;
    }

    public String getHouseExplain() {
        return houseExplain;
    }

    public void setHouseExplain(String houseExplain) {
        this.houseExplain = houseExplain;
    }

    public String getResideExplain() {
        return resideExplain;
    }

    public void setResideExplain(String resideExplain) {
        this.resideExplain = resideExplain;
    }

    public String getResideYear() {
        return resideYear;
    }

    public void setResideYear(String resideYear) {
        this.resideYear = resideYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public Integer getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Integer yearIncome) {
        this.yearIncome = yearIncome;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    public String getWorkTimeUnit() {
        return workTimeUnit;
    }

    public void setWorkTimeUnit(String workTimeUnit) {
        this.workTimeUnit = workTimeUnit;
    }

    public String getClientArea() {
        return clientArea;
    }

    public void setClientArea(String clientArea) {
        this.clientArea = clientArea;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getfNation() {
        return fNation;
    }

    public void setfNation(String fNation) {
        this.fNation = fNation;
    }

    public String getfProvince() {
        return fProvince;
    }

    public void setfProvince(String fProvince) {
        this.fProvince = fProvince;
    }

    public String getfCity() {
        return fCity;
    }

    public void setfCity(String fCity) {
        this.fCity = fCity;
    }

    public String getfArea() {
        return fArea;
    }

    public void setfArea(String fArea) {
        this.fArea = fArea;
    }

    public String getfStreet() {
        return fStreet;
    }

    public void setfStreet(String fStreet) {
        this.fStreet = fStreet;
    }

    public String getfZipcode() {
        return fZipcode;
    }

    public void setfZipcode(String fZipcode) {
        this.fZipcode = fZipcode;
    }

    public String getcNation() {
        return cNation;
    }

    public void setcNation(String cNation) {
        this.cNation = cNation;
    }

    public String getcProvince() {
        return cProvince;
    }

    public void setcProvince(String cProvince) {
        this.cProvince = cProvince;
    }

    public String getcCity() {
        return cCity;
    }

    public void setcCity(String cCity) {
        this.cCity = cCity;
    }

    public String getcArea() {
        return cArea;
    }

    public void setcArea(String cArea) {
        this.cArea = cArea;
    }

    public String getcStreet() {
        return cStreet;
    }

    public void setcStreet(String cStreet) {
        this.cStreet = cStreet;
    }

    public String getcZipcode() {
        return cZipcode;
    }

    public void setcZipcode(String cZipcode) {
        this.cZipcode = cZipcode;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getMobile3() {
        return mobile3;
    }

    public void setMobile3(String mobile3) {
        this.mobile3 = mobile3;
    }

    public String getfTel1() {
        return fTel1;
    }

    public void setfTel1(String fTel1) {
        this.fTel1 = fTel1;
    }

    public String getfTel2() {
        return fTel2;
    }

    public void setfTel2(String fTel2) {
        this.fTel2 = fTel2;
    }

    public String getfTel3() {
        return fTel3;
    }

    public void setfTel3(String fTel3) {
        this.fTel3 = fTel3;
    }

    public String getcTel1() {
        return cTel1;
    }

    public void setcTel1(String cTel1) {
        this.cTel1 = cTel1;
    }

    public String getcTel2() {
        return cTel2;
    }

    public void setcTel2(String cTel2) {
        this.cTel2 = cTel2;
    }

    public String getcTel3() {
        return cTel3;
    }

    public void setcTel3(String cTel3) {
        this.cTel3 = cTel3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public Integer getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getSociallSecurity() {
        return sociallSecurity;
    }

    public void setSociallSecurity(String sociallSecurity) {
        this.sociallSecurity = sociallSecurity;
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

    @Override
    public String toString() {
        return "BorrowerInfo{" +
        "id=" + id +
        ", applyClientId=" + applyClientId +
        ", ecifId=" + ecifId +
        ", clientName=" + clientName +
        ", mobile=" + mobile +
        ", oldName=" + oldName +
        ", sex=" + sex +
        ", nation=" + nation +
        ", birthday=" + birthday +
        ", marital=" + marital +
        ", haveChildren=" + haveChildren +
        ", childrenCount=" + childrenCount +
        ", nationality=" + nationality +
        ", hProvince=" + hProvince +
        ", hCity=" + hCity +
        ", hDress=" + hDress +
        ", identityType=" + identityType +
        ", identityNum=" + identityNum +
        ", identityValidDate=" + identityValidDate +
        ", haveCar=" + haveCar +
        ", houseExplain=" + houseExplain +
        ", resideExplain=" + resideExplain +
        ", resideYear=" + resideYear +
        ", degree=" + degree +
        ", diploma=" + diploma +
        ", yearIncome=" + yearIncome +
        ", industry=" + industry +
        ", job=" + job +
        ", company=" + company +
        ", companyType=" + companyType +
        ", department=" + department +
        ", position=" + position +
        ", workTime=" + workTime +
        ", workTimeUnit=" + workTimeUnit +
        ", clientArea=" + clientArea +
        ", clientType=" + clientType +
        ", fNation=" + fNation +
        ", fProvince=" + fProvince +
        ", fCity=" + fCity +
        ", fArea=" + fArea +
        ", fStreet=" + fStreet +
        ", fZipcode=" + fZipcode +
        ", cNation=" + cNation +
        ", cProvince=" + cProvince +
        ", cCity=" + cCity +
        ", cArea=" + cArea +
        ", cStreet=" + cStreet +
        ", cZipcode=" + cZipcode +
        ", mobile1=" + mobile1 +
        ", mobile2=" + mobile2 +
        ", mobile3=" + mobile3 +
        ", fTel1=" + fTel1 +
        ", fTel2=" + fTel2 +
        ", fTel3=" + fTel3 +
        ", cTel1=" + cTel1 +
        ", cTel2=" + cTel2 +
        ", cTel3=" + cTel3 +
        ", email1=" + email1 +
        ", email2=" + email2 +
        ", email3=" + email3 +
        ", creditAmount=" + creditAmount +
        ", sociallSecurity=" + sociallSecurity +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", updateType=" + updateType +
        "}";
    }
}
