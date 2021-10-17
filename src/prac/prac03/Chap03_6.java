package prac.prac03;

import java.util.Scanner;

public class Chap03_6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]unit={50000,10000,1000,500,100,50,10,1};

        System.out.print("금액을 입력하시오>>");
        int m=sc.nextInt();

        for(int i=0; i<unit.length; i++){
            if(m/unit[i]!=0){
                System.out.println(unit[i]+"원 짜리: "+m/unit[i]+"개");
                m%=unit[i];
            }
       }
        sc.close();
    }
}
