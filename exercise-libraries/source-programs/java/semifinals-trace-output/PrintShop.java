/*
@codescope
@title Print Shop Job Ticket
@seed pages min=8 max=20 step=2
@seed copies min=2 max=5
@seed pricePerPage min=2 max=4
*/

public class PrintShop
{
    public static void main(String[] args)
    {
        int pages = 12;
        int copies = 3;
        int pricePerPage = 2;
        int sheets;
        int jobCost;

        sheets = pages * copies;
        jobCost = sheets * pricePerPage;

        System.out.println("PRINT JOB");
        System.out.println("**********");
        System.out.println(pages + " pages x " + copies + " copies");
        System.out.println("Sheets required: " + sheets);
        System.out.println("Job cost: P" + jobCost);
    }
}