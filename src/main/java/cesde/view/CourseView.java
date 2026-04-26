package cesde.view;

import cesde.domain.Course;

import java.util.List;
import java.util.Scanner;

public class CourseView package cesde.view;

import cesde.domain.Course;
import cesde.service.CourseServiceImpl;

import java.util.List;
import java.util.Scanner;

public class CourseView {

    Scanner sc = new Scanner(System.in);

    private final CourseServiceImpl courseServiceImpl;

    public CourseView(CourseServiceImpl courseServiceImpl){
        this.courseServiceImpl = courseServiceImpl;
    }

    public void createCourse(){
        courseServiceImpl.createCourseService();
    }

    public void getCourseById(int id){
        courseServiceImpl.getCourseById(id);
    }

    public List<Course> getAllCourses(){
        return courseServiceImpl.getAllCourses();
    }

    public void updateCourse(int id){
        courseServiceImpl.updateCourseService(id);
    }

    public void deleteCourse(int id){
        System.out.println("estoy en el view");
        courseServiceImpl.deleteCourse(id);
    }

}
{
}
