
public class DessertFactory extends ProductFactory{
   
    @Override
    public Products makeProducts(){
       
       return new Dessert();
    }
}