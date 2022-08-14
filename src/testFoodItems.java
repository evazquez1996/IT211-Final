public class testFoodItems {
    public static void main(String[] args) {
        FoodItem item = new FoodItem();

//        item.setFoodName("water");
//        item.setFat(0.00);
//        item.setCarbohydrates(0.00);
//        item.setProtein(0.00);
//        item.setNumServings(1.00);

        item.setFoodName("M&M's");
        item.setFat(10.0);
        item.setCarbohydrates(34.0);
        item.setProtein(2.0);
        item.setNumServings(1.00);
        item.setNumServings2(3.00);


        item.printNutritionalInfo();

    }
}
