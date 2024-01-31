class test11{
	 boolean h=true;
	public void T1() {
		System.out.println("Test 1");
	}
	public void T2(String ss) {
		System.out.println(ss);
	}
	public void T3(int a, String b, boolean h) {
		if(h) {
			System.out.println(a*10);
		}
	}
	public void T4(int a) {
		for(int i=0; i<=10; i++) {
			System.out.println(i*a);
		}
	}
}
class tt1 extends test11{
	public void Te(test11 tt) {
		System.out.println("Hello");
	}
}
public class Inheritance extends tt1 {
        public static void main(String[] args) {
		Inheritance o = new Inheritance();
		o.Te(o);
		
	//	o.T1(); o.T2("Sourabh"); o.T3(10, "Sss", true); o.T4(5);
	}

}
