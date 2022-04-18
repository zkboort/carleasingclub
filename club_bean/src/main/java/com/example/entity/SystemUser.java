package com.example.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (SystemUser)实体类
 *
 * @author makejava
 * @since 2022-04-18 19:04:59
 */
@Data
public class SystemUser implements Serializable {
    private static final long serialVersionUID = -50419874391754325L;
    /**
     * 用户表
     */
    private Long id;
    /**
     * 头像地址
     */
    private String headPortrait;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private String sex;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后一次修改密码时间
     */
    private Date lastPasswordResetTime;
    /**
     * 系统用户状态 0 禁用 1启用
     */
    private Integer enabled;
    /**
     * 删除标记  0 删除 1启用
     */
    private Integer  isDel;

}

