package com.taikang.administration.ccm.login.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PermissionBo {
    private Integer perId;
    private String perName;
    private  Integer parentId;
    private  String pageUrl;
    private Integer orderNumber;
    private  Integer permission;
    private  String perDescription;

}
