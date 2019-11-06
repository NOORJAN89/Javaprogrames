
public class PowerCommandLine{

	public static void main(String[] args) {
	int n = 0;
	try {
		n = Integer.parseInt(args[0]);
	} catch (NumberFormatException e) {
	
		//e.printStackTrace();
	}
	int res = 1;
	System.out.println(args[0]);
	
for(int i=0; i<=n; i++) {
	res=2*res;
	System.out.println(2+"^"+i+"="+res);
}
	}

}
