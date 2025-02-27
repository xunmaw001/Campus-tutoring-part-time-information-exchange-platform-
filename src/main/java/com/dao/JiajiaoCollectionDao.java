package com.dao;

import com.entity.JiajiaoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaoCollectionView;

/**
 * 家教收藏 Dao 接口
 *
 * @author 
 * @since 2021-05-06
 */
public interface JiajiaoCollectionDao extends BaseMapper<JiajiaoCollectionEntity> {

   List<JiajiaoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
