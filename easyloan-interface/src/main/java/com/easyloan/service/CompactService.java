package com.easyloan.service;

import com.easyloan.bean.beans.LoanContract;
import com.easyloan.bean.beans.RepaymentPlan;

import java.util.List;
import java.util.Map;

/**
 * @program: easyloan
 * @Date: 2018/8/18 14:50
 * @Author: Mr.Xuan
 * @Description:
 */
public interface CompactService {
    /**
     * 查询符合条件的合同集合（分页）
     * @param params 筛选条件
     * @return
     */
    List<LoanContract> queryCompactList(Map<String,Object> params);

    /**
     * 统计符合条件的合同记录数以供分页使用
     * @param params 筛选条件
     * @return
     */
    Integer queryCompactCount(Map<String, Object> params);

    /**
     * 根据合同号查询合同，以供查询分期详情
     * @param loanContractNum
     * @return
     */
    LoanContract queryCompact4Repay(String loanContractNum);

    /**
     * 根据合同号查询所属分期计划（分页）
     * @param loanContractNum
     * @return
     */
    List<RepaymentPlan> queryRepayPlanListByContractNum(String loanContractNum);

    /**
     * 根据合同号统计分期计划记录数以供分页使用
     * @param loanContractNum
     * @return
     */
    Integer queryRepayPlanCountByContractNum(String loanContractNum);
}
