/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.PriceContactLetterDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>price_contact_letter</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface PriceContactLetterDAO {
	/**
	 *  Insert one <tt>PriceContactLetterDO</tt> object to DB table <tt>price_contact_letter</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into price_contact_letter(id,price_type,price_template,catalog_id,catalog_name,business_condition_id,business_conditions,business_user_id,business_user_name,project_setup_id,project_setup_name,name,bill_no,customer_type,customer_user_id,customer_user_name,customer_cert_type,customer_cert_no,creator_id,creator_name,form_id,status,raw_add_time,special_req,ask_date,version,ext) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param priceContactLetter
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PriceContactLetterDO priceContactLetter) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, price_type, price_template, catalog_id, catalog_name, business_condition_id, business_conditions, business_user_id, business_user_name, project_setup_id, project_setup_name, name, bill_no, customer_type, customer_user_id, customer_user_name, customer_cert_type, customer_cert_no, creator_id, creator_name, form_id, status, raw_add_time, raw_update_time, version, ext, special_req, ask_date from price_contact_letter where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return PriceContactLetterDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Update DB table <tt>price_contact_letter</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update price_contact_letter set price_type=?, price_template=?, catalog_id=?, catalog_name=?, business_condition_id=?, business_conditions=?, business_user_id=?, business_user_name=?, project_setup_id=?, project_setup_name=?, name=?, bill_no=?, customer_type=?, customer_user_id=?, customer_user_name=?, customer_cert_type=?, customer_cert_no=?, creator_id=?, creator_name=?, form_id=?, status=?, special_req=?, ask_date=?, version=?, ext=? where (id = ?)</tt>
	 *
	 *	@param priceContactLetter
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PriceContactLetterDO priceContactLetter) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, price_type, price_template, catalog_id, catalog_name, business_condition_id, business_conditions, business_user_id, business_user_name, project_setup_id, project_setup_name, name, bill_no, customer_type, customer_user_id, customer_user_name, customer_cert_type, customer_cert_no, creator_id, creator_name, form_id, status, raw_add_time, raw_update_time, special_req, ask_date, version, ext from price_contact_letter where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return PriceContactLetterDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>price_contact_letter</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, price_type, price_template, catalog_id, catalog_name, business_condition_id, business_conditions, business_user_id, business_user_name, project_setup_id, project_setup_name, name, bill_no, customer_type, customer_user_id, customer_user_name, customer_cert_type, customer_cert_no, creator_id, creator_name, form_id, status, raw_add_time, raw_update_time, special_req, ask_date, version, ext from price_contact_letter where (1 = 1)</tt>
	 *
	 *	@param priceContactLetter
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PriceContactLetterDO>
	 *	@throws DataAccessException
	 */	 
    public List<PriceContactLetterDO> findByCondition(PriceContactLetterDO priceContactLetter, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from price_contact_letter where (1 = 1)</tt>
	 *
	 *	@param priceContactLetter
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PriceContactLetterDO priceContactLetter) throws DataAccessException;

}