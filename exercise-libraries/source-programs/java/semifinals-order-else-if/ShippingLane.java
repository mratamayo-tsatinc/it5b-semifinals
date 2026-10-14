/*
@codescope
@title Shipping Lane
@seed weight min=2 max=14 step=2
@seed baseFee min=60 max=100 step=10
*/

public class ShippingLane
{
    public static void main(String[] args)
    {
        int weight = 8;
        int baseFee = 80;
        int shippingFee;
        int lane;

        if (weight <= 3) {
            lane = 1;
            shippingFee = baseFee;
        } else if (weight <= 8) {
            lane = 2;
            shippingFee = baseFee + 50;
        } else {
            lane = 3;
            shippingFee = baseFee + 120;
        }

        System.out.println("SHIPPING ASSIGNMENT");
        System.out.println("Processing lane: " + lane);
        System.out.println("Shipping fee: Php. " + shippingFee);
    }
}