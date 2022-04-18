package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 793682488616063971L;
    
    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 备注
     */
    private String remark;
    /**
     * 数据权限呢
     */
    private String dataScope;
    /**
     * 角色等级
     */
    private String level;
    
    private Date createTime;
    /**
     * 功能权限
     */
    private String promission;
    
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPromission() {
        return promission;
    }

    public void setPromission(String promission) {
        this.promission = promission;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

}

