package com.dao;

import com.entity.YishengyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengyuyueView;

/**
 * 医生预约 Dao 接口
 *
 * @author 
 */
public interface YishengyuyueDao extends BaseMapper<YishengyuyueEntity> {

   List<YishengyuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
