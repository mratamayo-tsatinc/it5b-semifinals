/*
@codescope
@title Clinic Queue Assignment
@seed serviceCode min=1 max=3
@seed patientAge min=16 max=72 step=7
@seed waiting min=10 max=40 step=5
*/

public class ClinicQueue
{
    public static void main(String[] args)
    {
        int serviceCode = 2;
        int patientAge = 65;
        int waiting = 25;
        int room;
        int queueNumber;

        switch (serviceCode)
        {
            case 1:
                room = 101;
                break;
            case 2:
                room = 205;
                break;
            default:
                room = 310;
        }

        queueNumber = serviceCode * 100 + waiting;

        if (patientAge >= 60) {
            queueNumber = queueNumber - 10;
        }
        System.out.println("======================");
        System.out.println("CLINIC QUEUE");
        System.out.println("======================");
        System.out.println("Proceed to room " + room);
        System.out.println("Queue number: " + queueNumber);
    }
}