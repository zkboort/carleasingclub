package com.example.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (CustomUser)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class CustomUser implements Serializable {
    private static final long serialVersionUID = -63655170918829102L;
    /**
     * ID
     */
    private Object  uid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 生日
     */
    private Integer birthday;
    /**
     * 身份证号
     */
    private String cardId;
    /**
     * 用户类型
     */
    private String userType;
    /**
     * 用户备注
     */
    private String mark;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 头像地址
     */
    private String headPortrait;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 最后一次登录时间
     */
    private Date lastLoginTime;
    /**
     * 添加登录ip
     */
    private String addIp;
    /**
     * 最后一次登录ip
     */
    private String lastLoginIp;
    /**
     * 余额
     */
    private Double nowBalance;
    /**
     * 积分
     */
    private Double integral;
    /**
     * 用户等级
     */
    private Integer level;
    /**
     * 用户状态 0 禁用 1启用
     */
    private Integer enabled;
    /**
     * 详细地址
     */
    private String addres;
    /**
     * 用户登录类型 微信 routine h5
     */
    private String loginType;
    /**
     * 删除标记 0 删除 1未删除
     */
    private Integer isDel;

}

