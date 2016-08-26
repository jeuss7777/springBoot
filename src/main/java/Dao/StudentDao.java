package Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import Entity.Student;

@Repository 
public class StudentDao {

	private final Map<Integer, Student> students;
	
	public StudentDao() {
		students = new HashMap<>();
		students.put(1, new Student(1,"Jesus","Math"));
		students.put(2, new Student(2,"Anthony","Informatics"));
		students.put(3, new Student(3,"Durai","Physics"));
		students.put(4, new Student(4,"Hiram","Accounting"));
		
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	public Student getStudentById(int id){
		return students.get(id);
	}
	
	public void addStudent(int id, String name, String course){
		//int a = students.size()+5;
		students.put(id, new Student(id,name,course));
	}

	public void addStudent(Student student){
		//students.put(student.getId(), student);
		addStudent(student.getId(), student.getName(), student.getCourse());
	}
	
	public void updateStudent(Student student){
		
		students.replace(student.getId(), student);
	}
	
public void updateStudent2(Student newStudent){
		
		Student fromMap = students.get(newStudent.getId());
		fromMap.setName(newStudent.getName());
		fromMap.setCourse(newStudent.getCourse());
		
	}
}
