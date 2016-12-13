package InheritanceDemo;

//Class có ít nhất 1 method trìu tượng phải khai báo là trìu tượng.
public abstract class Animal {

// Tên, ví dụ Mèo Tom, Chuột Jerry.
private String name;

// Cấu tử mặc định
public Animal() {
   // Gán tên mặc định
   this.name = this.getAnimalName();
}

public Animal(String name) {
   this.name = name;
}

public String getName() {
   return name;
}

public void setName(String name) {
   this.name = name;
}

// Trả về tên của loài động vật này.
// Một method trìu tượng.
// Nội dung cụ thể của method này được viết tại class con.
public abstract String getAnimalName();

}
