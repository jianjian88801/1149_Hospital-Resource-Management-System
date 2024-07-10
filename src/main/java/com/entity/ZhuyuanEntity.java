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
 * 住院
 *
 * @author 
 * @email
 */
@TableName("zhuyuan")
public class ZhuyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhuyuanEntity() {

	}

	public ZhuyuanEntity(T t) {
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

    @Override
    public String toString() {
        return "Zhuyuan{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", yonghuId=" + yonghuId +
            ", zhuyuanName=" + zhuyuanName +
            ", zhuyuanFangjianhao=" + zhuyuanFangjianhao +
            ", zhuyuanChuanghao=" + zhuyuanChuanghao +
            ", createTime=" + createTime +
        "}";
    }
}
