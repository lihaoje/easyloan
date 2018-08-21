package com.easyloan.compact.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.easyloan.bean.beans.LoanContract;
import com.easyloan.bean.beans.RepaymentPlan;
import com.easyloan.service.CompactService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @program: easyloan
 * @Date: 2018/8/18 13:45
 * @Author: Mr.Xuan
 * @Description:查询模块控制器
 */
@Controller
public class CompactController {
    private static final Logger LOGGER = Logger.getLogger(CompactController.class);
    @Reference
    CompactService compactService;

    /**
     * 跳转到后台管理首页
     */
    @RequestMapping("index")
    public String index(){
        return "smp";
    }
    /**
     * 跳转合同列表
     */
    @RequestMapping("compactList")
    public String cpList(){
        return "cpList";
    }
    /**
     * 跳转还款情况
     */
    @RequestMapping("queryRepayInfo")
    public String repayInfo(String loanContractNum, Model model){
        LoanContract loanContract = compactService.queryCompact4Repay(loanContractNum);
        model.addAttribute(loanContract);
        return "common/repayInfo";
    }
    /**
     * 查询分期计划
     */
    @RequestMapping("queryRepayPlanList")
    @ResponseBody
    public Map<String,Object> queryRepayPlanList(@RequestParam Map params){
        String loanContractNum = (String) params.get("loanContractNum");
        sumPageParam(params);
        List<RepaymentPlan> repayPlanList = compactService.queryRepayPlanListByContractNum(loanContractNum);
        Integer total = compactService.queryRepayPlanCountByContractNum(loanContractNum);
        return handlerResult(total,repayPlanList);
    }
    /**
     * 查询合同列表
     * @param params 筛选参数
     */
    @RequestMapping("queryCompactList")
    @ResponseBody
    public Map<String,Object> queryCompactList(@RequestParam Map<String,Object> params){
        sumPageParam(params);
        List<LoanContract> loanContracts = compactService.queryCompactList(params);
        Integer total = compactService.queryCompactCount(params);
        return handlerResult(total,loanContracts);
    }

    /**
     * 封装查询结果为easyUI的pagination所需的格式
     * @param total 总记录数
     * @param res 结果集合
     */
    private Map handlerResult(Integer total,List res){
        Map<String,Object> result = new HashMap<>();
        result.put("total",total);
        result.put("rows",res);
        return result;
    }

    /**
     * 根据easyUI传递的page，rows封装准备sql中的from，size
     */
    private Map sumPageParam(Map params){
        Integer now = (Integer.parseInt((String) params.get("page"))-1)*Integer.parseInt((String) params.get("rows"));
        params.put("pageNo",now);
        params.put("pageSize",Integer.parseInt((String) params.get("rows")));
        return params;
    }
}
