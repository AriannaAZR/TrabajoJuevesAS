package cesde.config;

import cesde.repository.*;
import cesde.service.*;
import cesde.userinterface.MenuApp;
import cesde.view.*;

public class Config {

    public static MenuApp createMenuApp() {


        StudentRepository studentRepository = new StudentRepository();
        CourseRepository courseRepository = new CourseRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        ClassroomRepository classroomRepository = new ClassroomRepository();

        StudentServiceImpl studentServiceImpl = new StudentServiceImpl(studentRepository);
        CourseServiceImpl courseServiceImpl = new CourseServiceImpl(courseRepository);
        TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl(teacherRepository);
        ClassroomServiceImpl classroomServiceImpl = new ClassroomServiceImpl(classroomRepository);

        StudentView studentView = new StudentView(studentServiceImpl);
        CourseView courseView = new CourseView(courseServiceImpl);
        TeacherView teacherView = new TeacherView(teacherServiceImpl);
        ClassroomView classroomView = new ClassroomView(classroomServiceImpl);


        return new MenuApp(studentView, courseView, teacherView, classroomView);
    }


}
