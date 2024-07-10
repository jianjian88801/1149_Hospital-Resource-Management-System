package com.entity.model;

import com.entity.ZhuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 住院
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuyuanModel implements Serializable {
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
     * 病房地址
     */
    private String zhuyuanName;


    /**
     * 房间号
     */
    private String zhuyuanFangjianhao;


    /**
     * 床号
     */
    private String zhuyuanChuanghao;


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
	 * 获取：病房地址
	 */
    public String getZhuyuanName() {
        return zhuyuanName;
    }


    /**
	 * 设置：病房地址
	 */
    public void setZhuyuanName(String zhuyuanName) {
        this.zhuyuanName = zhuyuanName;
    }
    /**
	 * 获取：房间号
	 */
    public String getZhuyuanFangjianhao() {
        return zhuyuanFangjianhao;
    }


    /**
	 * 设置：房间号
	 */
    public void setZhuyuanFangjianhao(String zhuyuanFangjianhao) {
        this.zhuyuanFangjianhao = zhuyuanFangjianhao;
    }
    /**
	 * 获取：床号
	 */
    public String getZhuyuanChuanghao() {
        return zhuyuanChuanghao;
    }


    /**
	 * 设置：床号
	 */
    public void setZhuyuanChuanghao(String zhuyuanChuanghao) {
        this.zhuyuanChuanghao = zhuyuanChuanghao;
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
