package javacoreclasses;

import java.util.Scanner;

public class cricket {

    public static void main(String[] args) {
    int[] run = new int[100];

        System.out.println("Enter the Match you played");
        Scanner s = new Scanner(System.in);
        int match = s.nextInt();
        Scanner r  = new Scanner(System.in);
            int i ;
        for (  i=1 ; i<=match; i++){
            System.out.println("Enter the run of "+ i + " Matches" );
            run[i] = r.nextInt();
        }

        for (  i=1 ; i<=match; i++){
            System.out.println("value " + run[i]  );
            // run[i] = r.nextInt();
        }
        s.close();
        r.close();
        // int len = run.length(i);

        int sum = 0;
        for (int j=1; j<=match; j++){
            sum = sum + run[j];
            
        }
        System.out.println("sum value is"+ sum + "match value"+ match);
        float ans = sum / match;

        System.out.println("Your All Matches of Average score is" + ans);
        


    }

}
