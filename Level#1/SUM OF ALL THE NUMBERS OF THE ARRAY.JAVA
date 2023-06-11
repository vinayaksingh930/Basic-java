public class Main
{
public static void main(String[] args) {
int a[]=new int[10];
int k=1,sum=0;
for (int i=0;i<10;i++){
a[i]=k;
k++;
sum+=a[i];
}
System.out.println(sum);

}
} 
