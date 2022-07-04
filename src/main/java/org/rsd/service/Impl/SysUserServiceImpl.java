package org.rsd.service.Impl;

import org.rsd.bean.SysUser;
import org.rsd.mapper.ISysUserMapper;
import org.rsd.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private ISysUserMapper sysUserMapper;

    @Override
    public List<SysUser> queryList() {
        List<SysUser> list = sysUserMapper.queryList();
        return list;
    }

    @Override
    public SysUser getById(Integer id) {
        SysUser sysUser = sysUserMapper.getById(id);
        return sysUser;
    }


    @Override
    public void insert(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserMapper.update(sysUser);
    }

    @Override
    public void deleteById(Integer id) {
        sysUserMapper.deleteById(id);
    }

    @Transactional
    @Override
    public void moreDeleteById(Integer id) {
        sysUserMapper.deleteById(id);

        sysUserMapper.deleteById2(id + 1);
    }


}
