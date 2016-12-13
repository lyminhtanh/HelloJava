package reflectiondemo;

public class Cat extends Animal implements Say{
	 static final String SAY = "meo meo";
	 static final int NUMBER_OF_LEG = 4;
	private String name;
	private int age;
	public Cat(){
		
	}
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String say() {
		// TODO Auto-generated method stub
		return SAY;
	}
	@Override
	public int getNumberOfLeg() {
		// TODO Auto-generated method stub
		return NUMBER_OF_LEG;
	}
	private void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
