package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 药品
 *
 * @author 
 * @email
 */
@TableName("yaopin")
public class YaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaopinEntity() {

	}

	public YaopinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 药品名称
     */
    @TableField(value = "yaopin_name")

    private String yaopinName;


    /**
     * 药品图片
     */
    @TableField(value = "yaopin_photo")

    private String yaopinPhoto;


    /**
     * 主要成分
     */
    @TableField(value = "yaopin_chyengfen")

    private String yaopinChyengfen;


    /**
     * 库存
     */
    @TableField(value = "yaopin_kucun_number")

    private Integer yaopinKucunNumber;


    /**
     * 适用范围
     */
    @TableField(value = "yaopin_shiyongfanwei")

    private String yaopinShiyongfanwei;


    /**
     * 备注
     */
    @TableField(value = "yaopin_beizhu")

    private String yaopinBeizhu;


    /**
     * 价格
     */
    @TableField(value = "yaopin_jiangshi")

    private Double yaopinJiangshi;


    /**
     * 药品类型
     */
    @TableField(value = "yaopin_types")

    private Integer yaopinTypes;


    /**
     * 详情
     */
    @TableField(value = "yaopin_content")

    private String yaopinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：药品名称
	 */
    public String getYaopinName() {
        return yaopinName;
    }
    /**
	 * 获取：药品名称
	 */

    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }
    /**
	 * 设置：药品图片
	 */
    public String getYaopinPhoto() {
        return yaopinPhoto;
    }
    /**
	 * 获取：药品图片
	 */

    public void setYaopinPhoto(String yaopinPhoto) {
        this.yaopinPhoto = yaopinPhoto;
    }
    /**
	 * 设置：主要成分
	 */
    public String getYaopinChyengfen() {
        return yaopinChyengfen;
    }
    /**
	 * 获取：主要成分
	 */

    public void setYaopinChyengfen(String yaopinChyengfen) {
        this.yaopinChyengfen = yaopinChyengfen;
    }
    /**
	 * 设置：库存
	 */
    public Integer getYaopinKucunNumber() {
        return yaopinKucunNumber;
    }
    /**
	 * 获取：库存
	 */

    public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
        this.yaopinKucunNumber = yaopinKucunNumber;
    }
    /**
	 * 设置：适用范围
	 */
    public String getYaopinShiyongfanwei() {
        return yaopinShiyongfanwei;
    }
    /**
	 * 获取：适用范围
	 */

    public void setYaopinShiyongfanwei(String yaopinShiyongfanwei) {
        this.yaopinShiyongfanwei = yaopinShiyongfanwei;
    }
    /**
	 * 设置：备注
	 */
    public String getYaopinBeizhu() {
        return yaopinBeizhu;
    }
    /**
	 * 获取：备注
	 */

    public void setYaopinBeizhu(String yaopinBeizhu) {
        this.yaopinBeizhu = yaopinBeizhu;
    }
    /**
	 * 设置：价格
	 */
    public Double getYaopinJiangshi() {
        return yaopinJiangshi;
    }
    /**
	 * 获取：价格
	 */

    public void setYaopinJiangshi(Double yaopinJiangshi) {
        this.yaopinJiangshi = yaopinJiangshi;
    }
    /**
	 * 设置：药品类型
	 */
    public Integer getYaopinTypes() {
        return yaopinTypes;
    }
    /**
	 * 获取：药品类型
	 */

    public void setYaopinTypes(Integer yaopinTypes) {
        this.yaopinTypes = yaopinTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getYaopinContent() {
        return yaopinContent;
    }
    /**
	 * 获取：详情
	 */

    public void setYaopinContent(String yaopinContent) {
        this.yaopinContent = yaopinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yaopin{" +
            "id=" + id +
            ", yaopinName=" + yaopinName +
            ", yaopinPhoto=" + yaopinPhoto +
            ", yaopinChyengfen=" + yaopinChyengfen +
            ", yaopinKucunNumber=" + yaopinKucunNumber +
            ", yaopinShiyongfanwei=" + yaopinShiyongfanwei +
            ", yaopinBeizhu=" + yaopinBeizhu +
            ", yaopinJiangshi=" + yaopinJiangshi +
            ", yaopinTypes=" + yaopinTypes +
            ", yaopinContent=" + yaopinContent +
            ", createTime=" + createTime +
        "}";
    }
}
