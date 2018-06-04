package java_tutorial01;

public class Sample01 {
	public static void main(String[] args){
		
		Animal p = new Animal();
		
		p.setData("Taro");
		
		System.out.println(p.name+""+p.age);
		 p.setData("Hanako", 20);
		 
		 System.out.println(p.name+""+p.age);
	}
}

