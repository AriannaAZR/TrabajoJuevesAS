package cesde.service;

import cesde.domain.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {

    // Contratos

    public Classroom createClassroomService();
    public Classroom updateClassroomService(int id);
    public Optional<Classroom> getClassroomById(int id);
    public List<Classroom> getAllClassrooms();
    public void deleteClassroom(int id);

}
