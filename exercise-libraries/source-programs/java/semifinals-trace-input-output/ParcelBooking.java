/*
@codescope
@title Parcel Booking
@seed ratePerKilo min=40 max=70 step=5
@seed bookingFee min=15 max=30 step=5
@input target=weight value=5 min=1 max=12
*/

import java.util.Scanner;

public class ParcelBooking
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int weight;
        int ratePerKilo = 55;
        int bookingFee = 20;
        int shippingCost;

        System.out.print("Parcel weight in kg: ");
        weight = input.nextInt();
        shippingCost = weight * ratePerKilo + bookingFee;

        System.out.println("PARCEL BOOKING");
        System.out.println("======================");
        System.out.println("Accepted weight: " + weight + " kg");
        System.out.println("Shipping cost: Php. " + shippingCost);

        input.close();
    }
}