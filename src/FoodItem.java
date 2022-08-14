import java.util.Objects;

public class FoodItem {
    private String foodName;
    private double fat;
    private double carbohydrates;
    private double protein;
    private double numServings;
    private double numServings2;

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setNumServings(double numServings) {
        this.numServings = numServings;
    }
    public void setNumServings2(double numServings2) {
        this.numServings2 = numServings2;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public double getProtein() {
        return protein;
    }

    public double getNumServings() {
        return numServings;
    }

    public double getNumServings2() {
        return numServings2;
    }

    private double getCalorieServing2() {
        return (float) ((fat * 9) + (carbohydrates * 4) + (protein * 4)) * numServings2;
    }

    public double getCalorieServing() {
        return (float) ((fat * 9) + (carbohydrates * 4) + (protein * 4)) * numServings;
    }

    public void printNutritionalInfo() {
        if (Objects.equals(foodName, "Water")) {
            double water = 0.0;

            System.out.println("Nutritional information per saving of " + foodName + ":");
            System.out.println("Fat: " + fat + " g");
            System.out.println("Carbohydrates: " + carbohydrates + " g");
            System.out.println("Protein: " + protein + " g");
            System.out.println("Number of calories for " + numServings + " serving(s): " + water);
        } else {
            System.out.println("Nutritional information per saving of " + foodName + ":");
            System.out.println("Fat: " + fat + " g");
            System.out.println("Carbohydrates: " + carbohydrates + " g");
            System.out.println("Protein: " + protein + " g");
            System.out.println("Number of calories for " + numServings + " serving(s): " + getCalorieServing());
            System.out.println("Number of calories for " + numServings2 + " serving(s): " + getCalorieServing2());
        }
    }



}
