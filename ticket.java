import java.util.*;
import java.util.Scanner;
import java.lang.*;
class TicketBooking
{
private String stageEvent;  //all private variable
private String  customer;
private int noofSeats;
TicketBooking() // default constructor
{
stageEvent="null";
customer="null";
noofSeats=0;
}
TicketBooking(String stageEvent,String  customer,int noofSeats) // parameterized constructor
{
this.stageEvent=stageEvent;
this.customer=customer;
this.noofSeats=noofSeats;   //setter
}
public String getter() //getter
{
return stageEvent;
}
public String getter1()
{
return customer;
}
public int getterint()
{
return noofSeats;
}
public void makePayment(double amount) //payment by cash and display
{
double xamount=amount;
System.out.println("\nStage Event: "+stageEvent);
System.out.println("Customer: "+customer);
System.out.println("Number of seats: "+noofSeats);
System.out.println("Amount paid Rs."+xamount+" in cash");
}
public void makePayment(String walletNumber ,double amount) //payment by wallet and display
{                                          //overloading
double xamount=amount;
String walletno=walletNumber;
System.out.println("\nStage Event: "+stageEvent);
System.out.println("Customer: "+customer);
System.out.println("Number of seats: "+noofSeats);
System.out.println("Amount paid Rs."+xamount+" using wallet number: "+walletno);
}
public void makePayment(String creditCard,String ccv,String name,double amount)	
{            //payment by credit card
double xamount=amount;
String card=creditCard;
String CCV=ccv;
String nm=name;
System.out.println("\nStage Event: "+stageEvent);
System.out.println("Customer: "+customer);
System.out.println("Number of seats: "+noofSeats);
System.out.println("Holder name:"+nm);
System.out.println("Amount paid Rs."+xamount+" using "+card+"and CCV:"+CCV);
}
}
class MAIN
{
public static void main(String...args)
{
Scanner input=new Scanner(System.in);
Scanner dis=new Scanner(System.in);
String stageEvent;
String  customer;
String line;
int noofSeats;
String[] lineVector;
System.out.println("\nPlease enter the deatails Separated by *,*");
System.out.println("\nFormat of INPUT: STAGE EVENT , CUSTOMER , NUMBER OF SEATS");
line = dis.nextLine(); //cvv format input
lineVector = line.split(",");
stageEvent=lineVector[0]; //stroring respective value
customer=lineVector[1];
noofSeats=Integer.parseInt(lineVector[2]); //changing string to int 
TicketBooking obj=new TicketBooking(stageEvent,customer,noofSeats); //to get requried function
int ch;
System.out.println("Payment Mode:");
System.out.println("1.Cash payment");
System.out.println("2.Wallet payment");
System.out.println("3.Credit card payment");
System.out.println("Please press the VALID key");
ch=input.nextInt();
switch(ch)
{
case 1:
double xamount;
System.out.println("Please enter the amount: ");
xamount=input.nextDouble();
obj.makePayment(xamount);
break;
case 2:
double yamount;
System.out.println("Please enter the amount: ");
yamount=input.nextDouble();
String walletNumber;
System.out.println("Please enter the your walletNumber: ");
walletNumber=dis.nextLine();
obj.makePayment(walletNumber,yamount);
break;
case 3:
String creditCard;
String ccv;
String name;
double zamount;
System.out.println("Please enter the your card holder name: ");
name=dis.nextLine();
System.out.println("Please enter the amount: ");
zamount=input.nextDouble();
System.out.println("Please enter the credit card type: ");
creditCard=dis.nextLine();
System.out.println("Please enter the CCV number: ");
ccv=dis.nextLine();
obj.makePayment(creditCard,ccv,name,zamount);
break;
default:
System.out.println(" Please Enter valid Option");
break;
}
}
}




























