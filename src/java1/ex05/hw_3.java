package java1.ex05;

import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.print("점수 입력: ");
        score=sc.nextInt();

        if(score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}