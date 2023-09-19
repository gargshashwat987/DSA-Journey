import java.util.*;
public class binaryString{
    public static void printB(int n , int lp, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printB(n-1,0,str+"0");
        if(lp==0){
            printB(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in) ; 
        System.out.println("enter the bits of binary number:");
        int n= sc.nextInt();
        printB(n,0," ");
    }
}