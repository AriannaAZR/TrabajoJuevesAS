package cesde.service;

import cesde.domain.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    // Contratos

    public Course createCourseService();
    public Course updateCourseService(int id);
    public Optional<Course> getCourseById(int id);
    public List<Course> getAllCourses();
    public void deleteCourse(int id);

}
