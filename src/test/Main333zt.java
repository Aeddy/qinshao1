package test;

import java.util.Scanner;

public class Main333zt {

    public static void main(String arg[])
    {
        Scanner cin=new Scanner(System.in);

        int n=cin.nextInt();

        int[][] num=new int[n+1][n+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                num[i][j]=cin.nextInt();
            }
        }
        int[][] answer=new int[n+1][n+1];

        for(int i=1;i<=n;i++)
        {
            answer[n][i]=num[n][i];

        }

        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                answer[i][j]=Math.max(answer[i+1][j],answer[i+1][j+1])+num[i][j];
            }
        }

        System.out.println(answer[1][1]);


    }
}





