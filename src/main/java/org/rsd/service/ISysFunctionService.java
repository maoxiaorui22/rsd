package org.rsd.service;

import org.rsd.bean.SysFunction;

import java.util.List;

public interface ISysFunctionService {

    List<SysFunction> queryList();

    SysFunction getById(Integer id);

    void insert(SysFunction sysFunction);

    void update(SysFunction sysFunction);

    void deleteById(Integer id);

    List<SysFunction> getListByParentId(Integer id);
}
