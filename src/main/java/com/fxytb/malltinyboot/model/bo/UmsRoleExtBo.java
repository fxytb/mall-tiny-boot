package com.fxytb.malltinyboot.model.bo;

import com.fxytb.malltinyboot.model.po.mbg.UmsMenu;
import com.fxytb.malltinyboot.model.po.mbg.UmsRole;
import lombok.Data;

import java.util.List;

@Data
public class UmsRoleExtBo extends UmsRole {
    private List<UmsResourceExtBo> resources;
    private List<UmsMenu> menus;
}
