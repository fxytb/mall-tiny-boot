package com.fxytb.malltinyboot.model.po.mbg;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsAdminLoginLog implements Serializable {
    private Long id;

    private Long adminId;

    private Date createTime;

    private String ip;

    private String address;

    @ApiModelProperty(value="浏览器登录类型")
    private String userAgent;

    private static final long serialVersionUID = 1L;
}