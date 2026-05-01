package cesde.service;

import cesde.domain.Course;
import cesde.persistense.repository.CourseRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public Course createCourseService(){

        Course course = new Course();

        course.setId(TypeValidator.validateInt("Ingrese el id del curso"));
        course.setName(TypeValidator.validateString("Ingrese el nombre del curso"));
        course.setDescription(TypeValidator.validateString("Ingrese la descripción del curso"));
        course.setCredits(TypeValidator.validateInt("Ingrese los créditos del curso"));
        course.setStatus(TypeValidator.validateBoolean("Seleccione un estado"));

        return courseRepository.createCourseRepository(course);
    }

    @Override
    public Course updateCourseService(int id){

        Course course = courseRepository.getCourseById(id);

        if(id == course.getId()){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Descripción \n" +
                    "4. Créditos \n" +
                    "5. Estado ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    course.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    course.setName(TypeValidator.validateString("Actualizar Nombre"));
                    break;
                case 3:
                    course.setDescription(TypeValidator.validateString("Actualizar Descripción"));
                    break;
                case 4:
                    course.setCredits(TypeValidator.validateInt("Actualizar Créditos"));
                    break;
                case 5:
                    course.setStatus(TypeValidator.validateBoolean("Actualizar Estado"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }

        return course;
    }

    @Override
    public Optional<Course> getCourseById(int id) {

        Course course = courseRepository.getCourseById(id);

        if (id == course.getId()) {
            System.out.println("id:" + course.getId() + "\n" +
                    "Nombre:" + course.getName() + "\n" +
                    "Descripción: " + course.getDescription() + "\n" +
                    "Créditos: " + course.getCredits() + "\n" +
                    "Status: " + course.isStatus());
        } else {
            System.out.println("Id no encontrado");
        }

        return Optional.ofNullable(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    @Override
    public void deleteCourse(int id) {
        System.out.println("Estoy en el service");
        courseRepository.deleteCourseRepository(id);
    }

}
