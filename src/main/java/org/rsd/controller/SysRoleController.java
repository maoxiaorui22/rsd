package org.rsd.controller;

import org.rsd.bean.SysRole;
import org.rsd.bean.SysUser;
import org.rsd.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("sysRole")
public class SysRoleController {
    @Autowired
    private ISysRoleService sysRoleService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView("/admin/jsp/sysRole/list.jsp");
        List<SysRole> list = sysRoleService.queryList();
        mav.addObject("list",list);

        return mav;
    }

    @RequestMapping(value ="detail/{id}",method = RequestMethod.GET)
    public ModelAndView getById(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("/admin/jsp/sysRole/detail.jsp");
        SysRole sysRole = sysRoleService.getById(id);
        mav.addObject("sysRole", sysRole);

        return mav;
    }
    @RequestMapping(value ="toUpdatePage/{id}",method = RequestMethod.GET)
    public ModelAndView toUpdatePage(@PathVariable Integer id) {
        ModelAndView mav = new ModelAndView("/admin/jsp/sysRole/update.jsp");
        SysRole sysRole = sysRoleService.getById(id);
        mav.addObject("sysRole", sysRole);

        return mav;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(SysRole sysRole){
        sysRoleService.insert(sysRole);
        return "redirect:/sysRole/list";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(SysRole sysRole){
        sysRoleService.insert(sysRole);
        return "redirect:/sysRole/list";
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable Integer id){
        sysRoleService.deleteById(id);
        return "redirect:/sysRole/list";
    }
}
