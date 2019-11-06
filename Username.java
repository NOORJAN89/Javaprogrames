import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
String s1="“Hello <<UserName>>, How are you?”";
System.out.println("enter username with more than 02 characeters");
String s2=sc.nextLine();
String s3=s1.replace("UserName", s2);
System.out.println(s3);

	}

}
