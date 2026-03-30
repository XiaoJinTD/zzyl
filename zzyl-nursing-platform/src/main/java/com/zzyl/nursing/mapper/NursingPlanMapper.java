package com.zzyl.nursing.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzyl.nursing.domain.NursingPlan;
import org.apache.ibatis.annotations.Mapper;

/**
 * 护理计划Mapper接口
 * 
 * @author ruoyi
 * @date 2026-03-30
 */
@Mapper
public interface NursingPlanMapper extends BaseMapper<NursingPlan>
{
    /**
     * 查询护理计划列表
     * 
     * @param nursingPlan 护理计划
     * @return 护理计划集合
     */
    public List<NursingPlan> selectNursingPlanList(NursingPlan nursingPlan);
}
