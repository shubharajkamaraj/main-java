/* Java program to declare a variable of byte data type, check whether it is a whole number or not */


import java.util.Scanner;

class Wholenumber 
{
public static void main(String args[])
{
byte b1;
Scanner scin=new Scanner(System.in);
System.out.println("Enter the byte value : ");
b1=scin.nextByte();
if(b1>=0)
{
System.out.println("It is Whole Number ");
}
else
{
System.out.println("It is not Whole Number ");
}

}
}


// Output

C:\Users\User1\Desktop\java programs>javac Wholenumber.java

C:\Users\User1\Desktop\java programs>java Wholenumber
Enter the byte value :
10
It is Whole Number

C:\Users\User1\Desktop\java programs>java Wholenumber
Enter the byte value :
-5
It is not Whole Number