package Atividades_IfElse;
import java.util.Scanner;

public class Atv1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int x = sc.nextInt();
        if (x>0){
            System.out.printf(x+">0");
        }else if(x<0){
            System.out.printf(x+"<0");
        }else{
            System.out.println(x+"=0");
        }
    }
}