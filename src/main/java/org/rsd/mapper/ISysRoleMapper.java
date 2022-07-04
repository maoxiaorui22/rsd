package org.rsd.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.rsd.bean.SysRole;

import java.util.List;

public interface ISysRoleMapper {
    @Select("select * from bu_sys_role")
    List<SysRole> queryList();

    @Select("select * from bu_sys_role where id=#{id}")
    SysRole getById(Integer id);

    @Insert("insert into bu_sys_role values(null,#{name},#{createTime})")
    void insert(SysRole sysRole);

    @Update("update bu_sys_role set name=#{name},create_time=#{createTime} where id=#{id}")
    void update(SysRole sysRole);

    @Delete("delete from bu_sys_role where id=#{id}")
    void deleteById(Integer id);
}
