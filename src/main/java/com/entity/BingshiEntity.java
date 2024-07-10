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
 * 病史
 *
 * @author 
 * @email
 */
@TableName("bingshi")
public class BingshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BingshiEntity() {

	}

	public BingshiEntity(T t) {
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
     * 病名
     */
    @TableField(value = "bingshi_name")

    private String bingshiName;


    /**
     * 病因
     */
    @TableField(value = "bingshi_bingyin")

    private String bingshiBingyin;


    /**
     * 现状
     */
    @TableField(value = "bingshi_xianzhuang")

    private String bingshiXianzhuang;


    /**
     * 药单
     */
    @TableField(value = "bingshi_text")

    private String bingshiText;


    /**
     * 禁忌
     */
    @TableField(value = "bingshi_jinji")

    private String bingshiJinji;


    /**
     * 注意事项
     */
    @TableField(value = "bingshi_zhuyishixiang")

    private String bingshiZhuyishixiang;


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
	 * 设置：病名
	 */
    public String getBingshiName() {
        return bingshiName;
    }
    /**
	 * 获取：病名
	 */

    public void setBingshiName(String bingshiName) {
        this.bingshiName = bingshiName;
    }
    /**
	 * 设置：病因
	 */
    public String getBingshiBingyin() {
        return bingshiBingyin;
    }
    /**
	 * 获取：病因
	 */

    public void setBingshiBingyin(String bingshiBingyin) {
        this.bingshiBingyin = bingshiBingyin;
    }
    /**
	 * 设置：现状
	 */
    public String getBingshiXianzhuang() {
        return bingshiXianzhuang;
    }
    /**
	 * 获取：现状
	 */

    public void setBingshiXianzhuang(String bingshiXianzhuang) {
        this.bingshiXianzhuang = bingshiXianzhuang;
    }
    /**
	 * 设置：药单
	 */
    public String getBingshiText() {
        return bingshiText;
    }
    /**
	 * 获取：药单
	 */

    public void setBingshiText(String bingshiText) {
        this.bingshiText = bingshiText;
    }
    /**
	 * 设置：禁忌
	 */
    public String getBingshiJinji() {
        return bingshiJinji;
    }
    /**
	 * 获取：禁忌
	 */

    public void setBingshiJinji(String bingshiJinji) {
        this.bingshiJinji = bingshiJinji;
    }
    /**
	 * 设置：注意事项
	 */
    public String getBingshiZhuyishixiang() {
        return bingshiZhuyishixiang;
    }
    /**
	 * 获取：注意事项
	 */

    public void setBingshiZhuyishixiang(String bingshiZhuyishixiang) {
        this.bingshiZhuyishixiang = bingshiZhuyishixiang;
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
        return "Bingshi{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", yonghuId=" + yonghuId +
            ", bingshiName=" + bingshiName +
            ", bingshiBingyin=" + bingshiBingyin +
            ", bingshiXianzhuang=" + bingshiXianzhuang +
            ", bingshiText=" + bingshiText +
            ", bingshiJinji=" + bingshiJinji +
            ", bingshiZhuyishixiang=" + bingshiZhuyishixiang +
            ", createTime=" + createTime +
        "}";
    }
}
