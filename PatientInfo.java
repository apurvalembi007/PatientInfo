import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;


public class PatientInfo {

	PersonName PatientName;
	Address Address; // can have two or more address.
	Phone phone;// can add home, mobile
	Gender gender;
	Date dob; 
	String timeZone;
	String email_id;
	History PatientHistory;
	List<Allergy> AllergyList;
	Medication Medicationhistory;
	PatientInfo(){
		
	}
	public void addName(PersonName pName){
		this.PatientName = pName;
	}
	
	public PersonName getName(){
		return PatientName;
	}
	
	public void setGender(Gender c){
		this.gender = c;
	}
	
	public Gender getGender(){
		return this.gender;
		
	}
	
	public void setAddress(Address Address){
		this.Address=Address;
	}
	public Address getAddress(){
		return Address;
	}
	
	
	//date
	public Date getDateOfBirth(){
        return dob;
    }

    public void setDateOfBirth(String newDob,String Timezone) throws ParseException{
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    	sdf.setTimeZone(TimeZone.getTimeZone(Timezone));
    	try {
        dob = sdf.parse(newDob);
    	} catch (Exception ex){
    		
    	}
    	
    }
    
    public int getAge(){
    	Date now = new Date();
    	return now.getYear()-dob.getYear();
    }
    
    public void setAllergy(List<Allergy> AllergyList){
		this.AllergyList=AllergyList;
	}
    
    public List<Allergy> getAllergy(){
		return AllergyList;
    	
    }

	
	
	
	
	
	
	
}
	
	
	
	

