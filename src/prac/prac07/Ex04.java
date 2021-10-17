package prac.prac07;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {// Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램

    public static void main(String[] args) {
        Vector<Integer> stack = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("강수량 입력 (0 입력 시 종료) >> ");
            int num = sc.nextInt();
            if(num == 0)
                break;
            stack.add(num);
            int avg = 0;
            for(int i = 0; i<stack.size(); i++ ){
                System.out.print(stack.get(i)+ " ");
                avg += stack.get(i);
            }
            System.out.println();
            avg /= stack.size();
            System.out.println("현재 평균: " + avg);
        }
        sc.close();
    }
}
