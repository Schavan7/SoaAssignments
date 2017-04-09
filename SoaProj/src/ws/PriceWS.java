package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Price;
import model.dao.PriceDao;


@WebService
public class PriceWS {
	@WebMethod
	public Price getpricetofrom(Integer location_id_from, Integer location_id_to) {
		PriceDao pd = new PriceDao();
		Price price = pd.getpriceByToFrom(location_id_from, location_id_to);
		return price;
	}

	@WebMethod
	public List<Price> getpriceAll() {
		PriceDao pd = new PriceDao();
		List<Price> plist = pd.getAllPrices();
		return plist;
	}

}
