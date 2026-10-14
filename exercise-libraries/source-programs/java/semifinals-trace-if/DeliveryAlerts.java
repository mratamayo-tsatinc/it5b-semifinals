/*
@codescope
@title Delivery Alerts
@seed distance min=4 max=14
@seed parcels min=2 max=8
@seed charge min=40 max=70 step=5
*/

public class DeliveryAlerts
{
    public static void main(String[] args)
    {
        int distance = 11;
        int parcels = 6;
        int charge = 50;
        int alerts = 0;

        if (distance > 8) {
            charge = charge + 25;
            alerts = alerts + 1;
        }

        if (parcels > 5) {
            charge = charge + 15;
            alerts = alerts + 1;
        }

        System.out.println("DELIVERY ASSESSMENT");
        System.out.println("Applied alerts: " + alerts);
        System.out.println("Delivery charge: Php. " + charge);
    }
}