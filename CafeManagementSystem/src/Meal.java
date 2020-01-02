public class Meal extends Products{
   
    private boolean isVeg;
   
    public Meal(String name, int quantity, double price, boolean isVeg, double totalPrice){
       
        super(name,quantity,price, totalPrice);
        this.isVeg = isVeg;
    }

    public Meal() {
       
        super(null, 0, 0, 0);
    }
   
    public boolean isIsVeg() {
       
        return isVeg;
    }
public String vegMi() {
    	
    	if(this.isIsVeg() == true) {
    		
    		return "Vegan";
    	}
    	else {
    		
    		return "";
    	}
    }


    public void setIsVeg(boolean isVeg) {
       
        this.isVeg = isVeg;
    }

    @Override
    public String toString() {
       
        return getName() + " " + vegMi() + " " + getQuantity() + " " + getTotalPrice();
    }
   
}