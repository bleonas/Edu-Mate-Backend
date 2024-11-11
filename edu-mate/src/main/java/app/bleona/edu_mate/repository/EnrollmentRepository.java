package app.bleona.edu_mate.repository;

import app.bleona.edu_mate.model.Enrollment;
import app.bleona.edu_mate.model.Student;
import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.model.Enrollment.EnrollmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    
    List<Enrollment> findByStudent(Student student);
    
    List<Enrollment> findByCourse(Course course);
    
    List<Enrollment> findByStatus(EnrollmentStatus status);
    
    List<Enrollment> findByCourseAndStatus(Course course, EnrollmentStatus status);
}
