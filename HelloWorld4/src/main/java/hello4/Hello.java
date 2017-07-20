package hello4;

public class Hello {
	public static void main(String [] args) {
		Hello hello = new Hello();
		System.out.println(hello.getMessage());
	}
	public String getMessage() {
		return "Hello World!";
	}
}
