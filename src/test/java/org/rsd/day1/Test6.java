package org.rsd.day1;

import org.junit.jupiter.api.Test;
import org.rsd.bean.Student;
import org.rsd.dao.IStudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
@ContextConfiguration("classpath:spring.xml")
public class Test6 {

    @Autowired
    private IStudentDAO studentDAO;

    @Test
    public void test1(){
        List<Student> list = studentDAO.queryList();
        System.out.println(list);
    }
}
