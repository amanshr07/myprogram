import java.util.*;
class IPL_Team
{
String team_name;
String wicketkeeper, allrounder,Captain;
IPL_Team()
{}
IPL_Team(String team_name,String wicketkeeper,String allrounder,String Captain)
{
this.team_name=team_name;
this.wicketkeeper=wicketkeeper;
this.allrounder=allrounder;
this.Captain=Captain;
}
private class Player
{
String player_name;
int price;
Player(String player_name,int price)
{
this.player_name=player_name;
this.price=price;
}
}
Player obj=new Player(" Dhoni",12000);
Player obj1=new Player("Virat",19000);
Player obj2=new Player("Rohit",10000);
void display()
{
System.out.println(team_name+"\t"+wicketkeeper+"\t"+allrounder+"\t"+Captain);
}
int find()
{
if(obj.price>=obj1.price && obj.price>=obj2.price)
return 1;
else if(obj1.price>=obj.price && obj1.price>=obj2.price)
return 2;
else
return 3;
}}
class main
{
public static void main(String...args)
{
ArrayList list=new ArrayList();
IPL_Team obj=new IPL_Team("Chennai Super Kings"," Deepak Chahar"," Monu Singh","Dhoni");
IPL_Team obj1=new IPL_Team("Royal Challengers Bangalore"," Dinesh Karthik"," Nitish Rana","Virat");
IPL_Team obj2=new IPL_Team("Kings XI Punjab"," KL Rahul"," Murugan Ashwin","Rohit");
list.add(obj);
list.add(obj1);
list.add(obj2);
IPL_Team oo=new IPL_Team();
int c=oo.find();
if(c==1)
obj.display();
else if(c==2)
obj1.display();
else
obj2.display();
}
}
