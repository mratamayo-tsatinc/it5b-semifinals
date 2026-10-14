/*
@codescope
@title Water Service Charge
@seed consumption min=8 max=38 step=2
@seed baseCharge min=100 max=140 step=10
*/

public class UtilityCharge
{
    public static void main(String[] args)
    {
        int consumption = 24;
        int baseCharge = 120;
        int serviceCharge;

        if (consumption <= 10) {
            serviceCharge = baseCharge;
        } else if (consumption <= 20) {
            serviceCharge = baseCharge + 60;
        } else if (consumption <= 30) {
            serviceCharge = baseCharge + 140;
        } else {
            serviceCharge = baseCharge + 240;
        }

        System.out.println("WATER SERVICE BILL");
        System.out.println("Metered use: " + consumption + " units");
        System.out.println("Service charge: Php. " + serviceCharge);
    }
}