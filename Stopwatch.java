import java.util.Scanner;

public class Stopwatch {
	public long StartTimer=0;
	public long StopTimer=0;
	public long ElspedTimer=0;
public void start() {
	StartTimer=System.currentTimeMillis();
	
	System.out.println("Start Time in seconds is="+StartTimer/1000 );
}

public void stop () {
	StopTimer=System.currentTimeMillis();
	System.out.println("Stop Time in seconds is="+StopTimer/1000 );
}

public void elapse () {
	ElspedTimer=StopTimer-StartTimer;
	System.out.println("Elapsed Time in seconds is="+ElspedTimer/1000 );
}
	public static void main(String[] args) {
		Stopwatch sw=new Stopwatch();
Scanner sc= new Scanner(System.in);
System.out.println(" enter 1 to Start timer");
sc.nextInt();
sw.start();


System.out.println(" enter 2 to Stop the timer");
sc.nextInt();
sw.stop();
sw.elapse();

	}

}
