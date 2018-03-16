/**
 *
 * @author xekid78
 *
 */
public class Super {

	public static void main(String[] args) {
		Hello2 hello = new Hello2();
		hello.say_hello();

	}

}

class Greeting {
	public String msg;
	public String target;

	public Greeting() {
		this.msg = "Hello";
		this.target = "World";
	}

	public void say_hello() {
		System.out.println(this.msg + " " + this.target);
	}
}

class Hello2 extends Greeting {

	public void say_hello() {
		System.out.println(super.msg + " " + super.target);
		System.out.println("WA HA HA HA");
	}
}