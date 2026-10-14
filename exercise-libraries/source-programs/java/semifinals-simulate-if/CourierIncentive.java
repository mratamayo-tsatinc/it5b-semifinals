/*
@codescope
@title Courier Incentive
@seed deliveries min=8 max=16 step=2
@seed rate min=35 max=55 step=5
@seed distance min=30 max=70 step=10
@seed incentive min=60 max=100 step=20
*/

public class CourierIncentive
{
    public static void main(String[] args)
    {
        int deliveries = 12;
        int rate = 45;
        int distance = 50;
        int incentive = 80;
        int earnings;
        int creditedBonus = 0;

        earnings = deliveries * rate;

        if (deliveries >= 10 && distance >= 40) {
            creditedBonus = incentive;
            earnings = earnings + creditedBonus;
        }

        System.out.println("COURIER PAYOUT");
        System.out.println("Completed deliveries: " + deliveries);
        System.out.println("Incentive credited: Php. " + creditedBonus);
        System.out.println("Total earnings: Php. " + earnings);
    }
}