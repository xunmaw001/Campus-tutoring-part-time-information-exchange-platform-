package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuqiuEntity;
import java.util.Map;

/**
 * 家教需求 服务类
 * @author 
 * @since 2021-05-06
 */
public interface XuqiuService extends IService<XuqiuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}