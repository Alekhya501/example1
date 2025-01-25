package object;

public class bulb {
	boolean ison;
	void turnOn()
	{
		ison=true;
		System.out.println("light is:"+ison);
	}
	void turnoff()
	{
		ison=false;
		System.out.println("light is:"+ison);
	}
	public static void main(String[] args) {
		bulb led=new bulb();
	 led.turnOn();
	 
		bulb led1=new bulb();
		led1.turnoff();

	}

}
