import java.time.LocalDate;

import Concrete.CommunicationManager;
import Concrete.DiscountManager;
import Concrete.GameCategoryManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.MersisManager;
import Concrete.SaleManager;
import Concrete.Logs.DataBaseLog;
import Concrete.Logs.FileLog;
import Concrete.Logs.SmsLog;
import Entity.Communication;
import Entity.Discount;
import Entity.Game;
import Entity.GameCategory;
import Entity.Gamer;
import Entity.Sale;

public class MAIN {

	public static void main(String[] args) {
		
		Communication communication = new Communication(1, "5553332211", "deneme@gmail.com", "adres1");
		CommunicationManager communicationManager = new CommunicationManager(new FileLog());
		communicationManager.Add(communication);
		communicationManager.Update(communication);
		communicationManager.Delete(communication);
		System.out.println("\n\n");
		
		Gamer gamer = new Gamer(1, "Mahmut", "Erdem", "456789153", communication);
		
		GamerManager gamerManager = new GamerManager(new MersisManager(),new SmsLog());
		gamerManager.Add(gamer);
		gamerManager.Update(gamer);
		gamerManager.Delete(gamer);
		System.out.println("\n\n");
		
		GameCategory category = new GameCategory(1,"Strateji Oyunlar?");
		GameCategoryManager categoryManager = new GameCategoryManager(new DataBaseLog());
		categoryManager.Add(category);
		categoryManager.Update(category);
		categoryManager.Delete(category);
		System.out.println("\n\n");
		
		Game game = new Game(1,"StarCraft2",LocalDate.ofYearDay(2010,1),200,category);
		GameManager gameManager = new GameManager(new SmsLog());
		gameManager.Add(game);
		gameManager.Update(game);
		gameManager.Delete(game);
		System.out.println("\n\n");
		
		Discount discount = new Discount(1,"Y?l Sonu ?ndirimi",50);
		DiscountManager discountManager = new DiscountManager(new DataBaseLog());
		discountManager.Add(discount);
		discountManager.Update(discount);
		discountManager.Delete(discount);
		System.out.println("\n\n");
		
		Sale sale = new Sale(1,gamer, game, discount);
		SaleManager saleManager = new SaleManager(new DataBaseLog());
		saleManager.Add(sale);
		saleManager.Update(sale);
		saleManager.Delete(sale);		
		System.out.println("\n\n");		
		
		System.out.println( "?ndirimli fiyat :"+ saleManager.Calculate(sale));
		
	}

}
