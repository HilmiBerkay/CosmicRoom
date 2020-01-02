
public class DrinkFactory extends ProductFactory {

	@Override
	public Products makeProducts() {
		
		return new Drink();
	}
	
	
}

