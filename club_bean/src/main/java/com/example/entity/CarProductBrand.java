package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductBrand)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductBrand implements Serializable {
    private static final long serialVersionUID = 602603835633834625L;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌 logo地址
     */
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 检索首字母
     */
    private String firstLetter;
    /**
     * 显示状态 0 不显示 1 显示
     */
    private Integer showStatus;

}

