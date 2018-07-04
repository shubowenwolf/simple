package simple;

public class Test {
	public static void main(String[] args) {
		System.out.println("This is a test!");
	}

	private Test() {
		
	}
	
	private static class A {
		private static Test a = new Test();
	}
	
	public static Test getA() {
		return A.a;
	}
}
