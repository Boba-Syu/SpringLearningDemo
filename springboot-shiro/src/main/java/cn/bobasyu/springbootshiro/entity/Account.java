package cn.bobasyu.springbootshiro.entity;

import lombok.Data;

/**
 * 实体类
 * @author bobasyu
 */
@Data
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String perms;
    private String role;
}
