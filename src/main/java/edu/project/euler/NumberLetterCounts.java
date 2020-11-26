package edu.project.euler;

import java.util.HashMap;
import java.util.Map;

public class NumberLetterCounts {

    public static void main(String[] args) {
        Map<Integer, String> strRep = new HashMap<>();

        strRep.put(1, "one");
        strRep.put(2, "two");
        strRep.put(3, "three");
        strRep.put(4, "four");
        strRep.put(5, "five");
        strRep.put(6, "six");
        strRep.put(7, "seven");
        strRep.put(8, "eight");
        strRep.put(9, "nine");
        strRep.put(10, "ten");
        strRep.put(11, "eleven");
        strRep.put(12, "twelve");
        strRep.put(13, "thirteen");
        strRep.put(14, "fourteen");
        strRep.put(15, "fifteen");
        strRep.put(16, "sixteen");
        strRep.put(17, "seventeen");
        strRep.put(18, "eighteen");
        strRep.put(19, "nineteen");
        strRep.put(20, "twenty");
        strRep.put(30, "thirty");
        strRep.put(40, "forty");
        strRep.put(50, "fifty");
        strRep.put(60, "sixty");
        strRep.put(70, "seventy");
        strRep.put(80, "eighty");
        strRep.put(90, "ninety");
        strRep.put(1000, "onethousand");

        int sum = 0;
        for (int i=1 ; i<=1000 ; i++) {
            String rep = strRep.get(i);

            if (rep != null) {
                sum += rep.length();
            } else {
                if (i < 100) {
                    String twoNumStr = getTwoNumString(strRep, i);
                    sum += twoNumStr.length();
                } else {
                    String threeNumStrInDigits = String.valueOf(i);
                    String hunderStr = strRep.get(Integer.parseInt(threeNumStrInDigits.charAt(0) + ""));
                    String twoNumStr = getTwoNumString(strRep, Integer.parseInt(threeNumStrInDigits.substring(1)));

                    String threeNumStr = hunderStr + " hundred and " + twoNumStr;
                    if ("null".equals(twoNumStr)) {
                        threeNumStr = hunderStr + " hundred";
                    }
                    threeNumStr = threeNumStr.replaceAll(" ", "");
                    sum += threeNumStr.length();
                }
            }
        }

        System.out.println(sum);
    }

    private static String getTwoNumString(Map<Integer, String> strRep, int i) {
        int temp = i;

        if (strRep.get(i) != null) {
            return strRep.get(i);
        }

        int lastDigit = temp%10;
        int tensNum = temp - lastDigit;

        return strRep.get(tensNum) + (lastDigit != 0 ? strRep.get(lastDigit) : "");
    }
}
