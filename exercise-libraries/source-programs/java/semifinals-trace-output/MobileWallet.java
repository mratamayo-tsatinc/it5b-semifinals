/*
@codescope
@title Mobile Wallet Transfer
@seed openingBalance min=500 max=900 step=50
@seed transfer min=120 max=280 step=20
@seed charge min=10 max=30 step=5
*/

public class MobileWallet
{
    public static void main(String[] args)
    {
        int openingBalance = 700;
        int transfer = 200;
        int charge = 20;
        int deduction;
        int remainingBalance;

        deduction = transfer + charge;
        remainingBalance = openingBalance - deduction;

        System.out.println("WALLET TRANSFER");
        System.out.println("Sent: P" + transfer);
        System.out.println("Service charge: P" + charge);
        System.out.println("Remaining balance: P" + remainingBalance);
    }
}