
public class Testmethodchaining {
public static void main(String[] args) {
	new Chaining(10,4);
}
}
class Chaining {
	public Chaining() {
		System.out.println("Constructer is called");
	}
	public Chaining(int i) {
		this();
		System.out.println("Second Constructer is called");
	}
	public Chaining(int i,int j) {
		this(i);
		System.out.println("third constructor is called");
	}
}
	