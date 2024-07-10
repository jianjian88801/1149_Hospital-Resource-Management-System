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
 * 医生
 *
 * @author 
 * @email
 */
@TableName("yisheng")
public class YishengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengEntity() {

	}

	public YishengEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 医生工号
     */
    @TableField(value = "yisheng_uuid_number")

    private String yishengUuidNumber;


    /**
     * 医生姓名
     */
    @TableField(value = "yisheng_name")

    private String yishengName;


    /**
     * 头像
     */
    @TableField(value = "yisheng_photo")

    private String yishengPhoto;


    /**
     * 联系方式
     */
    @TableField(value = "yisheng_phone")

    private String yishengPhone;


    /**
     * 医生身份证号
     */
    @TableField(value = "yisheng_id_number")

    private String yishengIdNumber;


    /**
     * 邮箱
     */
    @TableField(value = "yisheng_email")

    private String yishengEmail;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 工作时间
     */
    @TableField(value = "yisheng_gongzuoshij")

    private String yishengGongzuoshij;


    /**
     * 挂号须知
     */
    @TableField(value = "yisheng_guahao")

    private String yishengGuahao;


    /**
     * 挂号价格
     */
    @TableField(value = "yisheng_new_money")

    private Double yishengNewMoney;


    /**
     * 职称
     */
    @TableField(value = "yisheng_zhichneg")

    private String yishengZhichneg;


    /**
     * 科室
     */
    @TableField(value = "yisheng_types")

    private Integer yishengTypes;


    /**
     * 简介
     */
    @TableField(value = "yisheng_content")

    private String yishengContent;


    /**
     * 假删
     */
    @TableField(value = "yisheng_delete")

    private Integer yishengDelete;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：医生工号
	 */
    public String getYishengUuidNumber() {
        return yishengUuidNumber;
    }
    /**
	 * 获取：医生工号
	 */

    public void setYishengUuidNumber(String yishengUuidNumber) {
        this.yishengUuidNumber = yishengUuidNumber;
    }
    /**
	 * 设置：医生姓名
	 */
    public String getYishengName() {
        return yishengName;
    }
    /**
	 * 获取：医生姓名
	 */

    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 设置：头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 设置：联系方式
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 设置：医生身份证号
	 */
    public String getYishengIdNumber() {
        return yishengIdNumber;
    }
    /**
	 * 获取：医生身份证号
	 */

    public void setYishengIdNumber(String yishengIdNumber) {
        this.yishengIdNumber = yishengIdNumber;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYishengEmail() {
        return yishengEmail;
    }
    /**
	 * 获取：邮箱
	 */

    public void setYishengEmail(String yishengEmail) {
        this.yishengEmail = yishengEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：工作时间
	 */
    public String getYishengGongzuoshij() {
        return yishengGongzuoshij;
    }
    /**
	 * 获取：工作时间
	 */

    public void setYishengGongzuoshij(String yishengGongzuoshij) {
        this.yishengGongzuoshij = yishengGongzuoshij;
    }
    /**
	 * 设置：挂号须知
	 */
    public String getYishengGuahao() {
        return yishengGuahao;
    }
    /**
	 * 获取：挂号须知
	 */

    public void setYishengGuahao(String yishengGuahao) {
        this.yishengGuahao = yishengGuahao;
    }
    /**
	 * 设置：挂号价格
	 */
    public Double getYishengNewMoney() {
        return yishengNewMoney;
    }
    /**
	 * 获取：挂号价格
	 */

    public void setYishengNewMoney(Double yishengNewMoney) {
        this.yishengNewMoney = yishengNewMoney;
    }
    /**
	 * 设置：职称
	 */
    public String getYishengZhichneg() {
        return yishengZhichneg;
    }
    /**
	 * 获取：职称
	 */

    public void setYishengZhichneg(String yishengZhichneg) {
        this.yishengZhichneg = yishengZhichneg;
    }
    /**
	 * 设置：科室
	 */
    public Integer getYishengTypes() {
        return yishengTypes;
    }
    /**
	 * 获取：科室
	 */

    public void setYishengTypes(Integer yishengTypes) {
        this.yishengTypes = yishengTypes;
    }
    /**
	 * 设置：简介
	 */
    public String getYishengContent() {
        return yishengContent;
    }
    /**
	 * 获取：简介
	 */

    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getYishengDelete() {
        return yishengDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setYishengDelete(Integer yishengDelete) {
        this.yishengDelete = yishengDelete;
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
        return "Yisheng{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yishengUuidNumber=" + yishengUuidNumber +
            ", yishengName=" + yishengName +
            ", yishengPhoto=" + yishengPhoto +
            ", yishengPhone=" + yishengPhone +
            ", yishengIdNumber=" + yishengIdNumber +
            ", yishengEmail=" + yishengEmail +
            ", sexTypes=" + sexTypes +
            ", yishengGongzuoshij=" + yishengGongzuoshij +
            ", yishengGuahao=" + yishengGuahao +
            ", yishengNewMoney=" + yishengNewMoney +
            ", yishengZhichneg=" + yishengZhichneg +
            ", yishengTypes=" + yishengTypes +
            ", yishengContent=" + yishengContent +
            ", yishengDelete=" + yishengDelete +
            ", createTime=" + createTime +
        "}";
    }
}
