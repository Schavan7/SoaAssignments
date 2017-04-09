package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Customer;
import model.Order;
import model.Transaction;
import model.dao.CustomerDao;
import model.dao.OrderDao;
import model.dao.TransactionDao;

@WebService
public class OrderWS {

	@WebMethod
	public Order getOrder(Integer orderId){
		OrderDao orderdao = new OrderDao();
		Order order = orderdao.getOrder(orderId);
		TransactionDao transdoa = new TransactionDao();
		Transaction trans = transdoa.getTransaction(order.getOrder_id());
		CustomerDao cusdoa = new CustomerDao();
		Customer cust = cusdoa.getCustomer(order.getCustomer_id());
		order.setCustomer(cust);
		order.setTransaction(trans);
		return order;
	}
	
	@WebMethod
	public List<Order> getOrders(){
		OrderDao orderdao = new OrderDao();
		List<Order> orders = orderdao.getAllOrders();
		return orders;		
	}
}
