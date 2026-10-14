/*
@codescope
@title Equipment Inspection
@seed operatingHours min=80 max=160 step=10
@seed serviceLimit min=100 max=140 step=10
@seed maintenanceDays min=2 max=5
*/

public class EquipmentInspection
{
    public static void main(String[] args)
    {
        int operatingHours = 130;
        int serviceLimit = 120;
        int maintenanceDays = 3;
        int downtime = 0;

        if (operatingHours >= serviceLimit) {
            downtime = maintenanceDays;
        }

        System.out.println("EQUIPMENT INSPECTION");
        System.out.println("Scheduled downtime: " + downtime + " days");
    }
}