package com.easyloan.compact.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.easyloan.bean.beans.LoanContract;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @program: easyloan
 * @Date: 2018/8/19 2:53
 * @Author: Mr.Xuan
 * @Description:
 */
public interface LoanContractMapper extends BaseMapper<LoanContract> {
    List<LoanContract> queryLoanContractsByMap(Map<String,Object> params);
    Long queryLoanContractCountByMap(Map<String,Object> params);
    LoanContract queryCompact4Repay(@Param("loanContractNum") String loanContractNum);
}
