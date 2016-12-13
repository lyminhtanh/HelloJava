package InheritanceDemo;

public class Mouse extends Animal {
	 
	  private int weight;
	 
	  // Cấu tử mặc định
	  public Mouse() {
	      // Gọi tới cấu tử Mouse(int)
	      this(100);
	  }
	 
	  // Cấu tử 1 tham số
	  public Mouse(int weight) {
	      // Tại đây ko gọi super
	      // Mặc định java hiểu gọi tới cấu tử mặc định của class cha.
	      this.weight = weight;
	  }
	 
	  // Cấu tử 2 tham số
	  public Mouse(String name, int weight) {
	      super(name);
	      this.weight = weight;
	  }
	 
	  public int getWeight() {
	      return weight;
	  }
	 
	  public void setWeight(int weight) {
	      this.weight = weight;
	  }
	 
	  @Override
	  public String getAnimalName() {
	      return "Mouse";
	  }
	}
