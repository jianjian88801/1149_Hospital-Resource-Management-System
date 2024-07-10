package com.entity.vo;

import com.entity.YaopinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 药品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yaopin")
public class YaopinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
