package com.em.eddieweb.service;

import com.em.eddieweb.domain.Student;

import java.util.List;

public interface IStudentService {

    int save(Student student);

    List<Student> getStudentPage();

    Student getStudentById(Integer id);

    int delete(Integer id);
}
