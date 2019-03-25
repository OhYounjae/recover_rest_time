package review_days;

//열거타입
enum Week{
	MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Ex3_7 {
	public static void main(String args[]) {
		Week myWeek = Week.FRI;
		Week yourWeek = Week.SAT;
		System.out.printf("My special day : (%s) %n", myWeek);
		System.out.printf("Your special day : (%s) %n", yourWeek);
		
		//format이 있으면 println사용이 안된다
		
	}
}
