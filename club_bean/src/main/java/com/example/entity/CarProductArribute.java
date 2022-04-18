package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductArribute)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductArribute implements Serializable {
    private static final long serialVersionUID = -37325992251275269L;
    /**
     * 商品属性id
     */
    private Integer attributeId;
    /**
     * 商品三级分类id
     */
    private Integer catelogId;
    /**
     * 属性名称
     */
    private String attributeName;
    /**
     * 属性类型
     */
    private String attributeType;
    /**
     * 检索类型
     */
    private String searchType;


}

