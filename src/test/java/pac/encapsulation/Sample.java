package pac.encapsulation;

public  class Sample 
{


	private  String name ="Ram";
	private int id=50;
	private long mono=9876543210l;

	private void m1() {
		System.out.println("m1 from Sample");
	}
	
	public void m2() {
		m1();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}

	public long getMono() {
		return mono;
	}
	
	
	
	
}
