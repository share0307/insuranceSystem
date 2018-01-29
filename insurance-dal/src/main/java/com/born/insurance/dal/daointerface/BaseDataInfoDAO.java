/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.BaseDataInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>base_data_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/base_data_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface BaseDataInfoDAO {
	/**
	 *  Insert one <tt>BaseDataInfoDO</tt> object to DB table <tt>base_data_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into base_data_info(id,name,code,seq,type,parent_id,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param baseDataInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BaseDataInfoDO baseDataInfo) throws DataAccessException;

	/**
	 *  Update DB table <tt>base_data_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update base_data_info set name=?, code=?, seq=?, type=?, parent_id=? where (id = ?)</tt>
	 *
	 *	@param baseDataInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BaseDataInfoDO baseDataInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>base_data_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, name, code, seq, type, parent_id, raw_add_time, raw_update_time from base_data_info where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return BaseDataInfoDO
	 *	@throws DataAccessException
	 */	 
    public BaseDataInfoDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>base_data_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from base_data_info where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>base_data_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, name, code, seq, type, parent_id, raw_add_time, raw_update_time from base_data_info where (1 = 1)</tt>
	 *
	 *	@param baseDataInfo
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BaseDataInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<BaseDataInfoDO> findByCondition(BaseDataInfoDO baseDataInfo, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>base_data_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from base_data_info where (1 = 1)</tt>
	 *
	 *	@param baseDataInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BaseDataInfoDO baseDataInfo) throws DataAccessException;

}