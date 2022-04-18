package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductSkuSaleAttributeValue)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductSkuSaleAttributeValue implements Serializable {
    private static final long serialVersionUID = 632516959826533613L;
    /**
     * sku销售属性值 id
     */
    private Long id;
    
    private Long skuId;
    
    private Long spuId;
    
    private Integer attributeId;
    
    private String attributeValue;

}

