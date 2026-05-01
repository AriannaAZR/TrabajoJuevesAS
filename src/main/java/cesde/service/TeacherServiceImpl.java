package cesde.service;

import cesde.domain.Teacher;
import cesde.persistense.repository.TeacherRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createTeacherService(){

        Teacher teacher = new Teacher();

        teacher.setId(TypeValidator.validateInt("Ingrese el id del profesor"));
        teacher.setName(TypeValidator.validateString("Ingrese el nombre del profesor"));
        teacher.setLastName(TypeValidator.validateString("Ingrese el apellido del profesor"));
        teacher.setEmail(TypeValidator.validateString("Ingrese un email válido"));
        teacher.setSpecialty(TypeValidator.validateString("Ingrese la especialidad"));
        teacher.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));

        return teacherRepository.createTeacherRepository(teacher);
    }

    @Override
    public Teacher updateTeacherService(int id){

        Teacher teacher = teacherRepository.getTeacherById(id);

        if(id == teacher.getId()){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Apellido \n" +
                    "4. Email \n" +
                    "5. Especialidad \n" +
                    "6. Estado ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    teacher.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    teacher.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    teacher.setLastName(TypeValidator.validateString("Actualizar Apellido"));
                    break;
                case 4:
                    teacher.setEmail(TypeValidator.validateString("Actualizar Email"));
                    break;
                case 5:
                    teacher.setSpecialty(TypeValidator.validateString("Actualizar Especialidad"));
                    break;
                case 6:
                    teacher.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }

        return teacher;
    }

    @Override
    public Optional<Teacher> getTeacherById(int id) {

        Teacher teacher = teacherRepository.getTeacherById(id);

        if (id == teacher.getId()) {
            System.out.println("id:" + teacher.getId() + "\n" +
                    "Nombre:" + teacher.getName() + "\n" +
                    "Apellido: " + teacher.getLastName() + "\n" +
                    "Email: " + teacher.getEmail() + "\n" +
                    "Especialidad: " + teacher.getSpecialty() + "\n" +
                    "Status: " + teacher.isStatus());
        } else {
            System.out.println("Id no encontrado");
        }

        return Optional.ofNullable(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    @Override
    public void deleteTeacher(int id) {
        System.out.println("Estoy en el service");
        teacherRepository.deleteTeacherRepository(id);
    }

}
