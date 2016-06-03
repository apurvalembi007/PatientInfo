
public class PersonName {
	public String FirstName;
	private String MiddleName;
	private String LastName;
	private String PreferedName;
	
	PersonName(String FirstName)
	{
		this.FirstName = FirstName;
		
	}
	
	
	
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
		
	}
	
	
	public void setMiddleName(String MiddleName){
		this.MiddleName = MiddleName;
		
	}
	
	public void setLastName(String LastName){
		this.LastName = LastName;
		
	}
	public void setPrefered(String PreferedName){
		this.PreferedName = PreferedName;
		
	}
	
	public String getPrefered(String PreferedName){
		return PreferedName;
		
	}
	public String getNameinfo(){
		return String.format("%s %s %s",FirstName,MiddleName, LastName);
	}
	
	
	
	public String getFirst()
	{
	    return FirstName;
	}

	public String getMiddle()
	{
	    return MiddleName;
	}

	public String getLast()
	{
	    return LastName;
	}
   
	
}
