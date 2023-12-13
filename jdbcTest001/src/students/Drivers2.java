package students;



class X{
	 void display() {
		System.out.println("hii");
	}
}
class Y extends X{}
public class Drivers2 {
 public static void main(String[] args) {
	//Y y=new Y();
	 Y y=null;
	y.display();
}
}
