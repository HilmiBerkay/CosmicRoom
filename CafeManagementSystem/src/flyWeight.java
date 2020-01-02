import java.util.HashMap;

public class flyWeight {
	public static int Dessert=1;
	public static int Drink=2;
	public static int Meal=3;
	
	private static HashMap<Integer, ProductFactory> map = new HashMap<>();
	
	public static ProductFactory TakeFactory(int n) {
		
		ProductFactory factory=null;
		
		switch(n) {
			
			case 1:
				factory= map.get(n);
				if(factory==null) {
					factory = new DessertFactory();
					map.put(n, factory);
				}
				break;
					
			case 2:
				factory= map.get(n);
				if(factory==null) {
					factory = new DrinkFactory();
					map.put(n, factory);
				}
				break;
				
			case 3:
				factory= map.get(n);
				if(factory==null) {
					factory = new MealFactory();
					map.put(n, factory);
				}
				break;
			
			default:
				System.out.println("You dont have like a this factory");		
		}
		
		return factory;
				
				
	}
}
