package p2;

public class CopyConstructor {
	long id;
	String name ;
	int age;
	
	CopyConstructor(long id,String name,int age){
		this.id = id ;
		this.name = name;
		this.age = age;
	}
	
	CopyConstructor(CopyConstructor obj){
		this.id = obj.id ;
		this.name =obj.name;
		this.age = obj.age;
	}
	
	
	
	
     public static void main(String[] args) {
    	 CopyConstructor cc = new CopyConstructor(11111, "Himanshu", 26);
    	 System.out.println(cc.id + ":" + cc.name + ":" + cc.age);
    	 
    	 CopyConstructor cc1 = new CopyConstructor(cc);
    	 System.out.println(cc1.id + ":" + cc1.name + ":" + cc1.age);
	}
}
