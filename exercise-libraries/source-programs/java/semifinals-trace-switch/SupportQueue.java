/*
@codescope
@title Support Queue
@seed issueCode min=1 max=4
@seed waiting min=5 max=20 step=5
*/

public class SupportQueue
{
    public static void main(String[] args)
    {
        int issueCode = 3;
        int waiting = 10;
        int desk;

        switch (issueCode)
        {
            case 1:
                desk = 101;
                break;
            case 2:
                desk = 202;
                break;
            case 3:
                desk = 303;
                break;
            default:
                desk = 404;
        }

        System.out.println("SUPPORT QUEUE");
        System.out.println("Proceed to desk " + desk);
        System.out.println("Estimated wait: " + waiting + " minutes");
    }
}