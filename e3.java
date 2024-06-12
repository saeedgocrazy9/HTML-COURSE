import java.io.*;
import java.util.*;
public class e3{
public static void main(String[] args)throws IOException{
String str1;
try{
DataInputStream in=new DataInputStream(System.in);
System.out.println("ANSARI MUHAMMED SAEED ROLL NO: 220408");
System.out.println();

System.out.println("Enter the string");
str1=in.readLine();
if(str1.equals("India")){
System.out.println("String matched");
}
else{
throw new exc3("String No matchexception");
}}
catch(exc3 e1){
System.out.println(e1);}}}