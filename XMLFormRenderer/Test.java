import java.util.*;

class Result {
    public static long getMinimumSize(List<Integer> payloadSize, List<Integer> cacheA, List<Integer> cacheB, int minThreshold) {
        // Lists for categorizing requests
        List<Integer> both = new ArrayList<>();
        List<Integer> onlyA = new ArrayList<>();
        List<Integer> onlyB = new ArrayList<>();
        
        // Separate requests based on cache eligibility
        for (int i = 0; i < payloadSize.size(); i++) {
            if (cacheA.get(i) == 1 && cacheB.get(i) == 1) {
                both.add(payloadSize.get(i));
            } else if (cacheA.get(i) == 1) {
                onlyA.add(payloadSize.get(i));
            } else if (cacheB.get(i) == 1) {
                onlyB.add(payloadSize.get(i));
            }
        }

        // Sort lists to prioritize smaller payloads
        Collections.sort(both);
        Collections.sort(onlyA);
        Collections.sort(onlyB);

        // Min-heap for combining minimal payloads
        int aCount = 0, bCount = 0;
        long totalSum = 0;

        // Add from "both" to serve both caches
        for (int i = 0; i < both.size() && (aCount < minThreshold || bCount < minThreshold); i++) {
            totalSum += both.get(i);
            aCount++;
            bCount++;
        }

        // Add from "onlyA" to meet minThreshold
        for (int i = 0; i < onlyA.size() && aCount < minThreshold; i++) {
            totalSum += onlyA.get(i);
            aCount++;
        }

        // Add from "onlyB" to meet minThreshold
        for (int i = 0; i < onlyB.size() && bCount < minThreshold; i++) {
            totalSum += onlyB.get(i);
            bCount++;
        }

        // If thresholds not met, return -1
        if (aCount < minThreshold || bCount < minThreshold) {
            return -1;
        }

        return totalSum;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Case 1
        List<Integer> payloadSize1 = Arrays.asList(10, 8, 12, 4, 5, 25);
        List<Integer> cacheA1 = Arrays.asList(1, 0, 1, 1, 0, 1);
        List<Integer> cacheB1 = Arrays.asList(0, 1, 0, 1, 1, 1);
        int minThreshold1 = 3;
        System.out.println("Output Test Case 1: " + Result.getMinimumSize(payloadSize1, cacheA1, cacheB1, minThreshold1)); // Expected: 31

        // Test Case 2
        List<Integer> payloadSize2 = Arrays.asList(2, 1, 3);
        List<Integer> cacheA2 = Arrays.asList(1, 1, 0);
        List<Integer> cacheB2 = Arrays.asList(0, 1, 1);
        int minThreshold2 = 1;
        System.out.println("Output Test Case 2: " + Result.getMinimumSize(payloadSize2, cacheA2, cacheB2, minThreshold2)); // Expected: 1

        // Test Case 3
        List<Integer> payloadSize3 = Arrays.asList(3, 2, 4, 1, 5);
        List<Integer> cacheA3 = Arrays.asList(0, 0, 0, 0, 1);
        List<Integer> cacheB3 = Arrays.asList(1, 1, 0, 1, 1);
        int minThreshold3 = 2;
        System.out.println("Output Test Case 3: " + Result.getMinimumSize(payloadSize3, cacheA3, cacheB3, minThreshold3)); // Expected: 4

        // Test Case 4
        List<Integer> payloadSize4 = Arrays.asList(2, 1, 3);
        List<Integer> cacheA4 = Arrays.asList(1, 1, 0);
        List<Integer> cacheB4 = Arrays.asList(0, 1, 1);
        int minThreshold4 = 2;
        System.out.println("Output Test Case 4: " + Result.getMinimumSize(payloadSize4, cacheA4, cacheB4, minThreshold4)); // Expected: -1

    }
}
