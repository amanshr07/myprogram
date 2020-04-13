import java.util.*;
import java.util.Scanner;
class xvoter
{
String name;
String DOB;
int age;
int id;
String status;
xvoter(String name, String DOB,int age, int id,String status) //parameterized constructor
{
this.name=name;
this.DOB=DOB;
this.age=age;
this.status=status;
if(age>=18) //for age validation
{
this.id=id;
}
}
class voter_card{      //nested class
String votername;
int voterid;
voter_card(String votername,int voterid)
{
this.votername=votername;
this.voterid=voterid;
}}
void display()
{
voter_card x=new voter_card(name,id);
System.out.println("\nName: "+ x.votername +"\nVoter_ID: "+ x.voterid +"\nDOB: "+ DOB +"\nAge: "+age +"\nSTATUS= "+status);
}
}
class xmain
{
public static void main(String...args)
{
Scanner input=new Scanner(System.in);
Scanner input1=new Scanner(System.in);
int n;
System.out.println("Enter number of objects you want to create");
n=input.nextInt();
xvoter obj[]=new xvoter[n]; //array of object
int x=120092;
for(int i=0;i<n;i++) //input
{
System.out.println("Enter your name");
String name=input1.nextLine();
System.out.println("Enter your Date of Birth (__/__/____)");
String dob=input1.nextLine();
System.out.println("Enter your age");
int age=input.nextInt();
if(age>=18){
obj[i]=new xvoter(name,dob,age,++x,"CREATED SUCCESSFULLY");
}
else{
obj[i]=new xvoter(name,dob,age,0,"UNSUCCESSFULL");
}
}
for(int i=0;i<n;i++) //function calling
{
obj[i].display();
}
}
}





 
