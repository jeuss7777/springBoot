package Service;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.StudentDao;
import Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}

//	public static void main(String[] args) {
//		StudentDao studentDao = new StudentDao();
//		
//		Collection<Student> laListe= studentDao.getAllStudents();
//		for(Student theStudent : laListe){
//		
//			imprimerStudent(theStudent);
//			
//		}
//		
//		
//		Student durai= studentDao.getStudentById(3);
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		System.out.println(" getStudentById ");
//		imprimerStudent(durai);
//		
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		System.out.println(" updateStudent ");
//		
//		durai.setCourse("Management");
//		studentDao.updateStudent(durai);
//		imprimerStudent(durai);
//		
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		System.out.println(" getAllStudents() ");
//		
//		laListe= studentDao.getAllStudents();
//		for(Student theStudent : laListe){
//		
//			imprimerStudent(theStudent);
//			
//		}
//	}
	
	
	
	//private static void imprimerStudent(Student theStudent) {
	//	System.out.println(theStudent.getId() + " - " + theStudent.getName() + " --- " + theStudent.getCourse());
	//}
}
