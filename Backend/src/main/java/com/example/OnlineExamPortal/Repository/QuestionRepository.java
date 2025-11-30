package com.example.OnlineExamPortal.Repository;

import com.example.OnlineExamPortal.Model.Question;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
    List<Question> findByExamId(Long examId);
}
