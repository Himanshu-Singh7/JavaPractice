package p1;

public class Emp {
	int id;
	String name;
	Address addrss;
	
	public Emp(int id,String name , Address addrss){
		this.id =  id;
		this.name = name;
		this.addrss = addrss;
	}
	
	void dispaly() {
		System.out.println(id + ":" +name);
		System.out.println(addrss.city + ":"+addrss.state+ ":" +addrss.country);
	}
	
	
	public static void main(String[] args) {
		Address address1 = new Address("Varansi","UP" ,"India");
		Address address2 = new Address("banglore","Karnatka" ,"India");
		
		
		Emp e1 = new Emp(111, "Himanshu" , address1);
		Emp e2 = new Emp(112, "Rahul" , address2);
		e1.dispaly();
		e2.dispaly();
	}

}
