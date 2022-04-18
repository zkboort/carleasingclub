package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (CarProductCategory)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CarProductCategory implements Serializable {
    private static final long serialVersionUID = -30586253933700033L;
    /**
     * 分类ID
     */
    private Long id;
    /**
     * 父类id
     */
    private Long parentId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类级别
     */
    private Integer level;
    /**
     * 图标地址
     */
    private String icon;
    
    private Integer sort;
    
    private Integer productCount;
    /**
     * 计量单位
     */
    private String productUnit;
    /**
     * 是否显示 0不显示 1显示
     */
    private Integer showStatus;

}

