package cesde.view;

import cesde.domain.School;
import cesde.service.SchoolServiceImpl;

import java.util.List;
import java.util.Scanner;

public class SchoolView {

    Scanner sc = new Scanner(System.in);

    private final SchoolServiceImpl schoolServiceImpl;

    public SchoolView(SchoolServiceImpl schoolServiceImpl){
        this.schoolServiceImpl = schoolServiceImpl;
    }

    public void createSchool(){
        schoolServiceImpl.createSchoolService();
    }

    public void getSchoolById(int id){
        schoolServiceImpl.getSchoolById(id);
    }

    public List<School> getAllSchools(){
        return schoolServiceImpl.getAllSchools();
    }

    public void updateSchool(int id){
        schoolServiceImpl.updateSchoolService(id);
    }

    public void deleteSchool(int id){
        System.out.println("estoy en el view");
        schoolServiceImpl.deleteSchool(id);
    }

}
