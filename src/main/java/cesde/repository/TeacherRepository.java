package cesde.repository;

import cesde.domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {

    List<Teacher> teachers = new ArrayList<>();

    public Teacher createTeacherRepository(Teacher teacher){

        teachers.add(teacher);

        for (Teacher t: teachers) {
            System.out.println(t.getId() + " " + t.getName() + " " + t.getLastName());
        }

        return teacher;
    }

    public Teacher getTeacherById(int id){

        for (Teacher teacher: teachers) {
            if(teacher.getId() == id){
                return teacher;
            }
        }

        return null;
    }

    public List<Teacher> getAllTeachers(){

        for(Teacher teacher: teachers){
            System.out.println(teacher.getId() + " " + teacher.getName() + " " + teacher.getLastName());
        }
        return teachers;
    }

    public Teacher updateTeacherRepository(int id){

        for (Teacher teacher: teachers) {
            if(teacher.getId() == id){
                return teacher;
            }
        }

        return null;
    }

    public void deleteTeacherRepository(int id){

        for (Teacher teacher: teachers) {
            if(teacher.getId() == id){
                teachers.remove(teacher);
                System.out.println("Profesor eliminado");
                return;
            }
        }

        System.out.println("Profesor no encontrado");
    }

}
