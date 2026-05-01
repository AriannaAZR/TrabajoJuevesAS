package cesde.service;

import cesde.domain.Classroom;
import cesde.persistense.repository.ClassroomRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class ClassroomServiceImpl implements ClassroomService {

    private final ClassroomRepository classroomRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository){
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom createClassroomService(){

        Classroom classroom = new Classroom();

        classroom.setId(TypeValidator.validateInt("Ingrese el id del aula"));
        classroom.setName(TypeValidator.validateString("Ingrese el nombre del aula"));
        classroom.setBuilding(TypeValidator.validateString("Ingrese el edificio"));
        classroom.setCapacity(TypeValidator.validateInt("Ingrese la capacidad"));
        classroom.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));

        return classroomRepository.createClassroomRepository(classroom);
    }

    @Override
    public Classroom updateClassroomService(int id){

        Classroom classroom = classroomRepository.getClassroomById(id);

        if(id == classroom.getId()){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Edificio \n" +
                    "4. Capacidad \n" +
                    "5. Estado ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    classroom.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    classroom.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    classroom.setBuilding(TypeValidator.validateString("Actualizar Edificio"));
                    break;
                case 4:
                    classroom.setCapacity(TypeValidator.validateInt("Actualizar Capacidad"));
                    break;
                case 5:
                    classroom.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }

        return classroom;
    }

    @Override
    public Optional<Classroom> getClassroomById(int id) {

        Classroom classroom = classroomRepository.getClassroomById(id);

        if (id == classroom.getId()) {
            System.out.println("id:" + classroom.getId() + "\n" +
                    "Nombre:" + classroom.getName() + "\n" +
                    "Edificio: " + classroom.getBuilding() + "\n" +
                    "Capacidad: " + classroom.getCapacity() + "\n" +
                    "Status: " + classroom.isStatus());
        } else {
            System.out.println("Id no encontrado");
        }

        return Optional.ofNullable(classroom);
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return classroomRepository.getAllClassrooms();
    }

    @Override
    public void deleteClassroom(int id) {
        System.out.println("Estoy en el service");
        classroomRepository.deleteClassroomRepository(id);
    }

}
