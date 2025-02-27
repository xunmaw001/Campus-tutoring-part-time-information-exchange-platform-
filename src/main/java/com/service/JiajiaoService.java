package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajiaoEntity;
import java.util.Map;

/**
 * 家教 服务类
 * @author 
 * @since 2021-05-06
 */
public interface JiajiaoService extends IService<JiajiaoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}