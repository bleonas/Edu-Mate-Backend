package app.bleona.edu_mate.service;

import app.bleona.edu_mate.model.Enrollment;
import app.bleona.edu_mate.model.Student;
import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.model.Enrollment.EnrollmentStatus;
import app.bleona.edu_mate.model.Lecture;
import app.bleona.edu_mate.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Optional<Enrollment> getEnrollmentById(Long id) {
        return enrollmentRepository.findById(id);
    }

    public List<Enrollment> getEnrollmentsByStudent(Student student) {
        return enrollmentRepository.findByStudent(student);
    }

    public List<Enrollment> getEnrollmentsByCourse(Course course) {
        return enrollmentRepository.findByCourse(course);
    }

    public List<Enrollment> getEnrollmentsByStatus(EnrollmentStatus status) {
        return enrollmentRepository.findByStatus(status);
    }

    public List<Enrollment> getEnrollmentsByCourseAndStatus(Course course, EnrollmentStatus status) {
        return enrollmentRepository.findByCourseAndStatus(course, status);
    }

}
