package app.bleona.edu_mate.service;

import app.bleona.edu_mate.model.Lecture;
import app.bleona.edu_mate.model.Course;
import app.bleona.edu_mate.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectureService {

    @Autowired
    private LectureRepository lectureRepository;

    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }

    public Optional<Lecture> getLectureById(Long id) {
        return lectureRepository.findById(id);
    }

    public List<Lecture> getLecturesByCourse(Course course) {
        return lectureRepository.findByCourse(course);
    }

    public List<Lecture> getLecturesOrderedByOrder(Course course) {
        return lectureRepository.findByCourseOrderByOrderAsc(course);
    }

    public List<Lecture> getLecturesByDurationGreaterThan(Integer duration) {
        return lectureRepository.findByDurationGreaterThan(duration);
    }

    public Lecture getLectureByCourseAndTitle(Course course, String title) {
        return lectureRepository.findByCourseAndTitle(course, title);
    }

}
