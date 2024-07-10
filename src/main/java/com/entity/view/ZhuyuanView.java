package com.entity.view;

import com.entity.ZhuyuanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 住院
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhuyuan")
public class ZhuyuanView extends ZhuyuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yisheng
			/**
			* 医生工号
			*/
			private String yishengUuidNumber;
			/**
			* 医生姓名
			*/
			private String yishengName;
			/**
			* 头像
			*/
			private String yishengPhoto;
			/**
			* 联系方式
			*/
			private String yishengPhone;
			/**
			* 医生身份证号
			*/
			private String yishengIdNumber;
			/**
			* 邮箱
			*/
			private String yishengEmail;
			/**
			* 工作时间
			*/
			private String yishengGongzuoshij;
			/**
			* 挂号须知
			*/
			private String yishengGuahao;
			/**
			* 挂号价格
			*/
			private Double yishengNewMoney;
			/**
			* 职称
			*/
			private String yishengZhichneg;
			/**
			* 科室
			*/
			private Integer yishengTypes;
				/**
				* 科室的值
				*/
				private String yishengValue;
			/**
			* 简介
			*/
			private String yishengContent;
			/**
			* 假删
			*/
			private Integer yishengDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ZhuyuanView() {

	}

	public ZhuyuanView(ZhuyuanEntity zhuyuanEntity) {
		try {
			BeanUtils.copyProperties(this, zhuyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set yisheng

					/**
					* 获取： 医生工号
					*/
					public String getYishengUuidNumber() {
						return yishengUuidNumber;
					}
					/**
					* 设置： 医生工号
					*/
					public void setYishengUuidNumber(String yishengUuidNumber) {
						this.yishengUuidNumber = yishengUuidNumber;
					}

					/**
					* 获取： 医生姓名
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生姓名
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}

					/**
					* 获取： 头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}

					/**
					* 获取： 医生身份证号
					*/
					public String getYishengIdNumber() {
						return yishengIdNumber;
					}
					/**
					* 设置： 医生身份证号
					*/
					public void setYishengIdNumber(String yishengIdNumber) {
						this.yishengIdNumber = yishengIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYishengEmail() {
						return yishengEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYishengEmail(String yishengEmail) {
						this.yishengEmail = yishengEmail;
					}

					/**
					* 获取： 工作时间
					*/
					public String getYishengGongzuoshij() {
						return yishengGongzuoshij;
					}
					/**
					* 设置： 工作时间
					*/
					public void setYishengGongzuoshij(String yishengGongzuoshij) {
						this.yishengGongzuoshij = yishengGongzuoshij;
					}

					/**
					* 获取： 挂号须知
					*/
					public String getYishengGuahao() {
						return yishengGuahao;
					}
					/**
					* 设置： 挂号须知
					*/
					public void setYishengGuahao(String yishengGuahao) {
						this.yishengGuahao = yishengGuahao;
					}

					/**
					* 获取： 挂号价格
					*/
					public Double getYishengNewMoney() {
						return yishengNewMoney;
					}
					/**
					* 设置： 挂号价格
					*/
					public void setYishengNewMoney(Double yishengNewMoney) {
						this.yishengNewMoney = yishengNewMoney;
					}

					/**
					* 获取： 职称
					*/
					public String getYishengZhichneg() {
						return yishengZhichneg;
					}
					/**
					* 设置： 职称
					*/
					public void setYishengZhichneg(String yishengZhichneg) {
						this.yishengZhichneg = yishengZhichneg;
					}

					/**
					* 获取： 科室
					*/
					public Integer getYishengTypes() {
						return yishengTypes;
					}
					/**
					* 设置： 科室
					*/
					public void setYishengTypes(Integer yishengTypes) {
						this.yishengTypes = yishengTypes;
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

					/**
					* 获取： 简介
					*/
					public String getYishengContent() {
						return yishengContent;
					}
					/**
					* 设置： 简介
					*/
					public void setYishengContent(String yishengContent) {
						this.yishengContent = yishengContent;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYishengDelete() {
						return yishengDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYishengDelete(Integer yishengDelete) {
						this.yishengDelete = yishengDelete;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
