package object;
interface Animal{
	void sound();
}
 class cat implements Animal{
	public void sound() {
		System.out.println("meow");
	}
}
 class dog implements Animal{
		public void sound() {
			System.out.println("bow bow");
		}
	}
 public class inter{
	 public static void main(String args[]) {
		 dog d=new dog();
		 d.sound();
		 cat c=new cat();
		 c.sound();
	 }
	 
 }