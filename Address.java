
public class Address {
		 
	private	String street;
	private	int apartmentNumber;
    private String city;
	private	String state;
	private String zipCode; // e.g., "47405-123
	private	String country;
		  
		  Address(){
			  
		  }
		  
		  Address(
		          String street, 
		          int apartmentNumber,  
		          String city, 
		          String state, 
		          String zipCode,
		          String country) { 
		    
		    this.street = street; 
		    this.apartmentNumber = apartmentNumber; 
		    this.city = city; 
		    this.state = state; 
		    this.zipCode = zipCode; 
		    this.country = country;
		  } 
		 
		  public void setStreetAddress(String street){
			  this.street = street;
		  }
		  
		  public void setApt(int apartmentNumber){
			  this.apartmentNumber = apartmentNumber;
		  }
		  
		  public void setCity(String city){
			  this.city = city;
		  }
		  public void setState(String state){
			  this.state = state;
		  }
		  
		  public void setZipcode(String zipCode){
			  this.zipCode = zipCode;
		  }
		  
		  public void setCountry(String country){
			  this.country = country;
		  }
		  
		  public String display(){
				return String.format("%s %s %s%s",street,city, state,zipCode);
			}
		  
		}
