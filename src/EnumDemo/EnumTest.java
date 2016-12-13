package EnumDemo;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	enum DAYS  {MON,TUE, WED,THU
		};
	DAYS H = DAYS.MON;
	for(int ii:DAYS){
		H = DAYS.values();
	}
	
}
enum Gender{
	MALE("M","Male"), FEMALE("F","Female");
	String code;
	String text;
	private Gender(String code,String text){ //always private
		this.code = code;
		this.text = text;
	}
	public static Gender 
	}
}