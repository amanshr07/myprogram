import java.util.*; 
import java.io.*; 
import java.util.Scanner;
interface UGC 
{ int regno=1234; //already given registration number
String payFee(); //abstract method
static int getAdmission(){
return regno;
}

}
interface AICTE
{ int tokenno=123;
String payFee(); // abstract method
static int getAdmission() //overridding
{
return tokenno;
}


}
class university implements UGC,AICTE //inheritance
{

String fee_due;
static double percentage;
static int getAdmission() //over ridding
{
Scanner input=new Scanner(System.in);
System.out.print("Enter your Percentage: ");
percentage=input.nextDouble();
if(percentage>=60) //direct addmission
{
UGC obj1=new university(); // object creation
System.out.println("Congratulation your Admission is Successfull!"); 
System.out.println("Your Registration number is: "+obj1.regno);
}
else{ // Counseling
AICTE obj=new university();
System.out.println("\nPlease join the counseling after 5 days");
System.out.println("Counseling date:14/11/2020 \nTime: 2:00pm ");
System.out.println("\nYour counseling token number is: "+obj.tokenno);
}
return 0;
}
public String payFee() //overriding
{
if(percentage>=60) //setting already given fee
{
fee_due="25000";
return fee_due;
}
else{
fee_due="34000";
return  fee_due;
}
}
}
class LPU extends university //inheritance
{
static int getAdmission() //overriding
{
university obj1=new university();
obj1.getAdmission();
return 0;
}
public String payFee() //overriding
{
Scanner input=new Scanner(System.in);
int rc=98123; //receipt number 
rc++;
int amount;
int due_amount;
university obj=new university();
due_amount=Integer.parseInt(obj.payFee()); //converting string to int
System.out.println("\nYour fee due is :"+due_amount);
System.out.println("Please enter your fee");
amount=input.nextInt();
if(amount<=due_amount){
System.out.println("Fee paid Successfully RECEIPT number: " +rc);
System.out.print("\nDue amount: " + (due_amount-amount));
}
else
{
System.out.println("Please enter amount less the Due amount that is: "+due_amount );
}

return "";
}
public static void main(String...args)
{
LPU objx=new LPU(); //objecting calling
objx.getAdmission();
objx.payFee();
}
}