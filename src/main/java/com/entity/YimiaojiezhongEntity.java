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
 * 疫苗接种情况
 *
 * @author 
 * @email
 */
@TableName("yimiaojiezhong")
public class YimiaojiezhongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YimiaojiezhongEntity() {

	}

	public YimiaojiezhongEntity(T t) {
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
     * 标题
     */
    @TableField(value = "yimiaojiezhong_name")

    private String yimiaojiezhongName;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 接种状态
     */
    @TableField(value = "yimiaojiezhong_types")

    private Integer yimiaojiezhongTypes;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yimiaojiezhong_time")

    private Date yimiaojiezhongTime;


    /**
     * 备注
     */
    @TableField(value = "yimiaojiezhong_content")

    private String yimiaojiezhongContent;


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
	 * 设置：标题
	 */
    public String getYimiaojiezhongName() {
        return yimiaojiezhongName;
    }
    /**
	 * 获取：标题
	 */

    public void setYimiaojiezhongName(String yimiaojiezhongName) {
        this.yimiaojiezhongName = yimiaojiezhongName;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：接种状态
	 */
    public Integer getYimiaojiezhongTypes() {
        return yimiaojiezhongTypes;
    }
    /**
	 * 获取：接种状态
	 */

    public void setYimiaojiezhongTypes(Integer yimiaojiezhongTypes) {
        this.yimiaojiezhongTypes = yimiaojiezhongTypes;
    }
    /**
	 * 设置：接种时间
	 */
    public Date getYimiaojiezhongTime() {
        return yimiaojiezhongTime;
    }
    /**
	 * 获取：接种时间
	 */

    public void setYimiaojiezhongTime(Date yimiaojiezhongTime) {
        this.yimiaojiezhongTime = yimiaojiezhongTime;
    }
    /**
	 * 设置：备注
	 */
    public String getYimiaojiezhongContent() {
        return yimiaojiezhongContent;
    }
    /**
	 * 获取：备注
	 */

    public void setYimiaojiezhongContent(String yimiaojiezhongContent) {
        this.yimiaojiezhongContent = yimiaojiezhongContent;
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
        return "Yimiaojiezhong{" +
            "id=" + id +
            ", yimiaojiezhongName=" + yimiaojiezhongName +
            ", yonghuId=" + yonghuId +
            ", yimiaojiezhongTypes=" + yimiaojiezhongTypes +
            ", yimiaojiezhongTime=" + yimiaojiezhongTime +
            ", yimiaojiezhongContent=" + yimiaojiezhongContent +
            ", createTime=" + createTime +
        "}";
    }
}
