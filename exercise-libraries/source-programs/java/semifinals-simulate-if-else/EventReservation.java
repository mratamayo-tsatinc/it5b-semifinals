/*
@codescope
@title Event Reservation
@seed guests min=18 max=38 step=2
@seed hallCapacity min=24 max=32 step=2
@seed mealCost min=180 max=240 step=20
@seed deposit min=1000 max=1600 step=200
*/

public class EventReservation
{
    public static void main(String[] args)
    {
        int guests = 28;
        int hallCapacity = 30;
        int mealCost = 200;
        int deposit = 1200;
        int reservationCost;
        boolean accepted;

        reservationCost = guests * mealCost;

        if (guests <= hallCapacity) {
            accepted = true;
            reservationCost = reservationCost - deposit;
        } else {
            accepted = false;
            reservationCost = deposit;
        }

        System.out.println("EVENT RESERVATION");
        System.out.println("Reservation status: " + accepted);
        System.out.println("Balance for processing: Php. " + reservationCost);
    }
}