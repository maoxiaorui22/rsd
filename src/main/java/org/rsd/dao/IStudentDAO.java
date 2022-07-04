package org.rsd.dao;

import org.rsd.bean.Student;

import java.util.List;

public interface IStudentDAO {
    List<Student> queryList();

    Student getById(Integer id);

    void insert(Student student);

    void update(Integer id);

    void delete(Integer id);
}
