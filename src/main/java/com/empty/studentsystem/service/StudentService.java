package com.empty.studentsystem.service;

import com.empty.studentsystem.model.Student;


import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
