package org.rsd.day1;

import org.junit.jupiter.api.Test;
import org.rsd.controller.SysUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:spring.xml")
public class Test5 {

    @Autowired
    private SysUserController sysUserController;

//    @Test
//    public  void test1(){
//        sysUserController.list();
//    }
//
//    @Test
//    public  void test2(){
//        sysUserController.toUpdatePage(5);
//    }
    @Test
    public  void test3(){
        sysUserController.list();
    }
}
