package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();
    void addStudent(Student student);
    void deleteStudentById(Integer id);
    void updateStudent(Student student);

    List<Student> findByName(String name);
}