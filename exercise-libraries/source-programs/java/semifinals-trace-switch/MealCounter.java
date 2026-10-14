/*
@codescope
@title Meal Counter
@seed mealCode min=1 max=4
@seed quantity min=1 max=4
*/

public class MealCounter
{
    public static void main(String[] args)
    {
        int mealCode = 2;
        int quantity = 3;
        int unitPrice;

        switch (mealCode)
        {
            case 1:
                unitPrice = 55;
                break;
            case 2:
                unitPrice = 70;
                break;
            case 3:
                unitPrice = 85;
                break;
            default:
                unitPrice = 45;
        }

        System.out.println("MEAL COUNTER");
        System.out.println("Order total: P" + (unitPrice * quantity));
    }
}