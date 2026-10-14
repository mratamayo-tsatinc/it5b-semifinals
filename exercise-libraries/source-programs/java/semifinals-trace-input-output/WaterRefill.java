/*
@codescope
@title Water Refill Station
@seed pricePerContainer min=25 max=45 step=5
@input target=containers value=3 min=1 max=8
*/

import java.util.Scanner;

public class WaterRefill
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int containers;
        int pricePerContainer = 35;
        int refillTotal;

        System.out.print("Containers for refill: ");
        containers = input.nextInt();
        refillTotal = containers * pricePerContainer;

        System.out.println("WATER REFILL");
        System.out.println("Containers filled: " + containers);
        System.out.println("Collection total: Php. " + refillTotal);

        input.close();
    }
}