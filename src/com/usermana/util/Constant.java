package com.usermana.util;

import javax.annotation.Resource;

@Resource
public class Constant {
    public static  final  String SQL_INSERT_USER = "insert into user (user_name,user_pass) values (?,?)";
}
