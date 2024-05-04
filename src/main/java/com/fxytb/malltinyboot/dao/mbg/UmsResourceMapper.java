package com.fxytb.malltinyboot.dao.mbg;

import com.fxytb.malltinyboot.model.bo.UmsResourceExtBo;
import com.fxytb.malltinyboot.model.po.mbg.UmsMenu;
import com.fxytb.malltinyboot.model.po.mbg.UmsResource;
import com.fxytb.malltinyboot.model.po.mbg.UmsResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceMapper {
    long countByExample(UmsResourceExample example);

    int deleteByExample(UmsResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsResource row);

    int insertSelective(UmsResource row);

    List<UmsResource> selectByExample(UmsResourceExample example);

    UmsResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsResource row, @Param("example") UmsResourceExample example);

    int updateByExample(@Param("row") UmsResource row, @Param("example") UmsResourceExample example);

    int updateByPrimaryKeySelective(UmsResource row);

    int updateByPrimaryKey(UmsResource row);

    List<UmsResourceExtBo> selectResourceExtBosByRoleId(@Param("roleId") Long roleId);


}