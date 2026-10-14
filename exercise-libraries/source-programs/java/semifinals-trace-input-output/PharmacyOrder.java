/*
@codescope
@title Pharmacy Order
@seed unitPrice min=15 max=35 step=5
@input target=quantity value=6 min=1 max=12
*/

import java.util.Scanner;

public class PharmacyOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int quantity;
        int unitPrice = 25;
        int orderTotal;

        System.out.print("Medicine quantity: ");
        quantity = input.nextInt();
        orderTotal = quantity * unitPrice;

        System.out.println("PHARMACY ORDER");
        System.out.println("======================");
        System.out.println("Prepared units: " + quantity);
        System.out.println("Payment due: Php. " + orderTotal);

        input.close();
    }
}