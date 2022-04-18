package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductSku)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductSku implements Serializable {
    private static final long serialVersionUID = 148142091169474355L;
    
    private Long skuId;
    /**
     * 所属三级分类
     */
    private Long catelogId;
    
    private Long brandId;
    /**
     * 商品id
     */
    private Long spuId;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * sku描述
     */
    private String skuDescript;
    /**
     * sku默认图片url
     */
    private String skuDefaultImg;
    /**
     * sku标题
     */
    private String skuTitle;
    /**
     * 副标题
     */
    private String skuSubtitle;
    /**
     * 价格
     */
    private Double price;
    /**
     * 库存
     */
    private Long saleCount;

}

