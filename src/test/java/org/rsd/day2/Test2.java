package org.rsd.day2;

import org.junit.jupiter.api.Test;
import org.rsd.bean.SysFunction;
import org.rsd.mapper.ISysFunctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
@ContextConfiguration("classpath:spring.xml")
public class Test2 {

    @Autowired
    private ISysFunctionMapper sysFunctionMapper;

    void aa (List<SysFunction> list){
        if (list!=null && !list.isEmpty()){
            for (SysFunction sysFunction:list){
                List<SysFunction> childList = sysFunctionMapper.getListByParentId(sysFunction.getId());
                if (childList!=null && !childList.isEmpty()){
                    sysFunction.setChildList(childList);
                }
            }
        }
    }

    @Test
    public void test1(){
        List<SysFunction> list = sysFunctionMapper.getListByParentId(4);
        for (SysFunction sysFunction:list){
            System.out.println(sysFunction);
        }

    }
}
