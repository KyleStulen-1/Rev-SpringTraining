package rev.com;


public class MainApplication {
    public static void main(String[] args) {
        // Create the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the student controller bean from the application context
        StudentController studentController = context.getBean(StudentController.class);

        // Use the student controller to manage student operations
    }
}
