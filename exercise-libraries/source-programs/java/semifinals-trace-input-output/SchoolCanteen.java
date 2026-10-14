/*
@codescope
@title School Canteen Order
@seed mealPrice min=45 max=75 step=5
@seed drinkPrice min=15 max=30 step=5
@input target=meals value=2 min=1 max=6
@input target=drinks value=2 min=0 max=6
*/

import java.util.Scanner;

public class SchoolCanteen
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int meals;
        int drinks;
        int mealPrice = 60;
        int drinkPrice = 20;
        int canteenTotal;

        System.out.print("Meal orders: ");
        meals = input.nextInt();
        System.out.print("Drink orders: ");
        drinks = input.nextInt();
        canteenTotal = meals * mealPrice + drinks * drinkPrice;

        System.out.println("CANTEEN CLAIM");
        System.out.println("Meals prepared: " + meals);
        System.out.println("Drinks prepared: " + drinks);
        System.out.println("Amount due: Php. " + canteenTotal);

        input.close();
    }
}