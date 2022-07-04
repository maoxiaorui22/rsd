package org.rsd.service;

import org.rsd.bean.SysRole;

import java.util.List;

public interface ISysRoleService {
    List<SysRole> queryList();

    SysRole getById(Integer id);

    void insert(SysRole sysRole);

    void update(SysRole sysRole);

    void deleteById(Integer id);
}
