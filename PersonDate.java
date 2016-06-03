
public class PersonDate {

	
public PersonDate() {
    name = "YetToBeNamed";
	birthdayYear = 1999; // my default  
}
public PersonDate(String givenName, int yearOfBirth) { 
   name = givenName;
  birthdayYear = yearOfBirth; 
		  }
		  public String getName() { 
		    return name; 
		  }
		  public String changeName(String name) { 
		    String aux; 
		    aux = this.name;
		    this.name = name;
		    System.out.println(aux);
		    return aux; 
		  }
		  public int getAgeInYears(int currentYear) { 
		    return currentYear - birthdayYear;  
		  }
		  private String name;
		  private int birthdayYear; 
		  public static void main(String[] args) {
		    PersonDate a = new PersonDate(); 
		    PersonDate b = new PersonDate("Richard P. Feynman", 1918); 
		    String name = a.changeName("The Next Richard Feynman");     
		    System.out.println(
		      "Physicist " + name + " makes big " + 
		      "discovery, touted as " + a.getName()    
		    );
		    
		    String newBname = b.changeName("Apurva");
		    System.out.println(
		       b.getName() + " was " + 
		       b.getAgeInYears(2016) + 
		       " in , in May. "
		    );
		  }  
		}
