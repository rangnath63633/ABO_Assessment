package gsCoderPadQA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAverageStudent {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Charles", 84),
                new Student("John", 100),
                new Student("Andy", 67),
                new Student("John", 22)
        );

        System.out.println(findMaxAverage(students));

    }

    public static double findMaxAverage(List<Student> students){
        Map<String, int[]> studentScores = new HashMap<>();
                for(Student student : students){
                    String name = student.getName();
                    int score = student.getScore();

                    if(!studentScores.containsKey(name)){
                        studentScores.put(name, new int[]{0,0});
            }
            int[] scoreData = studentScores.get(name);
            scoreData[0] += score;
            scoreData[1] += 1;
        }

        double maxAverage = Double.MIN_VALUE;

        for(Map.Entry<String, int[]> entry : studentScores.entrySet()){
            int[] scoreData = entry.getValue();
            double average = (double) scoreData[0]/scoreData[1];
            if(average > maxAverage){
                maxAverage = average;
            }
        }


        return maxAverage;
    }

    static class Student{
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
}



//Map<String, Integer> studentScores = new HashMap<>();
//        for(Student student : students){
//String name = student.getName();
//int score = student.getScore();
//
//            studentScores.put(name, studentScores.getOrDefault(name,0)+score);

//  for(Map.Entry<String, Integer> entry : studentScores.entrySet()){
//int scoreData = entry.getValue();
//double average =
//        }