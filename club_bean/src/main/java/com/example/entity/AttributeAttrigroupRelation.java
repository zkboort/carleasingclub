package com.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (AttributeAttrigroupRelation)实体类
 *
 * @author chennanjaing
 * @since 2022-04-18 19:04:56
 */
@Data
public class AttributeAttrigroupRelation implements Serializable {
    private static final long serialVersionUID = -13297916977959163L;
    /**
     * id
     */
    private Long id;
    /**
     * 属性id
     */
    private Long attributeId;
    /**
     * 属性分组 id
     */
    private Long attributeGroupId;
    /**
     * 属性排序
     */
    private Integer attributeSort;

}

