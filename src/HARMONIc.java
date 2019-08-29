import java.util.Scanner;

public class HARMONIc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0,n,i;
        System.out.println("enter the value of N upto which you want sum of harmonic series:");
        n=sc.nextDouble();
        for(i=1;i<=n;i++){
            sum=sum+(1/i);
        }
        System.out.println("the sum of the series is:"+sum);


    }

}
