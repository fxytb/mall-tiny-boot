package com.fxytb.malltinyboot;

import com.fxytb.malltinyboot.dao.mbg.UmsAdminMapper;
import com.fxytb.malltinyboot.dao.mbg.UmsRoleMapper;
import com.fxytb.malltinyboot.model.bo.UmsRoleExtBo;
import com.fxytb.malltinyboot.model.bo.UmsRoleUmsWithAdminCountBo;
import com.fxytb.malltinyboot.model.po.mbg.UmsAdmin;
import com.fxytb.malltinyboot.model.po.mbg.UmsAdminExample;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class MallTinyBootApplicationTests {

    @Autowired
    private UmsRoleMapper umsRoleMapper;

    @Test
    void selectRoleMenuExtByRoleIdTest() {
        UmsRoleExtBo umsRoleExtBo = umsRoleMapper.selectRoleMenuExtByRoleId(1l);
        log.info("查询角色-菜单数据成功,内容:{}", umsRoleExtBo);
    }


    @Test
    void selectRoleResourceExtByRoleIdTest() {
        UmsRoleExtBo umsRoleExtBo = umsRoleMapper.selectRoleResourceExtByRoleId(1l);
        log.info("查询角色-资源数据成功,内容:{}", umsRoleExtBo);
    }

    @Test
    void selectRoleResourceWithMenuExtByRoleIdTest() {
        UmsRoleExtBo umsRoleExtBo = umsRoleMapper.selectRoleResourceWithMenuExtByRoleId(1l);
        log.info("查询角色-资源数据成功,内容:{}", umsRoleExtBo);
    }

    @Test
    void selectRoleWithUmsAdminCountTest() {
        List<UmsRoleUmsWithAdminCountBo> umsRoleUmsWithAdminCountBos = umsRoleMapper.selectRoleWithUmsAdminCount();
        log.info("查询角色-用户数数据成功,内容:{}", umsRoleUmsWithAdminCountBos);
    }
}
