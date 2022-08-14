public class testFoodItems {
    /*********************
     * Name: Eduardo , Edlawit, Teddy , Prodan
     * Date: 08/14/20122
     * Class: SM IT211 Java
     * Purpose: get nutritional information depending on servings of nutritional facts.
     * @param args
     */

    public static void main(String[] args) {

        // Prodan did the testing
        FoodItem item = new FoodItem();

        item.setFoodName("water");
        item.setFat(0.00);
        item.setCarbohydrates(0.00);
        item.setProtein(0.00);
        item.setNumServings(1.00);

        item.setFoodName("M&M's");
        item.setFat(10.0);
        item.setCarbohydrates(34.0);
        item.setProtein(2.0);
        item.setNumServings(1.00);
        item.setNumServings2(3.00);


        item.printNutritionalInfo();

    }
}
