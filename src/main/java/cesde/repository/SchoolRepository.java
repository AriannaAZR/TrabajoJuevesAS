package cesde.repository;

import cesde.domain.School;

import java.util.ArrayList;
import java.util.List;

public class SchoolRepository {

    List<School> schools = new ArrayList<>();

    public School createSchoolRepository(School school){

        schools.add(school);

        for (School s: schools) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAddress());
        }

        return school;
    }

    public School getSchoolById(int id){

        for (School school: schools) {
            if(school.getId() == id){
                return school;
            }
        }

        return null;
    }

    public List<School> getAllSchools(){

        for(School school: schools){
            System.out.println(school.getId() + " " + school.getName() + " " + school.getAddress());
        }
        return schools;
    }

    public School updateSchoolRepository(int id){

        for (School school: schools) {
            if(school.getId() == id){
                return school;
            }
        }

        return null;
    }

    public void deleteSchoolRepository(int id){

        for (School school: schools) {
            if(school.getId() == id){
                schools.remove(school);
                System.out.println("Escuela eliminada");
                return;
            }
        }

        System.out.println("Escuela no encontrada");
    }

}
