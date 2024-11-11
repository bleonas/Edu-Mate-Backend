package app.bleona.edu_mate.repository;

import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
    List<Course> findByCategory(String category);

    List<Course> findByLevel(String level);

    List<Course> findByTeacher(Teacher teacher);

    List<Course> findByIsAvailableTrue();

    List<Course> findByRatingGreaterThanEqual(Double rating);
    
    List<Course> findAllByOrderByRatingDesc();
}
