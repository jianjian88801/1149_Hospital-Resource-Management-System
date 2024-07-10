package com.entity.view;

import com.entity.YishengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 医生
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yisheng")
public class YishengView extends YishengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 科室的值
		*/
		private String yishengValue;



	public YishengView() {

	}

	public YishengView(YishengEntity yishengEntity) {
		try {
			BeanUtils.copyProperties(this, yishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 科室的值
			*/
			public String getYishengValue() {
				return yishengValue;
			}
			/**
			* 设置： 科室的值
			*/
			public void setYishengValue(String yishengValue) {
				this.yishengValue = yishengValue;
			}











}
