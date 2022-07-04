package org.rsd.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.rsd.bean.SysFunction;

import java.util.List;

public interface ISysFunctionMapper {

    @Select("select * from bu_sys_function")
    List<SysFunction> queryList();

    @Select("select * from bu_sys_function where id=#{id}")
    SysFunction  getById(Integer id);

    @Insert("insert into bu_sys_function values(null,#{name})")
    void insert(SysFunction sysFunction);

    @Update("update bu_sys_function set name=#{name} where id=#{id}")
    void update(SysFunction sysFunction);

    @Delete("delete from bu_sys_function where id=#{id}")
    void deleteById(Integer id);

    @Select("select * from bu_sys_function where parentid=#{id}")
    List<SysFunction> getListByParentId(Integer id);

    @Select("select * from bu_sys_function where childid=#{id}")
    List<SysFunction> getListByChild(Integer id);
}
