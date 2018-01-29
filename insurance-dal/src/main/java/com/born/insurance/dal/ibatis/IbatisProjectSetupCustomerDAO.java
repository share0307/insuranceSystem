/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.ProjectSetupCustomerDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.ProjectSetupCustomerDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.ProjectSetupCustomerDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_setup_customer.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectSetupCustomerDAO extends SqlMapClientDaoSupport implements ProjectSetupCustomerDAO {
	/**
	 *  Insert one <tt>ProjectSetupCustomerDO</tt> object to DB table <tt>project_setup_customer</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_setup_customer(id,project_setup_id,customer_id,customer_name,cert_no,cert_type) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectSetupCustomer
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectSetupCustomerDO projectSetupCustomer) throws DataAccessException {
    	if (projectSetupCustomer == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-SETUP-CUSTOMER-INSERT", projectSetupCustomer);

        return projectSetupCustomer.getId();
    }

	/**
	 *  Update DB table <tt>project_setup_customer</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_setup_customer set project_setup_id=?, customer_id=?, customer_name=?, cert_no=?, cert_type=? where (id = ?)</tt>
	 *
	 *	@param projectSetupCustomer
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectSetupCustomerDO projectSetupCustomer) throws DataAccessException {
    	if (projectSetupCustomer == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-SETUP-CUSTOMER-UPDATE", projectSetupCustomer);
    }

	/**
	 *  Query DB table <tt>project_setup_customer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, project_setup_id, customer_id, customer_name, cert_no, cert_type from project_setup_customer where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectSetupCustomerDO
	 *	@throws DataAccessException
	 */	 
    public ProjectSetupCustomerDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectSetupCustomerDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-SETUP-CUSTOMER-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_setup_customer</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_setup_customer where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-SETUP-CUSTOMER-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>project_setup_customer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, project_setup_id, customer_id, customer_name, cert_no, cert_type from project_setup_customer where (1 = 1)</tt>
	 *
	 *	@param projectSetupCustomer
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectSetupCustomerDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectSetupCustomerDO> findByCondition(ProjectSetupCustomerDO projectSetupCustomer, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (projectSetupCustomer == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectSetupCustomer", projectSetupCustomer);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-SETUP-CUSTOMER-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>project_setup_customer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_setup_customer where (1 = 1)</tt>
	 *
	 *	@param projectSetupCustomer
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectSetupCustomerDO projectSetupCustomer) throws DataAccessException {
    	if (projectSetupCustomer == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PROJECT-SETUP-CUSTOMER-FIND-BY-CONDITION-COUNT", projectSetupCustomer);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>project_setup_customer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, project_setup_id, customer_id, customer_name, cert_no, cert_type from project_setup_customer where (project_setup_id = ?)</tt>
	 *
	 *	@param projectSetupId
	 *	@return List<ProjectSetupCustomerDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectSetupCustomerDO> findListByProjectupId(long projectSetupId) throws DataAccessException {
        Long param = new Long(projectSetupId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-SETUP-CUSTOMER-FIND-LIST-BY-PROJECTUP-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_setup_customer</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_setup_customer where (project_setup_id = ?)</tt>
	 *
	 *	@param projectSetupId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectSetupId(long projectSetupId) throws DataAccessException {
        Long param = new Long(projectSetupId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-SETUP-CUSTOMER-DELETE-BY-PROJECT-SETUP-ID", param);
    }

}