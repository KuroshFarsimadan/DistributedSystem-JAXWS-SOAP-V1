package Interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ServerInterface {

	@WebMethod
	String addCourse(String courseID, String semester);

	@WebMethod
	String addStudentCourse(String studentID, String newCourseID, String oldCourse);

	@WebMethod
	String listCourseAvailability(String semester);

	@WebMethod
	String removeCourse(String courseID, String semester);

	@WebMethod
	String removeStudentCourse(String studentID, String newCourseID, String oldCourse);

	@WebMethod
	String dropCourse(String studentID, String courseID);

	@WebMethod
	String enrolCourse(String studentID, String courseID, String semester);

	@WebMethod
	String getClassSchedule(String studentID);

	@WebMethod
	String swapCourse(String studentID, String newCourseID, String oldCourse);

	@WebMethod
	boolean revertAdd(String studentID, String courseID);

	@WebMethod
	boolean revertRemove(String studentID, String courseID);

	@WebMethod
	String studentSemesterCourseCount(String studentID, String semester);

}