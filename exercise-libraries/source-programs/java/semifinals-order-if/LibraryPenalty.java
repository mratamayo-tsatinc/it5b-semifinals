/*
@codescope
@title Library Penalty
@seed lateDays min=2 max=10 step=2
@seed dailyFine min=5 max=15 step=5
@seed processingFee min=10 max=30 step=10
*/

public class LibraryPenalty
{
    public static void main(String[] args)
    {
        int lateDays = 6;
        int dailyFine = 10;
        int processingFee = 20;
        int penalty;

        penalty = lateDays * dailyFine;

        if (lateDays > 5) {
            penalty = penalty + processingFee;
        }

        System.out.println("LIBRARY RETURN");
        System.out.println("Late period: " + lateDays + " days");
        System.out.println("Penalty due: Php. " + penalty);
    }
}