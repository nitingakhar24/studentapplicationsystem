package com.student.application.service;

import com.student.application.model.Student;

import java.util.List;

public interface StudentService {
    /**
     * Create a new Student
     * @param student
     * @return Student
     */
    Student addStudent(Student student);

    /**
     * Get a list of all the students
     * @return List<Student>
     */
    List<Student> getStudents();

    /**
     * Update a specific student
     * @param student
     * @param id
     * @return Student
     */
    Student updateStudent(Student student, Long id);

    /**
     * Get Student details by ID
     * @param id
     * @return Student
     */
    Student getStudentById(Long id);

    /**
     * Deletes a particular student
     * @param id
     */
    void deleteStudent(Long id);



}
