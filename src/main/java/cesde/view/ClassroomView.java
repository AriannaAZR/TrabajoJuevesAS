package cesde.view;

import cesde.domain.Classroom;
import cesde.service.ClassroomServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ClassroomView {

    Scanner sc = new Scanner(System.in);

    private final ClassroomServiceImpl classroomServiceImpl;

    public ClassroomView(ClassroomServiceImpl classroomServiceImpl){
        this.classroomServiceImpl = classroomServiceImpl;
    }

    public void createClassroom(){
        classroomServiceImpl.createClassroomService();
    }

    public void getClassroomById(int id){
        classroomServiceImpl.getClassroomById(id);
    }

    public List<Classroom> getAllClassrooms(){
        return classroomServiceImpl.getAllClassrooms();
    }

    public void updateClassroom(int id){
        classroomServiceImpl.updateClassroomService(id);
    }

    public void deleteClassroom(int id){
        System.out.println("estoy en el view");
        classroomServiceImpl.deleteClassroom(id);
    }

}
