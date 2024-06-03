package org.example.anoada_nohayla_tp4_2.repository;

import org.example.anoada_nohayla_tp4_2.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String>
{
    Student findByCode(String code);
    List<Student> findByProgramId(String programId);
}
