package com.born.insurance.ws.service.insuranceConditions;
import com.born.insurance.ws.result.base.QueryBaseBatchResult;
import com.born.insurance.ws.result.base.InsuranceBaseResult;
import com.born.insurance.ws.info.insuranceConditions.InsuranceConditionsInfo;
import com.born.insurance.ws.order.insuranceConditions.InsuranceConditionsOrder;
import com.born.insurance.ws.order.insuranceConditions.InsuranceConditionsQueryOrder;

public interface InsuranceConditionsService  {
	/**
     * 保存(新增/修改)
     *
     * @param order 不能为null
     * @return 成功/失败
     */
    InsuranceBaseResult save(InsuranceConditionsOrder order);

    /**
     * 查询信息
     *
     * @param id 单据编号
     * @return 风险预警对象
     */
    InsuranceConditionsInfo findById(long id);



    /**
     * 根据条件查询列表
     *
     * @param queryOrder 查询条件
     * @return 结果集
     */
    QueryBaseBatchResult<InsuranceConditionsInfo> queryList(InsuranceConditionsQueryOrder queryOrder);
	
}	