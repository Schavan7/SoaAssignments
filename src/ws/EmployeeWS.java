package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Employee;
import model.dao.EmployeeDao;;

@WebService
public class EmployeeWS {
	@WebMethod
	public List<Employee> getEmployee() {
		EmployeeDao ed = new EmployeeDao();
		List<Employee> tlist = ed.getAllEmployees();
		return tlist;
	}
	
	@WebMethod
	public Employee getEmployeeByName(String employeename) {
		EmployeeDao ed = new EmployeeDao();
		Employee emp = ed.getEmployeeByName(employeename);
		return emp;
	}
}
