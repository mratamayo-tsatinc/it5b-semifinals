/*
@codescope
@title Scholarship Screening
@seed grade min=82 max=96
@seed attendance min=80 max=100
@seed grant min=1000 max=2000 step=250
*/

public class ScholarshipScreen
{
    public static void main(String[] args)
    {
        int grade = 90;
        int attendance = 94;
        int grant = 1500;
        int approvedGrant = 0;

        if (grade >= 88) {
            if (attendance >= 90) {
                approvedGrant = grant;
            }
        }

        System.out.println("SCHOLARSHIP SCREENING");
        System.out.println("Approved assistance: Php. " + approvedGrant);
    }
}