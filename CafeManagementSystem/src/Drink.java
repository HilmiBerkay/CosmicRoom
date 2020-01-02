public class Drink extends Products{
   
    private boolean isBottle;
   
    public Drink(String name, int quantity, double price, boolean isBottle, double totalPrice){
       
        super(name,quantity,price,totalPrice);
        this.isBottle = isBottle;
    }

    public Drink() {
       
        super(null, 0, 0, 0);
        this.isBottle = false;
    }
   
   

    public boolean getIsBottle() {
        return isBottle;
    }
    
    public String bottleMi() {
    	
    	if(this.isBottle == true) {
    		
    		return "Şişe";
    	}
    	else {
    		
    		return "";
    	}
    }

    public void setIsBottle(boolean isBottle) {
        this.isBottle = isBottle;
    }
   
    @Override
    public String toString(){
       
        return getName() + " " + getQuantity() + " " + getTotalPrice() + " " + bottleMi();
    }
}