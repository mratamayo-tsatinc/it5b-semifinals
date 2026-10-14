/*
@codescope
@title Delivery Route Cost
@seed stops min=3 max=7
@seed costPerStop min=25 max=45 step=5
@seed fuelAllowance min=80 max=140 step=10
*/

public class DeliveryRoute
{
    public static void main(String[] args)
    {
        int stops = 5;
        int costPerStop = 35;
        int fuelAllowance = 100;
        int serviceCost;
        int routeBudget;

        serviceCost = stops * costPerStop;
        routeBudget = serviceCost + fuelAllowance;

        System.out.println("DELIVERY ROUTE");
        System.out.println("Scheduled stops: " + stops);
        System.out.println("Service cost: P" + serviceCost);
        System.out.println("Fuel allowance: P" + fuelAllowance);
        System.out.println("Route budget: P" + routeBudget);
    }
}