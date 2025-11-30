package com.example.OnlineExamPortal.Repository;

import com.example.OnlineExamPortal.Model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {
}
