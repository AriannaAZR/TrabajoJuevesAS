package cesde.service;

import cesde.domain.School;
import cesde.repository.SchoolRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School createSchoolService(){

        School school = new School();

        school.setId(TypeValidator.validateInt("Ingrese el id de la escuela"));
        school.setName(TypeValidator.validateString("Ingrese el nombre de la escuela"));
        school.setAddress(TypeValidator.validateString("Ingrese la dirección"));
        school.setPhone(TypeValidator.validateString("Ingrese el teléfono"));
        school.setEmail(TypeValidator.validateString("Ingrese un email válido"));
        school.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));

        return schoolRepository.createSchoolRepository(school);
    }

    @Override
    public School updateSchoolService(int id){

        School school = schoolRepository.getSchoolById(id);

        if(id == school.getId()){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Dirección \n" +
                    "4. Teléfono \n" +
                    "5. Email \n" +
                    "6. Estado ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    school.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    school.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    school.setAddress(TypeValidator.validateString("Actualizar Dirección"));
                    break;
                case 4:
                    school.setPhone(TypeValidator.validateString("Actualizar Teléfono"));
                    break;
                case 5:
                    school.setEmail(TypeValidator.validateString("Actualizar Email"));
                    break;
                case 6:
                    school.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }

        return school;
    }

    @Override
    public Optional<School> getSchoolById(int id) {

        School school = schoolRepository.getSchoolById(id);

        if (id == school.getId()) {
            System.out.println("id:" + school.getId() + "\n" +
                    "Nombre:" + school.getName() + "\n" +
                    "Dirección: " + school.getAddress() + "\n" +
                    "Teléfono: " + school.getPhone() + "\n" +
                    "Email: " + school.getEmail() + "\n" +
                    "Status: " + school.isStatus());
        } else {
            System.out.println("Id no encontrado");
        }

        return Optional.ofNullable(school);
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.getAllSchools();
    }

    @Override
    public void deleteSchool(int id) {
        System.out.println("Estoy en el service");
        schoolRepository.deleteSchoolRepository(id);
    }

}
