/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>settlement_company_bill</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/settlement_company_bill.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class SettlementCompanyBillDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long settlementCompanyId;

	private String billNo;

	private String insuranceNo;

	private long insuranceCompanyId;

	private String insuranceCompanyName;

	private long businessBillId;

	private String appserialPeriod;

	private long customerUserId;

	private String customerUserName;

	private long insuancePersonId;

	private String insuancePersonName;

	private Money premiumAmount = new Money(0, 0);

	private double rate;

	private Money brokerAmount = new Money(0, 0);

	private String status;

	private Date planPayDate;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getSettlementCompanyId() {
		return settlementCompanyId;
	}
	
	public void setSettlementCompanyId(long settlementCompanyId) {
		this.settlementCompanyId = settlementCompanyId;
	}

	public String getBillNo() {
		return billNo;
	}
	
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getInsuranceNo() {
		return insuranceNo;
	}
	
	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public long getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	
	public void setInsuranceCompanyId(long insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}

	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}

	public long getBusinessBillId() {
		return businessBillId;
	}
	
	public void setBusinessBillId(long businessBillId) {
		this.businessBillId = businessBillId;
	}

	public String getAppserialPeriod() {
		return appserialPeriod;
	}
	
	public void setAppserialPeriod(String appserialPeriod) {
		this.appserialPeriod = appserialPeriod;
	}

	public long getCustomerUserId() {
		return customerUserId;
	}
	
	public void setCustomerUserId(long customerUserId) {
		this.customerUserId = customerUserId;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}
	
	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public long getInsuancePersonId() {
		return insuancePersonId;
	}
	
	public void setInsuancePersonId(long insuancePersonId) {
		this.insuancePersonId = insuancePersonId;
	}

	public String getInsuancePersonName() {
		return insuancePersonName;
	}
	
	public void setInsuancePersonName(String insuancePersonName) {
		this.insuancePersonName = insuancePersonName;
	}

	public Money getPremiumAmount() {
		return premiumAmount;
	}
	
	public void setPremiumAmount(Money premiumAmount) {
		if (premiumAmount == null) {
			this.premiumAmount = new Money(0, 0);
		} else {
			this.premiumAmount = premiumAmount;
		}
	}

	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}

	public Money getBrokerAmount() {
		return brokerAmount;
	}
	
	public void setBrokerAmount(Money brokerAmount) {
		if (brokerAmount == null) {
			this.brokerAmount = new Money(0, 0);
		} else {
			this.brokerAmount = brokerAmount;
		}
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPlanPayDate() {
		return planPayDate;
	}
	
	public void setPlanPayDate(Date planPayDate) {
		this.planPayDate = planPayDate;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}