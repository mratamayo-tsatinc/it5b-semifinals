/*
@codescope
@title Cafe Order Summary
@seed drinks min=2 max=6
@seed unitPrice min=45 max=75 step=5
@seed voucher min=10 max=30 step=5
*/

public class CafeOrder
{
    public static void main(String[] args)
    {
        int drinks = 4;
        int unitPrice = 60;
        int voucher = 20;
        int subtotal;
        int amountDue;

        subtotal = drinks * unitPrice;
        amountDue = subtotal - voucher;

        System.out.println("CAFE ORDER");
        System.out.println(drinks + " drinks at P" + unitPrice);
        System.out.println("Voucher: P" + voucher);
        System.out.println("Amount due: P" + amountDue);
    }
}