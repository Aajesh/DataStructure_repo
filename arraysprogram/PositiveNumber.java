import java.util.Scanner;

public class PositiveNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input =scanner.nextInt();
        System.out.println(solution(input));
    }

    private static  int solution(int input) {
        
        String ans="";

       for (int div = 9; div>=2; div--) {
            while(input%div ==0){
                input = input/div;
                ans=div+ans;
            }
       }

       if(input!=1){
        return -1;
       }else{
        return Integer.parseInt(ans);
       }
    }
}