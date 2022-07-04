package org.rsd.day1;

import org.junit.jupiter.api.Test;
import org.rsd.controller.SysUserController;
import org.rsd.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:spring.xml")
public class Test3 {

    @Autowired
    private SysUserController sysUserController;

    @Autowired
    private ISysRoleService sysRoleService;

    @Test
    public void test1(){
        sysUserController.list();
    }

    @Test
    public void test2(){
        sysRoleService.getById(5);
    }
}
