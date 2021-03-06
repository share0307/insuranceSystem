/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.InsuranceProtocolInfoDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.InsuranceProtocolInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.InsuranceProtocolInfoDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/insurance_protocol_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisInsuranceProtocolInfoDAO extends SqlMapClientDaoSupport implements InsuranceProtocolInfoDAO {
	/**
	 *  Insert one <tt>InsuranceProtocolInfoDO</tt> object to DB table <tt>insurance_protocol_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into insurance_protocol_info(protocol_info_id,catalog_name,catalog_id,product_name,protocol_user_name,contracting_agency_name,type,product_id,protocol_id,firstPeriod) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param insuranceProtocolInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(InsuranceProtocolInfoDO insuranceProtocolInfo) throws DataAccessException {
    	if (insuranceProtocolInfo == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-INSURANCE-PROTOCOL-INFO-INSERT", insuranceProtocolInfo);

        return insuranceProtocolInfo.getProtocolInfoId();
    }

	/**
	 *  Update DB table <tt>insurance_protocol_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update insurance_protocol_info set catalog_name=?, catalog_id=?, product_name=?, protocol_user_name=?, contracting_agency_name=?, type=?, product_id=?, protocol_id=?, firstPeriod=? where (protocol_info_id = ?)</tt>
	 *
	 *	@param insuranceProtocolInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(InsuranceProtocolInfoDO insuranceProtocolInfo) throws DataAccessException {
    	if (insuranceProtocolInfo == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-INSURANCE-PROTOCOL-INFO-UPDATE", insuranceProtocolInfo);
    }

	/**
	 *  Query DB table <tt>insurance_protocol_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select protocol_info_id, catalog_name, catalog_id, product_name, protocol_user_name, contracting_agency_name, type, product_id, protocol_id, firstPeriod from insurance_protocol_info where (protocol_info_id = ?)</tt>
	 *
	 *	@param protocolInfoId
	 *	@return InsuranceProtocolInfoDO
	 *	@throws DataAccessException
	 */	 
    public InsuranceProtocolInfoDO findById(long protocolInfoId) throws DataAccessException {
        Long param = new Long(protocolInfoId);

        return (InsuranceProtocolInfoDO) getSqlMapClientTemplate().queryForObject("MS-INSURANCE-PROTOCOL-INFO-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>insurance_protocol_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from insurance_protocol_info where (protocol_info_id = ?)</tt>
	 *
	 *	@param protocolInfoId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long protocolInfoId) throws DataAccessException {
        Long param = new Long(protocolInfoId);

        return getSqlMapClientTemplate().delete("MS-INSURANCE-PROTOCOL-INFO-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>insurance_protocol_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from insurance_protocol_info where (protocol_id = ?)</tt>
	 *
	 *	@param protocolId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProtocolId(long protocolId) throws DataAccessException {
        Long param = new Long(protocolId);

        return getSqlMapClientTemplate().delete("MS-INSURANCE-PROTOCOL-INFO-DELETE-BY-PROTOCOL-ID", param);
    }

	/**
	 *  Query DB table <tt>insurance_protocol_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select protocol_info_id, catalog_name, catalog_id, product_name, protocol_user_name, contracting_agency_name, type, product_id, protocol_id, firstPeriod from insurance_protocol_info where (1 = 1)</tt>
	 *
	 *	@param insuranceProtocolInfo
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<InsuranceProtocolInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<InsuranceProtocolInfoDO> findByCondition(InsuranceProtocolInfoDO insuranceProtocolInfo, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (insuranceProtocolInfo == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("insuranceProtocolInfo", insuranceProtocolInfo);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-INSURANCE-PROTOCOL-INFO-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>insurance_protocol_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from insurance_protocol_info where (1 = 1)</tt>
	 *
	 *	@param insuranceProtocolInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(InsuranceProtocolInfoDO insuranceProtocolInfo) throws DataAccessException {
    	if (insuranceProtocolInfo == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-INSURANCE-PROTOCOL-INFO-FIND-BY-CONDITION-COUNT", insuranceProtocolInfo);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}