package com.fxytb.malltinyboot.dao.mbg;

import com.fxytb.malltinyboot.model.po.mbg.UmsMenu;
import com.fxytb.malltinyboot.model.po.mbg.UmsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMenuMapper {
    long countByExample(UmsMenuExample example);

    int deleteByExample(UmsMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMenu row);

    int insertSelective(UmsMenu row);

    List<UmsMenu> selectByExample(UmsMenuExample example);

    UmsMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMenu row, @Param("example") UmsMenuExample example);

    int updateByExample(@Param("row") UmsMenu row, @Param("example") UmsMenuExample example);

    int updateByPrimaryKeySelective(UmsMenu row);

    int updateByPrimaryKey(UmsMenu row);

    List<UmsMenu> selectMenusByRoleId(@Param("roleId") Long roleId);
}