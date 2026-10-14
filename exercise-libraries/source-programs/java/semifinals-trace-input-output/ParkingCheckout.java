/*
@codescope
@title Parking Checkout
@seed hourlyRate min=20 max=40 step=5
@input target=hours value=4 min=1 max=10
*/

import java.util.Scanner;

public class ParkingCheckout
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int hours;
        int hourlyRate = 30;
        int parkingFee;

        System.out.print("Hours parked: ");
        hours = input.nextInt();
        parkingFee = hours * hourlyRate;

        System.out.println("PARKING CHECKOUT");
        System.out.println("======================");
        System.out.println("Duration: " + hours + " hours");
        System.out.println("Amount due: Php. " + parkingFee);

        input.close();
    }
}