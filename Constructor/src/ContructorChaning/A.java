package ContructorChaning;

public class A {
	
	
	A(){
		System.out.println(100);
	}
	
     A(int x ){
		this();
		System.out.println(x);
	 }
	A(int x , int y){
		this(1);
		System.out.println(x + ":" +y);
	}
      public static void main(String[] args) {
		A a1 = new A(10,20);
	}
}
