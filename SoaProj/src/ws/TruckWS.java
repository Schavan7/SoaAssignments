package ws;
import java.util.List;

import javax.jws.*;


import model.Employee;
import model.Truck;
import model.dao.EmployeeDao;
import model.dao.TruckDao;

@WebService
public class TruckWS {	
	@WebMethod
	public Truck getTruck(Integer truckId){
		Truck truck = null;
		try{
			TruckDao td = new TruckDao();
			truck = td.getTruck(truckId);
			EmployeeDao empDao = new EmployeeDao();
			Employee emp = empDao.getEmployee(truck.getEmployee_id());
			truck.setEmployee(emp);			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return truck;
	}

	@WebMethod
	public List<Truck> getTrucks() {
		TruckDao td = new TruckDao();
		List<Truck> tlist = td.getAllTrucks();
		return tlist;
	}
}
