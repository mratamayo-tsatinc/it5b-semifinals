/*
@codescope
@title Laundry Service Claim
@seed kilos min=3 max=8
@seed rate min=35 max=55 step=5
@seed serviceFee min=15 max=35 step=5
*/

public class LaundryService
{
    public static void main(String[] args)
    {
        int kilos = 5;
        int rate = 45;
        int serviceFee = 25;
        int washCost;
        int claimTotal;

        washCost = kilos * rate;
        claimTotal = washCost + serviceFee;

        System.out.println("LAUNDRY CLAIM");
        System.out.println("Load: " + kilos + " kg");
        System.out.println("Wash cost: P" + washCost);
        System.out.println("Service fee: P" + serviceFee);
        System.out.println("Claim total: P" + claimTotal);
    }
}