package com.entity.vo;

import com.entity.YishengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 医生
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yisheng")
public class YishengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
