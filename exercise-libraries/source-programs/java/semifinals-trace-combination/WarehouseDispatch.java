/*
@codescope
@title Warehouse Dispatch
@seed stock min=8 max=24 step=2
@seed requested min=5 max=15
@seed destination min=1 max=3
*/

public class WarehouseDispatch
{
    public static void main(String[] args)
    {
        int stock = 18;
        int requested = 12;
        int destination = 2;
        int dispatched = 0;
        int handlingFee;

        if (requested <= stock) {
            dispatched = requested;
        }

        switch (destination)
        {
            case 1:
                handlingFee = 40;
                break;
            case 2:
                handlingFee = 70;
                break;
            default:
                handlingFee = 100;
        }
        System.out.println("======================");
        System.out.println("  WAREHOUSE DISPATCH");
        System.out.println("======================");
        System.out.println("Released units: " + dispatched);
        System.out.println("Handling fee: Php. " + handlingFee);
    }
}