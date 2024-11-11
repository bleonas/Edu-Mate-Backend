package app.bleona.edu_mate.service;

import app.bleona.edu_mate.model.Teacher;
import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.repository.TeacherRepository;
import app.bleona.edu_mate.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacherById(Long id) {
        return teacherRepository.findById(id);
    }

    public List<Teacher> getTeachersByDepartment(String department) {
        return teacherRepository.findByDepartment(department);
    }

    public List<Teacher> getTeachersByCourseId(Long courseId) {
        return teacherRepository.findByCourses_Id(courseId);
    }

    public List<Course> getCoursesByTeacher(Teacher teacher) {
        return courseRepository.findByTeacher(teacher);
    }

    public Course addCourseForTeacher(Teacher teacher, Course course) {
        course.setTeacher(teacher);
        return courseRepository.save(course);
    }
}

