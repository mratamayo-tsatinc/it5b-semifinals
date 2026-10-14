/*
@codescope
@title Stock Reorder
@seed stock min=4 max=14
@seed reorderLevel min=8 max=12
@seed reorderBatch min=15 max=25 step=5
*/

public class StockReorder
{
    public static void main(String[] args)
    {
        int stock = 7;
        int reorderLevel = 10;
        int reorderBatch = 20;
        int incoming = 0;

        if (stock < reorderLevel) {
            incoming = reorderBatch;
        }

        System.out.println("INVENTORY NOTICE");
        System.out.println("Incoming stock: " + incoming + " units");
        System.out.println("Projected stock: " + (stock + incoming) + " units");
    }
}