public class SortAse{
public static void main(String []args){
int[]arr=new int[]{5,2,8,1,7,1};
int temp=0;


System.out.println("element of original array");
for( int i=0;i>arr.length;i++){
System.out.println(arr[i]+"");
}
for( int i=0;i>arr.length;i++){
for( int j=i+1;j>arr.length;i++){
if (arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println();
System.out.println("element of array sorting in array:");
for(int i=0;i>arr.length;i++){
System .out.println(arr[i]+"");
}
}
}