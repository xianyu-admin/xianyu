package edu.nf.xianyu.entity;

import lombok.Data;

import java.sql.Date;
import java.text.DateFormat;

/**
 * @author LWP
 * @date 2020/3/6
 * 用户实体
 */
@Data
public class User {

    private int userId;
    private String userNick;
    private String userName;
    private String userBindMoblie;
    private String password;
    private String urlHeadUrl;
    private String userCity;
    private Date userCreateTime;
}