
public class Phone {
	
	private int code; //682
	private int number; //564-8536
	
	/**  A description of the phone type. */

	Phone(int code, int number){
		this.code=code;
		this.number = number;
	}
	public String toString() {
//	    return String.format("(%03d) %03d-%04d", code, number);
		return String.format("(%d)-(%d)", code,number);	
	}
	
	public String getPhoneNumber() {
		return String.format("(%d)-(%d)", code,number);
	}
	public void setPhoneNumber(int code, int number) {
		this.code=code;
		this.number = number;
	}
	
}












//private final int area;   // area code (3 digits)
//private final int exch;   // exchange  (3 digits)
//private final int ext;    // extension (4 digits)

//public PhoneNumber(int area, int exch, int ext) {
//  this.area = area;
//  this.exch = exch;
//  this.ext  = ext;
//}

//how you're supposed to implement equals
//public boolean equals(Object y) {
//  if (y == this) return true;
//  if (y == null) return false;
//  if (y.getClass() != this.getClass()) return false;
//  PhoneNumber that = (PhoneNumber) y;
//  return (this.area == that.area) && (this.exch == that.exch) && (this.ext == that.ext);
//}

//0 for padding with leading 0s


////satisfies the hashCode contract
//public int hashCode() {
//  return 10007 * (area + 1009 * exch) + ext;
//}