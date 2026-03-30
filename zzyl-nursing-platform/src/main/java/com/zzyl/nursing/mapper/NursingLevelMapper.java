package com.zzyl.nursing.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzyl.nursing.domain.NursingLevel;
import org.apache.ibatis.annotations.Mapper;

/**
 * 护理等级Mapper接口
 * 
 * @author ruoyi
 * @date 2026-03-30
 */
@Mapper
public interface NursingLevelMapper extends BaseMapper<NursingLevel>
{
    /**
     * 查询护理等级列表
     * 
     * @param nursingLevel 护理等级
     * @return 护理等级集合
     */
    public List<NursingLevel> selectNursingLevelList(NursingLevel nursingLevel);
}
