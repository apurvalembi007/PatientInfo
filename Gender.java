
public enum Gender {
	MALE("M"), 
	FEMALE("F");
	
	private String stringName;
	
	private Gender(String stringName){
		this.stringName = stringName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.stringName;
	}

}
