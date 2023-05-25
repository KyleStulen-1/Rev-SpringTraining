package rev.com;

import java.util.List;

public interface StudentService {
    public void addStudent(Student student);
    public void updateStudent(String id, Student student);
    public void deleteStudent(String id);
    public Student getStudent(String id);
    public List<Student> getAllStudents();
}
