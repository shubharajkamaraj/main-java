/* Java program to accept the character and check whether it is vowel or consonant */


import java.util.Scanner;

class Vowelconsonant 
{
public static void main(String args[])
{
char ch;
Scanner scin=new Scanner(System.in);
System.out.println("Enter the Character: ");
ch=scin.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
System.out.println("It is Vowel ");
}
else
{
System.out.println("It is Consonant ");
}

}
}


// Output


C:\Users\User1\Desktop\java programs>java Vowelconsonant
Enter the Character:
q
It is Consonant

C:\Users\User1\Desktop\java programs>java Vowelconsonant
Enter the Character:
o
It is Vowel