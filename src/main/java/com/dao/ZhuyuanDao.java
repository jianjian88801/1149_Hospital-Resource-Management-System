package com.dao;

import com.entity.ZhuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuyuanView;

/**
 * 住院 Dao 接口
 *
 * @author 
 */
public interface ZhuyuanDao extends BaseMapper<ZhuyuanEntity> {

   List<ZhuyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
