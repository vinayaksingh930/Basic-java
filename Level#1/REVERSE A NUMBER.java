import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int a =sc.nextInt();
int rem,num=0;

while(a!=0){
rem=a%10;
num=(num*10)+rem;
a=a/10;

}
System.out.println(num);
}
}
