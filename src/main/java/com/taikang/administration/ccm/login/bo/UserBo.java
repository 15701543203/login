package com.taikang.administration.ccm.login.bo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserBo {
    private Integer usreId;
    private String tureName;
    private String username;
    private String userPwd;
    private Integer status;
    private String salt;
    private String mobile;
    private String email;

}
