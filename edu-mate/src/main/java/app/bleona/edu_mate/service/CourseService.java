package app.bleona.edu_mate.service;

import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.model.Student;
import app.bleona.edu_mate.model.Teacher;
import app.bleona.edu_mate.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public List<Course> getCoursesByCategory(String category) {
        return courseRepository.findByCategory(category);
    }

    public List<Course> getCoursesByLevel(String level) {
        return courseRepository.findByLevel(level);
    }

    public List<Course> getCoursesByTeacher(Teacher teacher) {
        return courseRepository.findByTeacher(teacher);
    }

    public List<Course> getAvailableCourses() {
        return courseRepository.findByIsAvailableTrue();
    }

    public List<Course> getCoursesByRatingGreaterThanEqual(Double rating) {
        return courseRepository.findByRatingGreaterThanEqual(rating);
    }

    public List<Course> getCoursesByByOrderByRatingDesc() {
        return courseRepository.findAllByOrderByRatingDesc();
    }

}

