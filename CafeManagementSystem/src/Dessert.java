public class Dessert extends Products{
   
    private boolean isMilky;
   //?
    public Dessert(String name, int quantity, double price, boolean isMilky, double totalPrice){
       
        super(name, quantity, price, totalPrice);
        this.isMilky = isMilky;
    }

    public Dessert() {
       
        super(null, 0, 0, 0);
        this.isMilky = false;
    }
   
    public boolean isIsMilky() {
        return isMilky;
    }
public String milkMi() {
    	
    	if(this.isMilky == true) {
    		
    		return "Milky";
    	}
    	else {
    		
    		return "";
    	}
    }


    public void setIsMilky(boolean isMilky) {
        this.isMilky = isMilky;
    }

    @Override
    public String toString() {
       
        return getName() + " " + getQuantity() + " " + getTotalPrice() + " " + milkMi();
    }
}