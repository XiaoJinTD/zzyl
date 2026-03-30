package com.zzyl.nursing.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzyl.nursing.domain.NursingProject;
import org.apache.ibatis.annotations.Mapper;

/**
 * 护理项目Mapper接口
 * 
 * @author ruoyi
 * @date 2026-03-30
 */
@Mapper
public interface NursingProjectMapper extends BaseMapper<NursingProject>
{
    /**
     * 查询护理项目列表
     * 
     * @param nursingProject 护理项目
     * @return 护理项目集合
     */
    public List<NursingProject> selectNursingProjectList(NursingProject nursingProject);
}
