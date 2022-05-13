package tokens;
/**
 * Natürliche Zahl
 */
public class NaturalNumber implements Token {
	private Integer value;

	public NaturalNumber(Integer value) {
		super();
		this.value = value;
	}
	public Integer getValue() {
		return this.value;
	}
	
	public String toString() {
		return value.toString();
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof NaturalNumber)) return false;
		return this.value == ((NaturalNumber)o).value;
	}
	

}
