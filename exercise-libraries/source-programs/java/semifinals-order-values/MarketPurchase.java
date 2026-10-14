/*
@codescope
@title Market Purchase
@seed quantity min=2 max=6
@seed unitPrice min=35 max=65 step=5
@seed cash min=300 max=500 step=50
*/

public class MarketPurchase
{
    public static void main(String[] args)
    {
        int quantity = 4;
        int unitPrice = 50;
        int cash = 400;
        int purchaseTotal;
        int change;

        purchaseTotal = quantity * unitPrice;
        change = cash - purchaseTotal;

        System.out.println("MARKET PURCHASE");
        System.out.println("Basket total: Php. " + purchaseTotal);
        System.out.println("Change: Php. " + change);
    }
}