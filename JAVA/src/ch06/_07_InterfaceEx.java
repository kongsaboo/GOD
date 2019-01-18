package ch06;

public class _07_InterfaceEx {

	public static void main(String[] args) {
		A cla  = new A ();
		cla.methodA(new B());
	}
	
}

class A {
	public void methodA(B b) {
		System.out.println("A클래스 - methodA");
		C c1 = new C("C1");
		C c2 = new C("C2");
		b.methodB(c2);
	}
}

class B{
	public void methodB(C c) {
		System.out.println("B클래스 - methodB");
		c.methodC();
	}
	
}

class C{
	String name = "";
	
	public C(String name) { this.name = name; }
	public void methodC() {
		System.out.println("C클래스 - methodC  "+name);
	}
}