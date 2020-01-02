public abstract class Products {
   
    private String name;
    private int quantity;
    private double price;
    private double totalPrice;

    public Products(String name, int quantity, double price, double totalPrice) {
       
        this.name   = name;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getTotalPrice() {
    	
    	return this.totalPrice;
    }
    
    public void calcTotalPrice() {
    	
    	this.totalPrice = price * quantity;
    }
   
    public abstract  String toString();
}
