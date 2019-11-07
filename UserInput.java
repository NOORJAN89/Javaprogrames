import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
InputStreamReader ir= new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(ir);
System.out.println(" enter any string");
String inputString=br.readLine();
System.out.println(" you entered "+inputString);
//System.out.println("\" hello!\"");


	}

}
