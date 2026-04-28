package cesde.service;

import cesde.domain.School;

import java.util.List;
import java.util.Optional;

public interface SchoolService {

    // Contratos

    public School createSchoolService();
    public School updateSchoolService(int id);
    public Optional<School> getSchoolById(int id);
    public List<School> getAllSchools();
    public void deleteSchool(int id);

}
