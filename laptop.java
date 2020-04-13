import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class Laptop
{

int [] price=new int[50]; // setting array to store maximum 50 element
int[] model_number=new int[50];;
int [] ram=new int[50];
void getdata(int n){ //input function
int no=n;
for(int i=0;i<no;i++) // to get n number of data
{
Scanner input = new Scanner(System.in);
System.out.println("Enter all the details for the laptop number "+i);
System.out.println("Enter the Ram");
ram[i]=input.nextInt();
System.out.println("Enter the model");
model_number[i]=input.nextInt();
System.out.println("Enter the Price");
price[i]=input.nextInt();
}
}
void sortbyram(int a) //sorting all the data with respect to ram in increaing order
{
int m=a;
int temp;
int temp1;
int temp2;                               //here I am using insertion sort
for (int i = 1; i <m; i++) {
for (int j = i; j > 0; j--) {
if (ram[j] > ram [j - 1]) {
temp = ram[j];
ram[j] = ram[j - 1];
ram[j - 1] = temp;
temp1 = price[j];
price[j] = price[j - 1];
price[j - 1] = temp1;
temp2= model_number[j];
model_number[j] = model_number[j - 1];
model_number[j - 1] = temp2;
}
}
}
for(int i=0;i<m;i++)
{
System.out.println("Model Number: "+model_number[i]);
System.out.println("Price: "+price[i]);
System.out.println("RAM: "+ram[i]);
}
}
void sortbyprice(int a) //sorting all the data with respect to price in decreasing order
{
int m=a;
int temp;
int temp1;
int temp2;
for (int i = 1; i < m; i++) {
for (int j = i; j > 0; j--) {
if (price[j] < price [j - 1]) {
temp = ram[j];
ram[j] = ram[j - 1];
ram[j - 1] = temp;
temp1 = price[j];
price[j] = price[j - 1];
price[j - 1] = temp1;
temp2= model_number[j];
model_number[j] = model_number[j - 1];
model_number[j - 1] = temp2;
}
}
}
for(int i=0;i<m;i++)
{
System.out.println("Model Number: "+model_number[i]);
System.out.println("Price: "+price[i]);
System.out.println("RAM: "+ram[i]);
}
}
void model(int x,int a) // to search by a key
{
int m=a;
int key=x;
int [] dummy=new int[50];
for(int i=0;i<m;i++)
{
dummy[i]=model_number[i];
while(dummy[i]>0)
{
if(dummy[i]%10==key) //getting one digit and comparing it with a key
{
System.out.println("Model Number: "+model_number[i]);
System.out.println("Price: "+price[i]);
System.out.println("RAM: "+ram[i]);
break;
}
dummy[i]=dummy[i]/10;
}
}
}
}
class main
{
public static void main(String...args) //main
{
Laptop obj=new Laptop();
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many laptop information you want to feed:"); //getting number of input
a=sc.nextInt();
obj.getdata(a);
System.out.println("1:ram 2:price 3:model"); //switch case to follow required method
int c=sc.nextInt();       
switch(c){          
case 1:
obj.sortbyram(a);
break;
case 2:
obj.sortbyprice(a);
break;
case 3:
int k;
System.out.println("Please eneter 1 digit key to search");
k=sc.nextInt();
obj.model(k,a);
break;
default:
System.out.println("Enter valid entry");
break;
}
}
}




















