package org.rsd.day2;

import org.junit.jupiter.api.Test;
import org.rsd.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:spring.xml")
public class Test1 {

    @Autowired
    private ISysUserService sysUserService;

    @Test
    public void test1(){
        sysUserService.moreDeleteById(18);
    }
}
