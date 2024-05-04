package com.fxytb.malltinyboot.dao.mbg;

import com.fxytb.malltinyboot.model.bo.UmsRoleExtBo;
import com.fxytb.malltinyboot.model.bo.UmsRoleUmsWithAdminCountBo;
import com.fxytb.malltinyboot.model.po.mbg.UmsRole;
import com.fxytb.malltinyboot.model.po.mbg.UmsRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsRoleMapper {
    long countByExample(UmsRoleExample example);

    int deleteByExample(UmsRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRole row);

    int insertSelective(UmsRole row);

    List<UmsRole> selectByExample(UmsRoleExample example);

    UmsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsRole row, @Param("example") UmsRoleExample example);

    int updateByExample(@Param("row") UmsRole row, @Param("example") UmsRoleExample example);

    int updateByPrimaryKeySelective(UmsRole row);

    int updateByPrimaryKey(UmsRole row);

    UmsRoleExtBo selectRoleMenuExtByRoleId(@Param("roleId") Long roleId);

    UmsRoleExtBo selectRoleResourceExtByRoleId(@Param("roleId") Long roleId);

    UmsRoleExtBo selectRoleResourceWithMenuExtByRoleId(@Param("roleId") Long roleId);

    List<UmsRoleUmsWithAdminCountBo> selectRoleWithUmsAdminCount();

}