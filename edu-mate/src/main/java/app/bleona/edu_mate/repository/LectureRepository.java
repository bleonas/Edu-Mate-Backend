package app.bleona.edu_mate.repository;

import app.bleona.edu_mate.model.Lecture;
import app.bleona.edu_mate.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
    
    List<Lecture> findByCourse(Course course);

    List<Lecture> findByCourseOrderByOrderAsc(Course course);

    List<Lecture> findByDurationGreaterThan(Integer duration);

    Lecture findByCourseAndTitle(Course course, String title);
}
