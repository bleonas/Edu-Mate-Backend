package app.bleona.edu_mate.repository;

import app.bleona.edu_mate.model.Teacher;
import app.bleona.edu_mate.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findByDepartment(String department);

    List<Teacher> findByCourses_Id(Long courseId);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

}
