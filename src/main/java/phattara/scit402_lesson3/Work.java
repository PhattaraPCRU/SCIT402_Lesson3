/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phattara.scit402_lesson3;
import java.util.Scanner;

/**
 *
 * @author koonp
 */
public class Work {
    /*Public Obj Below Here*/
    public static Scanner scn = new Scanner(System.in);
    public static <PrintableToString> void p(PrintableToString... args) {
        for(PrintableToString pts: args)
            System.out.print(pts);
        //System.out.println();
    }
    /*Work Below Here*/
    public static void samp31(){
        System.out.print("Input score : ");
        int score = scn.nextInt();
        if(score<50){
            p("Fail");
        }
        scn.close();
    }
    public static void samp32(){
        p("Input score : ");
        int score = scn.nextInt();
        if(score<50){
            p("Grade : E");
        }
        if(score>=50){
            p("Grade : B");
        }
        if(score>=80){
            p("Grade : A");
        }
        scn.close();
    }
    public static void samp33(){
        p("Input score : ");
        int score = scn.nextInt();
        if(score<50){
            p("Fail");
        }else{
            p("Pass");
        }
    }
    public static void samp34(){
        p("Input score : ");
        int score = scn.nextInt();
        if(score<50){
            p("Grade : E");
        }else if(score<80){
            p("Grade : B");
        }else if(score<=100){
            p("Grade : A");
        }
        scn.close();
    }
    public static void samp35(){
        p("Input Number : ");
        int num = scn.nextInt();
        if(num%2==0){
            p("Even");
        }else{
            p("Odd");
        }
    }
    public static void samp36(){
        p("Input day of the week (1-7) : ");
        int dow = scn.nextInt();
        switch(dow){
            case 1:p("Monday"); break;
            case 2:p("Tuesday"); break;
            case 3:p("Wednesday"); break;
            case 4:p("Thursday"); break;
            case 5:p("Friday"); break;
            case 6:p("Saturday"); break;
            case 7:p("Sunday"); break;
            default:p("Invalid Input");
        }
        scn.close();
    }
    public static void samp37(){
        for(int i=0;i<3;i++){
            p(i+" Thank You.");
        }
    }
    public static void samp38(){
        int i=0;
        for(;i<3;){
            p(i+" Thank You.");
            i++;
        }
    }
    public static void samp39(){
        for(int i=0,j=0;i<3;i++,j+=3){
            p(i+" Thank You.");
            p(j+" time(s).");
        }
    }
    public static void samp310(){
        for(int i=3;i>0;i--){
            p(i+" Thank You.");
        }
    }
    public static void samp311(){
        int num=10,sum=0;
        for(int i=0;i<=num;i++){
            sum=+i;
        }
        p("Sum = "+sum);
    }
    public static void samp311edit(){
        int num,sum=0;
        
        System.out.print("Input Number : ");
        num = scn.nextInt();
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        p("Sum of "+num+" = "+sum);
    }
}
