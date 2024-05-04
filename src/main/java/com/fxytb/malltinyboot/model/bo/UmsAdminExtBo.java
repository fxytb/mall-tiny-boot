package com.fxytb.malltinyboot.model.bo;

import com.fxytb.malltinyboot.model.po.mbg.UmsAdmin;
import lombok.Data;

import java.util.List;

@Data
public class UmsAdminExtBo extends UmsAdmin {
    private List<UmsRoleExtBo> roles;
}
