package com.entity.model;

import com.entity.YaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 药品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YaopinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 药品名称
     */
    private String yaopinName;


    /**
     * 药品图片
     */
    private String yaopinPhoto;


    /**
     * 主要成分
     */
    private String yaopinChyengfen;


    /**
     * 库存
     */
    private Integer yaopinKucunNumber;


    /**
     * 适用范围
     */
    private String yaopinShiyongfanwei;


    /**
     * 备注
     */
    private String yaopinBeizhu;


    /**
     * 价格
     */
    private Double yaopinJiangshi;


    /**
     * 药品类型
     */
    private Integer yaopinTypes;


    /**
     * 详情
     */
    private String yaopinContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：药品名称
	 */
    public String getYaopinName() {
        return yaopinName;
    }


    /**
	 * 设置：药品名称
	 */
    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }
    /**
	 * 获取：药品图片
	 */
    public String getYaopinPhoto() {
        return yaopinPhoto;
    }


    /**
	 * 设置：药品图片
	 */
    public void setYaopinPhoto(String yaopinPhoto) {
        this.yaopinPhoto = yaopinPhoto;
    }
    /**
	 * 获取：主要成分
	 */
    public String getYaopinChyengfen() {
        return yaopinChyengfen;
    }


    /**
	 * 设置：主要成分
	 */
    public void setYaopinChyengfen(String yaopinChyengfen) {
        this.yaopinChyengfen = yaopinChyengfen;
    }
    /**
	 * 获取：库存
	 */
    public Integer getYaopinKucunNumber() {
        return yaopinKucunNumber;
    }


    /**
	 * 设置：库存
	 */
    public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
        this.yaopinKucunNumber = yaopinKucunNumber;
    }
    /**
	 * 获取：适用范围
	 */
    public String getYaopinShiyongfanwei() {
        return yaopinShiyongfanwei;
    }


    /**
	 * 设置：适用范围
	 */
    public void setYaopinShiyongfanwei(String yaopinShiyongfanwei) {
        this.yaopinShiyongfanwei = yaopinShiyongfanwei;
    }
    /**
	 * 获取：备注
	 */
    public String getYaopinBeizhu() {
        return yaopinBeizhu;
    }


    /**
	 * 设置：备注
	 */
    public void setYaopinBeizhu(String yaopinBeizhu) {
        this.yaopinBeizhu = yaopinBeizhu;
    }
    /**
	 * 获取：价格
	 */
    public Double getYaopinJiangshi() {
        return yaopinJiangshi;
    }


    /**
	 * 设置：价格
	 */
    public void setYaopinJiangshi(Double yaopinJiangshi) {
        this.yaopinJiangshi = yaopinJiangshi;
    }
    /**
	 * 获取：药品类型
	 */
    public Integer getYaopinTypes() {
        return yaopinTypes;
    }


    /**
	 * 设置：药品类型
	 */
    public void setYaopinTypes(Integer yaopinTypes) {
        this.yaopinTypes = yaopinTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getYaopinContent() {
        return yaopinContent;
    }


    /**
	 * 设置：详情
	 */
    public void setYaopinContent(String yaopinContent) {
        this.yaopinContent = yaopinContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
