package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductAttributeGroup)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductAttributeGroup implements Serializable {
    private static final long serialVersionUID = 770934685754017326L;
    /**
     * 属性分组id
     */
    private Long attributeGroupId;
    /**
     * 属性分组名称
     */
    private String attributeGroupName;
    /**
     * 属性分组 所属的分类
     */
    private Long carProductCatelogId;
    /**
     * 属性分组的描述信息
     */
    private String attributeGroupDescript;
    /**
     * 属性分组 排序
     */
    private Integer attributeGroupSort;
    /**
     * 属性分组的图标 url
     */
    private String attributeGroupIcon;



}

