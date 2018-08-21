package com.easyloan.compact.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.easyloan.bean.beans.LoanContract;
import com.easyloan.bean.beans.RepaymentPlan;
import com.easyloan.compact.mapper.BorrowerInfoMapper;
import com.easyloan.compact.mapper.ContractAttributeMapper;
import com.easyloan.compact.mapper.LoanContractMapper;
import com.easyloan.compact.mapper.RepaymentPlanMapper;
import com.easyloan.service.CompactService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @program: easyloan
 * @Date: 2018/8/18 14:51
 * @Author: Mr.Xuan
 * @Description:
 */
@Service
public class CompactServiceImpl implements CompactService {
    private static final Logger LOGGER = Logger.getLogger(CompactServiceImpl.class);
    @Autowired
    BorrowerInfoMapper borrowerInfoMapper;
    @Autowired
    LoanContractMapper loanContractMapper;
    @Autowired
    ContractAttributeMapper contractAttributeMapper;
    @Autowired
    RepaymentPlanMapper repaymentPlanMapper;

    @Override
    @Transactional(readOnly = true)
    public List<LoanContract> queryCompactList(Map<String, Object> params) {
        List<LoanContract> loanContractList = loanContractMapper.queryLoanContractsByMap(params);
        return loanContractList;
    }

    @Override
    @Transactional(readOnly = true)
    public Integer queryCompactCount(Map<String, Object> params) {
        Long count = loanContractMapper.queryLoanContractCountByMap(params);
        return count.intValue();
    }

    @Override
    public LoanContract queryCompact4Repay(String loanContractNum) {
        LoanContract loanContract = loanContractMapper.queryCompact4Repay(loanContractNum);
        return loanContract;
    }

    @Override
    public List<RepaymentPlan> queryRepayPlanListByContractNum(String loanContractNum) {
        EntityWrapper<RepaymentPlan> wrapper = new EntityWrapper<>();
        wrapper.eq("LOAN_CONTRACT_NUM",loanContractNum);
        List<RepaymentPlan> repaymentPlanList = repaymentPlanMapper.selectList(wrapper);
        return repaymentPlanList;
    }

    @Override
    public Integer queryRepayPlanCountByContractNum(String loanContractNum) {
        EntityWrapper<RepaymentPlan> wrapper = new EntityWrapper<>();
        wrapper.eq("LOAN_CONTRACT_NUM",loanContractNum);
        Integer total = repaymentPlanMapper.selectCount(wrapper);
        return total;
    }
}
