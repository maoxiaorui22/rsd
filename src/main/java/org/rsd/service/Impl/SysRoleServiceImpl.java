package org.rsd.service.Impl;

import org.rsd.bean.SysRole;
import org.rsd.mapper.ISysRoleMapper;
import org.rsd.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    private ISysRoleMapper sysRoleMapper;
    @Override
    public List<SysRole> queryList() {
        List<SysRole> list = sysRoleMapper.queryList();
        return list;
    }

    @Override
    public SysRole getById(Integer id) {
        SysRole sysRole = sysRoleMapper.getById(id);
        return sysRole;
    }

    @Override
    public void insert(SysRole sysRole) {
        sysRoleMapper.insert(sysRole);
    }

    @Override
    public void update(SysRole sysRole) {
        sysRoleMapper.update(sysRole);
    }

    @Override
    public void deleteById(Integer id) {
        sysRoleMapper.deleteById(id);
    }


}
