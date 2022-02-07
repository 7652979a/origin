package com.originbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.originbackend.entity.SysJobLog;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 定时任务调度日志表 Mapper 接口
 * </p>
 *
 * @author wpc
 * @since 2022-02-07
 */
@Repository
public interface SysJobLogMapper extends BaseMapper<SysJobLog> {

}
