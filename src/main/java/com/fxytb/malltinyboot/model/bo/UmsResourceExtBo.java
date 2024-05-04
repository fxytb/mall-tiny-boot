package com.fxytb.malltinyboot.model.bo;

import com.fxytb.malltinyboot.model.po.mbg.UmsResource;
import com.fxytb.malltinyboot.model.po.mbg.UmsResourceCategory;
import lombok.Data;

@Data
public class UmsResourceExtBo extends UmsResource {
    private UmsResourceCategory category;

}
