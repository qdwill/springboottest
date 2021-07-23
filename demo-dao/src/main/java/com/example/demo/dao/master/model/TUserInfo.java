package com.example.demo.dao.master.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * TUserInfo
 * 账户基本信息表
 * @Author: 01439090
 * @Date: 2021/04/14
 */
@Data
@ApiModel(value ="TUserInfo", description="账户基本信息表")
public class TUserInfo implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "账户")
    private String account;

    @ApiModelProperty(value = "员工号(卡号)")
    private String userCode;

    @ApiModelProperty(value = "员工姓名")
    private String userName;

    @ApiModelProperty(value = "类型（1、海尔员工，2、部门餐卡，3、外来人员）")
    private String userType;

    @ApiModelProperty(value = "身份证号")
    private String cardId;

    @ApiModelProperty(value = "所属园区")
    private String yuanqu;

    @ApiModelProperty(value = "账户状态（1、正常，2、无效（离职），3、冻结）")
    private String state;

    @ApiModelProperty(value = "手机号")
    private String tel;

    @ApiModelProperty(value = "创建日期")
    private Date createDate;

    @ApiModelProperty(value = "最后更新日期")
    private Date updateDate;

    @ApiModelProperty(value = "密钥对公钥")
    private String pubKey;

    @ApiModelProperty(value = "密钥对私钥")
    private String prtKey;

    @ApiModelProperty(value = "JWT使用的盐")
    private String salt;

    @ApiModelProperty(value = "基本餐余额")
    private BigDecimal baseMoney;

    @ApiModelProperty(value = "自充值余额")
    private BigDecimal selfMoney;

    @ApiModelProperty(value = "头像")
    private String headPic;

    @ApiModelProperty(value = "部门编号")
    private String deptCode;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "用户的部门（从ihaier获取的）")
    private String departOrgName;

    @ApiModelProperty(value = "团膳微信小程序的用户openid")
    private String tsWxOpenid;

    @ApiModelProperty(value = "海尔员工的直线经理的员工号")
    private String firstLineId;

    @ApiModelProperty(value = "用户密码（目前只有客餐卡会使用）")
    private String password;

    @ApiModelProperty(value = "工牌固有号")
    private String gpId;

    @ApiModelProperty(value = "工牌流水号")
    private String gpLsh;

    @ApiModelProperty(value = "工牌绑定时间")
    private Date gpTime;

    @ApiModelProperty(value = "累计充值基本餐金额")
    private BigDecimal totalBase;

    @ApiModelProperty(value = "累计个人充值金额")
    private BigDecimal totalSelf;

    @ApiModelProperty(value = "最后一次基本餐充值时间")
    private Date baseTime;

    @ApiModelProperty(value = "最后基本餐充值公司名称")
    private String baseCompany;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "内部员工1 非内部员工2")
    private String innerType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getYuanqu() {
        return yuanqu;
    }

    public void setYuanqu(String yuanqu) {
        this.yuanqu = yuanqu == null ? null : yuanqu.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey == null ? null : pubKey.trim();
    }

    public String getPrtKey() {
        return prtKey;
    }

    public void setPrtKey(String prtKey) {
        this.prtKey = prtKey == null ? null : prtKey.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public BigDecimal getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(BigDecimal baseMoney) {
        this.baseMoney = baseMoney;
    }

    public BigDecimal getSelfMoney() {
        return selfMoney;
    }

    public void setSelfMoney(BigDecimal selfMoney) {
        this.selfMoney = selfMoney;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDepartOrgName() {
        return departOrgName;
    }

    public void setDepartOrgName(String departOrgName) {
        this.departOrgName = departOrgName == null ? null : departOrgName.trim();
    }

    public String getTsWxOpenid() {
        return tsWxOpenid;
    }

    public void setTsWxOpenid(String tsWxOpenid) {
        this.tsWxOpenid = tsWxOpenid == null ? null : tsWxOpenid.trim();
    }

    public String getFirstLineId() {
        return firstLineId;
    }

    public void setFirstLineId(String firstLineId) {
        this.firstLineId = firstLineId == null ? null : firstLineId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGpId() {
        return gpId;
    }

    public void setGpId(String gpId) {
        this.gpId = gpId == null ? null : gpId.trim();
    }

    public String getGpLsh() {
        return gpLsh;
    }

    public void setGpLsh(String gpLsh) {
        this.gpLsh = gpLsh == null ? null : gpLsh.trim();
    }

    public Date getGpTime() {
        return gpTime;
    }

    public void setGpTime(Date gpTime) {
        this.gpTime = gpTime;
    }

    public BigDecimal getTotalBase() {
        return totalBase;
    }

    public void setTotalBase(BigDecimal totalBase) {
        this.totalBase = totalBase;
    }

    public BigDecimal getTotalSelf() {
        return totalSelf;
    }

    public void setTotalSelf(BigDecimal totalSelf) {
        this.totalSelf = totalSelf;
    }

    public Date getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(Date baseTime) {
        this.baseTime = baseTime;
    }

    public String getBaseCompany() {
        return baseCompany;
    }

    public void setBaseCompany(String baseCompany) {
        this.baseCompany = baseCompany == null ? null : baseCompany.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getInnerType() {
        return innerType;
    }

    public void setInnerType(String innerType) {
        this.innerType = innerType == null ? null : innerType.trim();
    }
}