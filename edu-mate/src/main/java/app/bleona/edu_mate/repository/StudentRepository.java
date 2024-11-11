package app.bleona.edu_mate.repository;

import app.bleona.edu_mate.model.Student;
import app.bleona.edu_mate.model.Enrollment;
import app.bleona.edu_mate.model.Enrollment.EnrollmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDegreeName(String degreeName);

    List<Student> findByEnrollments_Status(EnrollmentStatus status);

    List<Student> findByEnrollments_Course_Id(Long courseId);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    List<Student> findByEnrollments_Course_IdAndEnrollments_Status(Long courseId, EnrollmentStatus status);
}
