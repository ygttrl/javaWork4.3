package Concrete;

import Abstruct.Log;
import Abstruct.PriceCalculate;
import Abstruct.SaleService;
import Entity.Sale;

public class SaleManager implements SaleService,PriceCalculate {

	private Log log;
	
	public SaleManager(Log log) {
		
		this.log = log;
	}

	@Override
	public void Add(Sale sale) {
		try {
			System.out.println(sale.getId()+" "+sale.getGame().getGameName()+" "+sale.getGamer().getName()+"-"+sale.getGamer().getSurname()+ " " +sale.getDiscount().getId()
					+" Sat?? Eklendi");
			log.LogMessage(sale, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(sale, "Hatal?");
		}
	}

	@Override
	public void Update(Sale sale) {
		
		try {
			System.out.println(sale.getId()+" 'li Sat?? G?ncellendi.");
			log.LogMessage(sale, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(sale, "Hatal?");
		}
		
	}

	@Override
	public void Delete(Sale sale) {
		
		try {
			System.out.println(sale.getId()+" 'li Sat?? S?L?ND?!!!");
			log.LogMessage(sale, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(sale, "Hatal?");
		}
	}

	@Override
	public int Calculate(Sale sale) {
		int disPrice = sale.getGame().getPrice() -  sale.getDiscount().getDiscountRate();
		return disPrice;
	}

	

}
