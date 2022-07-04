package org.rsd.controller;

import org.rsd.bean.SysUser;
import org.rsd.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StuController {
    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("stu1")
    public ModelAndView stu1(){
        ModelAndView modelAndView =new ModelAndView("/jsp/stu.jsp");
        modelAndView.addObject("myName","小叮当");
        return  modelAndView;
    }

    @RequestMapping("stu2")
    public ModelAndView stu2(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("/jsp/stu.jsp");
        modelAndView.addObject("myLike","饼干");
        return  modelAndView;
    }

    @RequestMapping("stu3")
    public ModelAndView stu3(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("/jsp/stu.jsp");
        List<SysUser> list = sysUserService.queryList();
        modelAndView.addObject("list",list);
        return  modelAndView;
    }

    @RequestMapping("stu4")
    public ModelAndView stu4(Integer id){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("/jsp/stu.jsp");
        SysUser sysUser = sysUserService.getById(id);
        modelAndView.addObject("sysUser",sysUser);
        return  modelAndView;
    }


}
