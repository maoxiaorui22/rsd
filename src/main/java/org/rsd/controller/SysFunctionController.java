package org.rsd.controller;

import org.rsd.bean.SysFunction;
import org.rsd.service.ISysFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("sysFunction")
public class SysFunctionController {
    @Autowired
    private ISysFunctionService sysFunctionService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView mav =new ModelAndView("/admin/jsp/sysFunction/list.jsp");
        List<SysFunction> list = sysFunctionService.queryList();
        mav.addObject("list",list);

        return mav;
    }

    @RequestMapping(value ="detail/{id}",method = RequestMethod.GET)
    public ModelAndView getById(@PathVariable Integer id){
        ModelAndView mav=new ModelAndView("/admin/jsp/sysFunction/detail.jsp");
        SysFunction sysFunction = sysFunctionService.getById(id);
        mav.addObject("sysFunction",sysFunction);

        return mav;
    }

    @RequestMapping(value ="toUpdatePage/{id}",method = RequestMethod.GET)
    public ModelAndView toUpdatePage(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("/admin/jsp/sysFunction/update.jsp");
        SysFunction sysFunction = sysFunctionService.getById(id);
        mav.addObject("sysFunction", sysFunction);

        return mav;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(SysFunction sysFunction){
        sysFunctionService.insert(sysFunction);
        return "redirect:/sysFunction/list";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(SysFunction sysFunction){
        sysFunctionService.update(sysFunction);
        return "redirect:/sysFunction/list";
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable Integer id){
        sysFunctionService.deleteById(id);
        return "redirect:/sysFunction/list";
    }
}
