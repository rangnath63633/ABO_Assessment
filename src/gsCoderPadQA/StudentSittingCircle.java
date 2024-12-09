package gsCoderPadQA;

public class StudentSittingCircle {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        System.out.println("The elected student is: " + findElectedStudent(n, k));
    }
    public static int findElectedStudent(int n, int k){
            return student(n,k)+1;
    }
    private static int student(int n, int k){
        if(n == 1){
            return 0;
        }else{
            return (student(n-1,k) + k) % n;
        }
    }
}
