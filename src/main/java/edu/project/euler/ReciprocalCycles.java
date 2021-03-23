package edu.project.euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReciprocalCycles {

    public static void main(String[] args) {
        int longestRecurringCycle = 0;
        int index = -1;

        for (int i=2 ; i<1000 ; i++) {
            int sizeOfRecurringCycle = sizeOfRecurringCycle(1, i);

            if (longestRecurringCycle < sizeOfRecurringCycle) {
                longestRecurringCycle = sizeOfRecurringCycle;
                index = i;
            }
        }

        System.out.println(index);
    }

    private static int sizeOfRecurringCycle(int n, int d) {
        int result = n / d;
        int rem = n % d;
        Map<Integer, Integer> qToIndex = new HashMap<>();
        int startIndex = -1;
        List<Integer> quos = new ArrayList<>();
        int currIndex = 0;

        while (rem != 0) {
            n = rem * 10;
            rem = n % d;
            int quo = n / d;

            if (qToIndex.containsKey(n)) {
                startIndex = qToIndex.get(n);
                break;
            } else if (rem == 0) {
                quos.add(quo);
                break;
            } else {
                qToIndex.put(n, currIndex++);
                quos.add(quo);
            }
        }

        if (startIndex != -1) {
            return quos.size() - startIndex;
        } else {
            return 0;
        }
    }
}
