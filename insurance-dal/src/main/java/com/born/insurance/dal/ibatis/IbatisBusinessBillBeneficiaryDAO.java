/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.BusinessBillBeneficiaryDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.BusinessBillBeneficiaryDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.BusinessBillBeneficiaryDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/business_bill_beneficiary.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisBusinessBillBeneficiaryDAO extends SqlMapClientDaoSupport implements BusinessBillBeneficiaryDAO {
	/**
	 *  Insert one <tt>BusinessBillBeneficiaryDO</tt> object to DB table <tt>business_bill_beneficiary</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into business_bill_beneficiary(bill_beneficiary_id,beneficiary_user_id,beneficiary_user_name,beneficiary_cert_type,beneficiary_cert_no,beneficiary_val,type,letter_id) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param businessBillBeneficiary
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BusinessBillBeneficiaryDO businessBillBeneficiary) throws DataAccessException {
    	if (businessBillBeneficiary == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-BUSINESS-BILL-BENEFICIARY-INSERT", businessBillBeneficiary);

        return businessBillBeneficiary.getBillBeneficiaryId();
    }

	/**
	 *  Update DB table <tt>business_bill_beneficiary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update business_bill_beneficiary set beneficiary_user_id=?, beneficiary_user_name=?, beneficiary_cert_type=?, beneficiary_cert_no=?, beneficiary_val=?, type=?, letter_id=? where (bill_beneficiary_id = ?)</tt>
	 *
	 *	@param businessBillBeneficiary
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BusinessBillBeneficiaryDO businessBillBeneficiary) throws DataAccessException {
    	if (businessBillBeneficiary == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-BUSINESS-BILL-BENEFICIARY-UPDATE", businessBillBeneficiary);
    }

	/**
	 *  Query DB table <tt>business_bill_beneficiary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select bill_beneficiary_id, beneficiary_user_id, beneficiary_user_name, beneficiary_cert_type, beneficiary_cert_no, beneficiary_val, type, letter_id from business_bill_beneficiary where (bill_beneficiary_id = ?)</tt>
	 *
	 *	@param billBeneficiaryId
	 *	@return BusinessBillBeneficiaryDO
	 *	@throws DataAccessException
	 */	 
    public BusinessBillBeneficiaryDO findById(long billBeneficiaryId) throws DataAccessException {
        Long param = new Long(billBeneficiaryId);

        return (BusinessBillBeneficiaryDO) getSqlMapClientTemplate().queryForObject("MS-BUSINESS-BILL-BENEFICIARY-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>business_bill_beneficiary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from business_bill_beneficiary where (bill_beneficiary_id = ?)</tt>
	 *
	 *	@param billBeneficiaryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long billBeneficiaryId) throws DataAccessException {
        Long param = new Long(billBeneficiaryId);

        return getSqlMapClientTemplate().delete("MS-BUSINESS-BILL-BENEFICIARY-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>business_bill_beneficiary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select bill_beneficiary_id, beneficiary_user_id, beneficiary_user_name, beneficiary_cert_type, beneficiary_cert_no, beneficiary_val, type, letter_id from business_bill_beneficiary where (1 = 1)</tt>
	 *
	 *	@param businessBillBeneficiary
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BusinessBillBeneficiaryDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillBeneficiaryDO> findByCondition(BusinessBillBeneficiaryDO businessBillBeneficiary, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (businessBillBeneficiary == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("businessBillBeneficiary", businessBillBeneficiary);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-BUSINESS-BILL-BENEFICIARY-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>business_bill_beneficiary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from business_bill_beneficiary where (1 = 1)</tt>
	 *
	 *	@param businessBillBeneficiary
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BusinessBillBeneficiaryDO businessBillBeneficiary) throws DataAccessException {
    	if (businessBillBeneficiary == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-BUSINESS-BILL-BENEFICIARY-FIND-BY-CONDITION-COUNT", businessBillBeneficiary);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>business_bill_beneficiary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select bill_beneficiary_id, beneficiary_user_id, beneficiary_user_name, beneficiary_cert_type, beneficiary_cert_no, beneficiary_val, type, letter_id from business_bill_beneficiary where (letter_id = ?)</tt>
	 *
	 *	@param letterId
	 *	@return List<BusinessBillBeneficiaryDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillBeneficiaryDO> findBusinessBillBeneficiarys(long letterId) throws DataAccessException {
        Long param = new Long(letterId);

        return getSqlMapClientTemplate().queryForList("MS-BUSINESS-BILL-BENEFICIARY-FIND-BUSINESS-BILL-BENEFICIARYS", param);

    }

	/**
	 *  Delete records from DB table <tt>business_bill_beneficiary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from business_bill_beneficiary where (letter_id = ?)</tt>
	 *
	 *	@param letterId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByLetterId(long letterId) throws DataAccessException {
        Long param = new Long(letterId);

        return getSqlMapClientTemplate().delete("MS-BUSINESS-BILL-BENEFICIARY-DELETE-BY-LETTER-ID", param);
    }

}