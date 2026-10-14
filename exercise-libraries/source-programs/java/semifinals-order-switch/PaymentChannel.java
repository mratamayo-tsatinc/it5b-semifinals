/*
@codescope
@title Payment Channel
@seed channel min=1 max=4
@seed purchase min=400 max=800 step=100
*/

public class PaymentChannel
{
    public static void main(String[] args)
    {
        int channel = 2;
        int purchase = 600;
        int serviceFee;
        int paymentTotal;

        switch (channel)
        {
            case 1:
                serviceFee = 10;
                break;
            case 2:
                serviceFee = 25;
                break;
            case 3:
                serviceFee = 40;
                break;
            default:
                serviceFee = 60;
        }

        paymentTotal = purchase + serviceFee;

        System.out.println("PAYMENT CHANNEL");
        System.out.println("Service fee: Php. " + serviceFee);
        System.out.println("Charged total: Php. " + paymentTotal);
    }
}