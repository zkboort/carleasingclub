package com.example.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysMenu)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class SysMenu implements Serializable {
    private static final long serialVersionUID = -48096623046774591L;
    
    private Long id;
    /**
     * 是否外链
     */
    private Object isFrame;
    /**
     * 菜单名称
     */
    private String name;
    
    private String component;
    /**
     * 组件名称
     */
    private String componentName;
    /**
     * 父菜单id
     */
    private Long fatherId;
    /**
     * 排序
     */
    private Long sort;
    /**
     * 图标
     */
    private String icon;
    /**
     * 链接地址
     */
    private String path;
    /**
     * 是否缓存 布尔值
     */
    private Object cache;
    /**
     * 是否隐藏 布尔值
     */
    private Object hidden;
    /**
     * 权限
     */
    private String permission;
    
    private Integer type;
    /**
     * 创建日期
     */
    private Date createTime;
    /**
     * 修改日期
     */
    private Date updateTime;
    /**
     * 删除标记
     */
    private Integer isDel;
}

