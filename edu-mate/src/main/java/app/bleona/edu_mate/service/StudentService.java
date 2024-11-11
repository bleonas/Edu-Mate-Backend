package app.bleona.edu_mate.service;

import app.bleona.edu_mate.model.Student;
import app.bleona.edu_mate.model.Enrollment;
import app.bleona.edu_mate.model.Enrollment.EnrollmentStatus;
import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.repository.StudentRepository;
import app.bleona.edu_mate.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Enrollment> getEnrollmentsByStudent(Student student) {
        return enrollmentRepository.findByStudent(student);
    }

    public List<Student> getStudentsByDegreeName(String degreeName) {
        return studentRepository.findByDegreeName(degreeName);
    }

    public List<Student> getStudentsByEnrollmentStatus(EnrollmentStatus status) {
        return studentRepository.findByEnrollments_Status(status);
    }

    public List<Student> getStudentsByEnrollmentCourseId(Long courseId) {
        return studentRepository.findByEnrollments_Course_Id(courseId);
    }

    public Enrollment enrollStudentInCourse(Student student, Course course) {
        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setStatus(Enrollment.EnrollmentStatus.ACTIVE);
        enrollment.setEnrollmentDate(java.time.LocalDateTime.now());
        return enrollmentRepository.save(enrollment);
    }

}
