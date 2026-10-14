/*
@codescope
@title Cooperative Loan Decision
@seed income min=18000 max=32000 step=2000
@seed requested min=12000 max=24000 step=2000
@seed limit min=18000 max=26000 step=2000
*/

public class LoanDecision
{
    public static void main(String[] args)
    {
        int income = 26000;
        int requested = 18000;
        int limit = 22000;
        int approvedAmount;

        if (income >= requested && requested <= limit) {
            approvedAmount = requested;
        } else {
            approvedAmount = 0;
        }

        System.out.println("COOPERATIVE LOAN");
        System.out.println("Approved amount: Php. " + approvedAmount);
    }
}