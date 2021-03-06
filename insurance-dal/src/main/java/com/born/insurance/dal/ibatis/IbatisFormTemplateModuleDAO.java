/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.FormTemplateModuleDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.FormTemplateModuleDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.FormTemplateModuleDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_template_module.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFormTemplateModuleDAO extends SqlMapClientDaoSupport implements FormTemplateModuleDAO {
	/**
	 *  Insert one <tt>FormTemplateModuleDO</tt> object to DB table <tt>form_template_module</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_template_module(id,tab_id,parent_module_id,name,code,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formTemplateModule
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormTemplateModuleDO formTemplateModule) throws DataAccessException {
    	if (formTemplateModule == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-FORM-TEMPLATE-MODULE-INSERT", formTemplateModule);

        return formTemplateModule.getId();
    }

	/**
	 *  Update DB table <tt>form_template_module</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_template_module set tab_id=?, parent_module_id=?, name=?, code=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param formTemplateModule
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormTemplateModuleDO formTemplateModule) throws DataAccessException {
    	if (formTemplateModule == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-FORM-TEMPLATE-MODULE-UPDATE", formTemplateModule);
    }

	/**
	 *  Query DB table <tt>form_template_module</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, tab_id, parent_module_id, name, code, sort_order, raw_add_time, raw_update_time from form_template_module where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FormTemplateModuleDO
	 *	@throws DataAccessException
	 */	 
    public FormTemplateModuleDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FormTemplateModuleDO) getSqlMapClientTemplate().queryForObject("MS-FORM-TEMPLATE-MODULE-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>form_template_module</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_template_module where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-FORM-TEMPLATE-MODULE-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>form_template_module</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, tab_id, parent_module_id, name, code, sort_order, raw_add_time, raw_update_time from form_template_module where (1 = 1)</tt>
	 *
	 *	@param formTemplateModule
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FormTemplateModuleDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormTemplateModuleDO> findByCondition(FormTemplateModuleDO formTemplateModule, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (formTemplateModule == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("formTemplateModule", formTemplateModule);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-FORM-TEMPLATE-MODULE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>form_template_module</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_template_module where (1 = 1)</tt>
	 *
	 *	@param formTemplateModule
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormTemplateModuleDO formTemplateModule) throws DataAccessException {
    	if (formTemplateModule == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-FORM-TEMPLATE-MODULE-FIND-BY-CONDITION-COUNT", formTemplateModule);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}