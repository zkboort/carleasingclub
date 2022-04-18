package com.example.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (CarProductSpu)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductSpu implements Serializable {
    private static final long serialVersionUID = 293938016793635851L;
    /**
     * 商品id
     */
    private Long spuId;
    /**
     * 所属分类
     */
    private Long catelogId;
    /**
     * 所属品牌
     */
    private Long brandId;
    /**
     * 商品名称
     */
    private String spuName;
    /**
     * 商品描述
     */
    private String spuDescription;
    /**
     * 商品重量
     */
    private Object weight;
    /**
     * 上架状态
     */
    private String publishStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


}

