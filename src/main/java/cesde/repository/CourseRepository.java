package cesde.repository;

import cesde.domain.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {

    List<Course> courses = new ArrayList<>();

    public Course createCourseRepository(Course course){

        courses.add(course);

        for (Course c: courses) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getDescription());
        }

        return course;
    }

    public Course getCourseById(int id){

        for (Course course: courses) {
            if(course.getId() == id){
                return course;
            }
        }

        return null;
    }

    public List<Course> getAllCourses(){

        for(Course course: courses){
            System.out.println(course.getId() + " " + course.getName() + " " + course.getDescription());
        }
        return courses;
    }

    public Course updateCourseRepository(int id){

        for (Course course: courses) {
            if(course.getId() == id){
                return course;
            }
        }

        return null;
    }

    public void deleteCourseRepository(int id){

        for (Course course: courses) {
            if(course.getId() == id){
                courses.remove(course);
                System.out.println("Curso eliminado");
                return;
            }
        }

        System.out.println("Curso no encontrado");
    }

}
