/*
@codescope
@title Equipment Rental
@seed equipmentCode min=1 max=4
@seed days min=2 max=6
@seed insurance min=50 max=100 step=25
*/

public class EquipmentRental
{
    public static void main(String[] args)
    {
        int equipmentCode = 3;
        int days = 4;
        int insurance = 75;
        int dailyRate;
        int rentalTotal;

        switch (equipmentCode)
        {
            case 1:
                dailyRate = 150;
                break;
            case 2:
                dailyRate = 220;
                break;
            case 3:
                dailyRate = 300;
                break;
            default:
                dailyRate = 120;
        }

        rentalTotal = days * dailyRate + insurance;

        System.out.println("EQUIPMENT RENTAL");
        System.out.println("======================");
        System.out.println("Rental period: " + days + " days");
        System.out.println("Amount payable: Php. " + rentalTotal);
        System.out.println("======================");
    }
}