package com.entity.model;

import com.entity.BingshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 病史
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BingshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 发布医生
     */
    private Integer yishengId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 病名
     */
    private String bingshiName;


    /**
     * 病因
     */
    private String bingshiBingyin;


    /**
     * 现状
     */
    private String bingshiXianzhuang;


    /**
     * 药单
     */
    private String bingshiText;


    /**
     * 禁忌
     */
    private String bingshiJinji;


    /**
     * 注意事项
     */
    private String bingshiZhuyishixiang;


    /**
     * 创建时间
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
	 * 获取：发布医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：发布医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：病名
	 */
    public String getBingshiName() {
        return bingshiName;
    }


    /**
	 * 设置：病名
	 */
    public void setBingshiName(String bingshiName) {
        this.bingshiName = bingshiName;
    }
    /**
	 * 获取：病因
	 */
    public String getBingshiBingyin() {
        return bingshiBingyin;
    }


    /**
	 * 设置：病因
	 */
    public void setBingshiBingyin(String bingshiBingyin) {
        this.bingshiBingyin = bingshiBingyin;
    }
    /**
	 * 获取：现状
	 */
    public String getBingshiXianzhuang() {
        return bingshiXianzhuang;
    }


    /**
	 * 设置：现状
	 */
    public void setBingshiXianzhuang(String bingshiXianzhuang) {
        this.bingshiXianzhuang = bingshiXianzhuang;
    }
    /**
	 * 获取：药单
	 */
    public String getBingshiText() {
        return bingshiText;
    }


    /**
	 * 设置：药单
	 */
    public void setBingshiText(String bingshiText) {
        this.bingshiText = bingshiText;
    }
    /**
	 * 获取：禁忌
	 */
    public String getBingshiJinji() {
        return bingshiJinji;
    }


    /**
	 * 设置：禁忌
	 */
    public void setBingshiJinji(String bingshiJinji) {
        this.bingshiJinji = bingshiJinji;
    }
    /**
	 * 获取：注意事项
	 */
    public String getBingshiZhuyishixiang() {
        return bingshiZhuyishixiang;
    }


    /**
	 * 设置：注意事项
	 */
    public void setBingshiZhuyishixiang(String bingshiZhuyishixiang) {
        this.bingshiZhuyishixiang = bingshiZhuyishixiang;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
