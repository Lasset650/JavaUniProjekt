package tokens;

public class Operator implements Token {
	private Character value;	
	
	public Operator(Character value) {
		super();
		this.value = value;
	}

	public Character getValue() {
		return value;
	}

	public void setValue(Character value) {
		this.value = value;
	}
	
	


	

}
