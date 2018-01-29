/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.PersonCommissionDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>person_commission_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/person_commission_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface PersonCommissionDetailDAO {
	/**
	 *  Insert one <tt>PersonCommissionDetailDO</tt> object to DB table <tt>person_commission_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into person_commission_detail(settlement_person_id,serial_number,business_user_id,business_user_name,business_user_type,business_bill_id,insurance_no,commission_amount,commission_time,commission_type,balance,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param personCommissionDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PersonCommissionDetailDO personCommissionDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>person_commission_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update person_commission_detail set serial_number=?, business_user_id=?, business_user_name=?, business_user_type=?, business_bill_id=?, insurance_no=?, commission_amount=?, commission_time=?, commission_type=?, balance=?, remark=? where (settlement_person_id = ?)</tt>
	 *
	 *	@param personCommissionDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PersonCommissionDetailDO personCommissionDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_person_id, serial_number, business_user_id, business_user_name, business_user_type, business_bill_id, insurance_no, commission_amount, commission_time, commission_type, balance, remark, raw_add_time, raw_update_time from person_commission_detail where (settlement_person_id = ?)</tt>
	 *
	 *	@param settlementPersonId
	 *	@return PersonCommissionDetailDO
	 *	@throws DataAccessException
	 */	 
    public PersonCommissionDetailDO findById(long settlementPersonId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>person_commission_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from person_commission_detail where (settlement_person_id = ?)</tt>
	 *
	 *	@param settlementPersonId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long settlementPersonId) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_person_id, serial_number, business_user_id, business_user_name, business_user_type, business_bill_id, insurance_no, commission_amount, commission_time, commission_type, balance, remark, raw_add_time, raw_update_time from person_commission_detail where (1 = 1)</tt>
	 *
	 *	@param personCommissionDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@param businessUserId
	 *	@param beginDate
	 *	@param endDate
	 *	@return List<PersonCommissionDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<PersonCommissionDetailDO> findByCondition(PersonCommissionDetailDO personCommissionDetail, String sortCol, String sortOrder, long limitStart, long pageSize, long businessUserId, Date beginDate, Date endDate) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from person_commission_detail where (1 = 1)</tt>
	 *
	 *	@param personCommissionDetail
	 *	@param businessUserId
	 *	@param beginDate
	 *	@param endDate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PersonCommissionDetailDO personCommissionDetail, long businessUserId, Date beginDate, Date endDate) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_person_id, serial_number, business_user_id, business_user_name, business_user_type, business_bill_id, insurance_no, commission_amount, commission_time, commission_type, balance, remark, raw_add_time, raw_update_time from person_commission_detail where (business_user_id = ?)</tt>
	 *
	 *	@param businessUserId
	 *	@return List<PersonCommissionDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<PersonCommissionDetailDO> getCommissionInfoDetails(long businessUserId) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_person_id, serial_number, business_user_id, business_user_name, business_user_type, business_bill_id, insurance_no, commission_amount, commission_time, commission_type, balance, remark, raw_add_time, raw_update_time from person_commission_detail where (1 = 1)</tt>
	 *
	 *	@param businessUserId
	 *	@param commissionType
	 *	@param commissionTime
	 *	@return List<PersonCommissionDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<PersonCommissionDetailDO> getPersonCommissionDetail(long businessUserId, String commissionType, String commissionTime) throws DataAccessException;

}