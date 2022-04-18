package com.example.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Picture)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class Picture implements Serializable {
    private static final long serialVersionUID = 195342819768723448L;
    /**
     * ID
     */
    private Integer id;
    /**
     * 上传时间
     */
    private Date createTime;
    /**
     * 删除的url
     */
    private String deleteUrl;
    /**
     * 图片名称
     */
    private String pictureName;
    /**
     * 图片高度
     */
    private String height;
    /**
     * 图片宽度
     */
    private String width;
    /**
     * 图片大小
     */
    private String size;
    /**
     * 图片地址
     */
    private String url;
    
    private String username;
    /**
     * 文件的MD5值
     */
    private String md5code;



}

