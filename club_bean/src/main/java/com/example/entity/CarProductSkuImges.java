package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductSkuImges)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductSkuImges implements Serializable {
    private static final long serialVersionUID = -59624400603077962L;
    /**
     * id
     */
    private Long id;
    /**
     * 销售属性id
     */
    private Long skuId;
    /**
     * sku图片url
     */
    private String imgUrl;
    
    private Integer imgSort;
    /**
     * 默认图片路径
     */
    private String defaultImg;
}

