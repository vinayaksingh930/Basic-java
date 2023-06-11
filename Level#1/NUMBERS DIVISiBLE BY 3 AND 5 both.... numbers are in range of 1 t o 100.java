
public class Main
{
public static void main(String[] args) {
int a[]=new int[100];
int k=1;
for (int i=0;i<100;i++){
a[i]=k;
k++;
}
for(int i=0;i<100;i++){
if(a[i]%3==0 && a[i]%5==0){
System.out.println(a[i]);
}
}
}
} 
