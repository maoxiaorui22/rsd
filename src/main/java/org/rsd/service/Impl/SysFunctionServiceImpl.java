package org.rsd.service.Impl;

import org.rsd.bean.SysFunction;
import org.rsd.mapper.ISysFunctionMapper;
import org.rsd.service.ISysFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysFunctionServiceImpl implements ISysFunctionService {

    @Autowired
    private ISysFunctionMapper sysFunctionMapper;

    @Override
    public List<SysFunction> queryList() {
        List<SysFunction> list = sysFunctionMapper.queryList();
        return list;
    }

    @Override
    public SysFunction getById(Integer id) {
        SysFunction sysFunction = sysFunctionMapper.getById(id);
        return sysFunction;
    }

    @Override
    public void insert(SysFunction sysFunction) {
        sysFunctionMapper.insert(sysFunction);
    }

    @Override
    public void update(SysFunction sysFunction) {
        sysFunctionMapper.update(sysFunction);
    }


    @Override
    public void deleteById(Integer id) {
        sysFunctionMapper.deleteById(id);
    }

    @Override
    public List<SysFunction> getListByParentId(Integer id) {
        List<SysFunction> list = sysFunctionMapper.getListByParentId(id);
        return list;
    }

}
