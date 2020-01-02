public class MealFactory extends ProductFactory{
   
    @Override
    public Products makeProducts(){
       
        return new Meal();
    }
}
