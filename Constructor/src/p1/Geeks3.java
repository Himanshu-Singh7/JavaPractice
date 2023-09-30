package p1;

public class Geeks3 {
	int id;
	String name ;
	Geeks3(int id , String name){
		this.id = id;
		this.name = name ;
	}
	public static void main(String[] args) {
		Geeks3 g = new Geeks3(101,"Himanshu");
		System.out.println(g.id + ":" + g.name);
	}

}
