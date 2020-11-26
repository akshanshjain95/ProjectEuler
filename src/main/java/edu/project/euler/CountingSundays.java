package edu.project.euler;

public class CountingSundays {

    public static void main(String[] args) {
        int leapYearCount = 0;
        int startYear = 1901;
        int endYear = 2001;

        for (int i=startYear ; i<endYear ; i++) {
            if (isLeapYear(i)) {
                leapYearCount++;
            }
        }

        int totalDays = ((endYear - startYear) * 365) + leapYearCount;
        int currYear = startYear;
        int currMonth = 0; //January
        int currDay = 1; //Monday
        int sundayCount = 0;

        for (int i=0 ; i<totalDays ; ) {
            if (currMonth == 0 || currMonth == 2 || currMonth == 4 || currMonth == 6 || currMonth == 7 || currMonth == 9 || currMonth == 11) {
                i += 31;
                currDay = (currDay + (31 % 7)) % 7;

                if (currMonth == 11) {
                    currYear++;
                }
            } else if (currMonth == 1) {
                if (isLeapYear(currYear)) {
                    i += 29;
                    currDay = (currDay + (29 % 7)) % 7;
                } else {
                    i += 28;
                    currDay = (currDay + (28 % 7)) % 7;
                }
            } else {
                i += 30;
                currDay = (currDay + (30 % 7)) % 7;
            }

            currMonth = (currMonth + 1) % 12;

            if (currDay == 6) {
//                System.out.println("current month --> " + currMonth);
//                System.out.println("current year --> " + currYear);
                sundayCount++;
            }

        }

        System.out.println(sundayCount);
    }

    private static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else return year % 4 == 0;

    }
}
