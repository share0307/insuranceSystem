/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.SettlementCompanyBillDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>settlement_company_bill</tt>.
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
 @SuppressWarnings("rawtypes") 
public interface SettlementCompanyBillDAO {
	/**
	 *  Insert one <tt>SettlementCompanyBillDO</tt> object to DB table <tt>settlement_company_bill</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into settlement_company_bill(settlement_company_id,bill_no,insurance_no,insurance_company_id,insurance_company_name,business_bill_id,appserial_period,customer_user_id,customer_user_name,insuance_person_id,insuance_person_name,premium_amount,rate,broker_amount,status,plan_pay_date,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param settlementCompanyBill
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SettlementCompanyBillDO settlementCompanyBill) throws DataAccessException;

	/**
	 *  Update DB table <tt>settlement_company_bill</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update settlement_company_bill set bill_no=?, insurance_no=?, insurance_company_id=?, insurance_company_name=?, business_bill_id=?, appserial_period=?, customer_user_id=?, customer_user_name=?, insuance_person_id=?, insuance_person_name=?, premium_amount=?, rate=?, broker_amount=?, status=?, plan_pay_date=? where (settlement_company_id = ?)</tt>
	 *
	 *	@param settlementCompanyBill
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SettlementCompanyBillDO settlementCompanyBill) throws DataAccessException;

	/**
	 *  Query DB table <tt>settlement_company_bill</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_company_id, bill_no, insurance_no, insurance_company_id, insurance_company_name, business_bill_id, appserial_period, customer_user_id, customer_user_name, insuance_person_id, insuance_person_name, premium_amount, rate, broker_amount, status, plan_pay_date, raw_add_time, raw_update_time from settlement_company_bill where (settlement_company_id = ?)</tt>
	 *
	 *	@param settlementCompanyId
	 *	@return SettlementCompanyBillDO
	 *	@throws DataAccessException
	 */	 
    public SettlementCompanyBillDO findById(long settlementCompanyId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>settlement_company_bill</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from settlement_company_bill where (settlement_company_id = ?)</tt>
	 *
	 *	@param settlementCompanyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long settlementCompanyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>settlement_company_bill</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_company_id, bill_no, insurance_no, insurance_company_id, insurance_company_name, business_bill_id, appserial_period, customer_user_id, customer_user_name, insuance_person_id, insuance_person_name, premium_amount, rate, broker_amount, status, plan_pay_date, raw_add_time, raw_update_time from settlement_company_bill se where (1 = 1)</tt>
	 *
	 *	@param settlementCompanyBill
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<SettlementCompanyBillDO>
	 *	@throws DataAccessException
	 */	 
    public List<SettlementCompanyBillDO> findByCondition(SettlementCompanyBillDO settlementCompanyBill, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>settlement_company_bill</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from settlement_company_bill se where (1 = 1)</tt>
	 *
	 *	@param settlementCompanyBill
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SettlementCompanyBillDO settlementCompanyBill) throws DataAccessException;

	/**
	 *  Update DB table <tt>settlement_company_bill</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update settlement_company_bill set status=?</tt>
	 *
	 *	@param status
	 *	@param settlementCompanyIds
	 *	@throws DataAccessException
	 */	 
    public int updateSettlementCompanyBill(String status, String settlementCompanyIds) throws DataAccessException;

	/**
	 *  Query DB table <tt>settlement_company_bill</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_company_id, bill_no, insurance_no, insurance_company_id, insurance_company_name, business_bill_id, appserial_period, customer_user_id, customer_user_name, insuance_person_id, insuance_person_name, premium_amount, rate, broker_amount, status, plan_pay_date, raw_add_time, raw_update_time from settlement_company_bill where (1 = 1)</tt>
	 *
	 *	@param settlementCompanyIds
	 *	@return List<SettlementCompanyBillDO>
	 *	@throws DataAccessException
	 */	 
    public List<SettlementCompanyBillDO> findSettlementCompanyBills(String settlementCompanyIds) throws DataAccessException;

	/**
	 *  Query DB table <tt>settlement_company_bill</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_company_id, bill_no, insurance_no, insurance_company_id, insurance_company_name, business_bill_id, appserial_period, customer_user_id, customer_user_name, insuance_person_id, insuance_person_name, premium_amount, rate, broker_amount, status, plan_pay_date, raw_add_time, raw_update_time from settlement_company_bill where (1 = 1)</tt>
	 *
	 *	@param businessBillId
	 *	@param period
	 *	@return SettlementCompanyBillDO
	 *	@throws DataAccessException
	 */	 
    public SettlementCompanyBillDO findSettlementCompanyBill(long businessBillId, Integer period) throws DataAccessException;

}