package cesde.service;

import cesde.domain.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    // Contratos

    public Teacher createTeacherService();
    public Teacher updateTeacherService(int id);
    public Optional<Teacher> getTeacherById(int id);
    public List<Teacher> getAllTeachers();
    public void deleteTeacher(int id);

}
