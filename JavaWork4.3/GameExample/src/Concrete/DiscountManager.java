package Concrete;

import Abstruct.DiscountService;
import Abstruct.Log;
import Entity.Discount;

public class DiscountManager implements DiscountService {

	
	private Log log;
	
	public DiscountManager(Log log) {		
		this.log = log;
	}

	@Override
	public void Add(Discount discount) {
		
		try {
			System.out.println(discount.getId()+" "+discount.getDiscountRate()+" "+discount.getDiscountName()+" ?nidirim Eklendi");
			log.LogMessage(discount, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(discount, "Hatal?");
		}		
		
	}

	@Override
	public void Update(Discount discount) {
		
		try {
			System.out.println(discount.getId()+" 'li ?nidirim Eklendi");
			log.LogMessage(discount, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(discount, "Hatal?");
		}
		
		
	}

	@Override
	public void Delete(Discount discount) {
		try {
			System.out.println(discount.getId()+" 'li ?nidirim S?L?ND?");
			log.LogMessage(discount, "Ba?ar?l?");
		} catch (Exception e) {
			log.LogMessage(discount, "Hatal?");
		}
		
	}

}
