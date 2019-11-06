
public class WindChill {

	public static void main(String[] args) {
double t=Integer.parseInt(args[0]);

double ws=Integer.parseInt(args[1]);



if(t<50 && (ws >3 || ws< 120))
{
	temparature(t, ws);

}
else {
	System.out.println(" enter temparure below 50 and wind speed in the range between 3 nad 120 ");
}
	}

	 static void temparature(double t1, double v1) {
		
		 double w = 35.74 + 0.62158 * t1 + (0.4275 * t1 - 35.75) * Math.pow(v1, 0.16);
			System.out.println(w);

	}

}
