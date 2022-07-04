package org.rsd.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.rsd.bean.SysUser;

import java.util.List;

public interface ISysUserMapper {

    @Select("select * from bu_sys_user order by id desc")
    List<SysUser>  queryList();

    SysUser getById(Integer id);


    @Insert("insert into bu_sys_user (id,login_name,password,real_name,role_id,sex,tel,create_time) values(null,#{loginName},#{password},#{realName},#{roleId},#{sex},#{tel},#{createTime})")
    void insert(SysUser sysUser);

    @Update("update bu_sys_user set loginName=#{loginName},password=#{password},realName=#{realName},roleId=#{roleId},sex=#{sex},tel=#{tel},createTime=#{creatTime} where id=#{id}")
    void update(SysUser sysUser);

    @Delete("delete from bu_sys_user where id = #{id}")
    void deleteById(Integer id);

    @Delete("delete1 * form bu_sys_user where id=#{id}")
    void deleteById2(Integer id);
}
