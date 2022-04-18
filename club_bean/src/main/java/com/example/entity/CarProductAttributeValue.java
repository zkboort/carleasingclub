package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductAttributeValue)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 712272781499998675L;
    /**
     * id
     */
    private Long id;
    /**
     * 商品id
     */
    private Long spuId;
    /**
     * 商品属性ID
     */
    private Long carProductAttributeId;
    /**
     * 商品名称
     */
    private String carProductAttributeName;
    /**
     * 商品属性值
     */
    private String carProductAttributeValue;
    /**
     * 属性排序
     */
    private String carProductAttributeSort;
    /**
     * 是否显示 0 不显示 1显示
     */
    private Integer quickShow;


}

