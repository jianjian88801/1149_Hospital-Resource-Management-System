package com.dao;

import com.entity.BingshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BingshiView;

/**
 * 病史 Dao 接口
 *
 * @author 
 */
public interface BingshiDao extends BaseMapper<BingshiEntity> {

   List<BingshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
