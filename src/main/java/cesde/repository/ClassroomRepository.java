package cesde.repository;

import cesde.domain.Classroom;

import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository {

    List<Classroom> classrooms = new ArrayList<>();

    public Classroom createClassroomRepository(Classroom classroom){

        classrooms.add(classroom);

        for (Classroom c: classrooms) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getBuilding());
        }

        return classroom;
    }

    public Classroom getClassroomById(int id){

        for (Classroom classroom: classrooms) {
            if(classroom.getId() == id){
                return classroom;
            }
        }

        return null;
    }

    public List<Classroom> getAllClassrooms(){

        for(Classroom classroom: classrooms){
            System.out.println(classroom.getId() + " " + classroom.getName() + " " + classroom.getBuilding());
        }
        return classrooms;
    }

    public Classroom updateClassroomRepository(int id){

        for (Classroom classroom: classrooms) {
            if(classroom.getId() == id){
                return classroom;
            }
        }

        return null;
    }

    public void deleteClassroomRepository(int id){

        for (Classroom classroom: classrooms) {
            if(classroom.getId() == id){
                classrooms.remove(classroom);
                System.out.println("Aula eliminada");
                return;
            }
        }

        System.out.println("Aula no encontrada");
    }

}
