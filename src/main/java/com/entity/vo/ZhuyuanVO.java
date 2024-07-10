package com.entity.vo;

import com.entity.ZhuyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 住院
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuyuan")
public class ZhuyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 发布医生
     */

    @TableField(value = "yisheng_id")
    private Integer yishengId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 病房地址
     */

    @TableField(value = "zhuyuan_name")
    private String zhuyuanName;


    /**
     * 房间号
     */

    @TableField(value = "zhuyuan_fangjianhao")
    private String zhuyuanFangjianhao;


    /**
     * 床号
     */

    @TableField(value = "zhuyuan_chuanghao")
    private String zhuyuanChuanghao;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：发布医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：发布医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：病房地址
	 */
    public String getZhuyuanName() {
        return zhuyuanName;
    }


    /**
	 * 获取：病房地址
	 */

    public void setZhuyuanName(String zhuyuanName) {
        this.zhuyuanName = zhuyuanName;
    }
    /**
	 * 设置：房间号
	 */
    public String getZhuyuanFangjianhao() {
        return zhuyuanFangjianhao;
    }


    /**
	 * 获取：房间号
	 */

    public void setZhuyuanFangjianhao(String zhuyuanFangjianhao) {
        this.zhuyuanFangjianhao = zhuyuanFangjianhao;
    }
    /**
	 * 设置：床号
	 */
    public String getZhuyuanChuanghao() {
        return zhuyuanChuanghao;
    }


    /**
	 * 获取：床号
	 */

    public void setZhuyuanChuanghao(String zhuyuanChuanghao) {
        this.zhuyuanChuanghao = zhuyuanChuanghao;
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

}
