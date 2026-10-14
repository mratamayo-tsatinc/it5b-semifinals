/*
@codescope
@title Delivery Fee Schedule
@seed distance min=2 max=18 step=2
@seed baseFee min=35 max=55 step=5
*/

public class DeliveryFee
{
    public static void main(String[] args)
    {
        int distance = 12;
        int baseFee = 45;
        int deliveryFee;

        if (distance <= 5) {
            deliveryFee = baseFee;
        } else if (distance <= 10) {
            deliveryFee = baseFee + 20;
        } else if (distance <= 15) {
            deliveryFee = baseFee + 40;
        } else {
            deliveryFee = baseFee + 70;
        }

        System.out.println("======================");
        System.out.println("  DELIVERY QUOTATION");
        System.out.println("======================");
        System.out.println("Route length: " + distance + " km");
        System.out.println("Delivery fee: Php. " + deliveryFee);
    }
}