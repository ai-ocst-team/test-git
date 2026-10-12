package HW1;

public class p1 {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            // n: 0~100 (include 100) integer
            int n = (int)(101*Math.random());
            if(n <= 50) {
                System.out.print("Random number : " + n + " -> 0 ~ 50,");
            } else {
                System.out.print("Random number : " + n + " -> 51 ~ 100,");
            }
            if(n%2 == 0) {
                System.out.println(" even");
            } else {
                System.out.println(" odd");
            }
        }
    }
}

