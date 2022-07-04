package org.rsd.day1;

import org.rsd.bean.SysUser;
import org.rsd.mapper.ISysUserMapper;
import org.rsd.service.ISysUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        String[] names = factory.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
        ISysUserMapper userMapper = factory.getBean(ISysUserMapper.class);
        List<SysUser> list = userMapper.queryList();
//        System.out.println(list);

        ISysUserService bean = factory.getBean(ISysUserService.class);
        List<SysUser> list1 = bean.queryList();
        SysUser sysUser = bean.getById(5);
        System.out.println(list1);
//        System.out.println(sysUser);



        factory.close();

    }
}
