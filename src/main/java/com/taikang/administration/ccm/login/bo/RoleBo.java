package com.taikang.administration.ccm.login.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class RoleBo {
    private Integer roleId;
    private Integer roleStatus;
    private String roleName;
    private String roleDescription;
    private Integer parentId;
    private Date genTime;

}
