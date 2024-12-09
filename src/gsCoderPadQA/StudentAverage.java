package gsCoderPadQA;

import java.util.*;

public class StudentAverage {

        public static void main(String[] args) {
            List<Map.Entry<String, Integer>> students = Arrays.asList(
                    new AbstractMap.SimpleEntry<>("Charles", 84),
                    new AbstractMap.SimpleEntry<>("John", 100),
                    new AbstractMap.SimpleEntry<>("Andy", 67),
                    new AbstractMap.SimpleEntry<>("John", 22)
            );

            System.out.println(findMaxAverage(students));
        }

        public static double findMaxAverage(List<Map.Entry<String, Integer>> students) {
            Map<String, int[]> studentScores = new HashMap<>();

            // Aggregate scores by student name
            for (Map.Entry<String, Integer> student : students) {
                String name = student.getKey();
                int score = student.getValue();

                studentScores.putIfAbsent(name, new int[]{0, 0});  // Initialize score and count array
                int[] scoreData = studentScores.get(name);
                scoreData[0] += score;  // Sum of scores
                scoreData[1] += 1;      // Count of scores
            }

            // Calculate the max average
            double maxAverage = Double.MIN_VALUE;
            for (Map.Entry<String, int[]> entry : studentScores.entrySet()) {
                int[] scoreData = entry.getValue();
                double average = (double) scoreData[0] / scoreData[1];
                if (average > maxAverage) {
                    maxAverage = average;
                }
            }

            return maxAverage;
        }
}

