package ws;

import java.util.List;
import javax.jws.*;
import model.Customer;
import model.dao.CustomerDao;

@WebService
public class CustomerWS  {

	@WebMethod
	public Customer getCustomer(Integer customerId){
		CustomerDao cd = new CustomerDao();
		Customer customer = cd.getCustomer(customerId);
		return customer ;                                                             
	}
	
	@WebMethod
	public List<Customer> getCustomers(){
		CustomerDao cd = new CustomerDao();
		List<Customer> customers = cd.getAllCustomers();
		return customers ;                                                             
	}

}
