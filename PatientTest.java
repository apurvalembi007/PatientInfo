import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class PatientTest {
	
	public static void main(String[] args) {
	PatientInfo patient = new PatientInfo();
                                                                                   // PatientInfo patient2 = new PatientInfo();
	List<PatientInfo> ll = new ArrayList<PatientInfo>();
                                                                                         //List<PatientInfo> ll2 = new ArrayList<PatientInfo>();
	HashMap<Integer,List> hm = new HashMap<Integer,List>(); // comes useful when dealing with Hospital data and need to find patient with id.
	
	PersonName pName = new PersonName(null);
//	           PersonName pName2 = new PersonName();
//	 pName.setFirstName("Apurva");
	 pName.setFirstName("APURVA");
	 pName.setMiddleName("M.");
	 pName.setLastName("Lembi");
	 pName.setPrefered("Appi");
	 patient.addName(pName);
	 
                                                                    //	            pName2.setFirstName("Bhargav");
                                                                            //	            pName2.setLastName("VS");
                                                                                  //	            patient2.addName(pName2);
	            
     patient.setGender(Gender.FEMALE);
                                                                                 //     patient2.setGender('M');
     
     Address PAddress = new Address();
     PAddress.setStreetAddress("908 greek");
     PAddress.setCity("Arlington");
     PAddress.setState("TX");
     PAddress.setCountry("USA");
     PAddress.setZipcode("76013");
     patient.setAddress(PAddress);
     
     
     String str = "1991-08-05T10:30:00";
     String timeZone = "IST";
     try {
		patient.setDateOfBirth(str,timeZone );
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     Allergy al = new Allergy();
     Allergy al2 = new Allergy();
     
     List<Allergy> alList = new ArrayList<Allergy>();
     
     al.setAllergyType(AllergyType.FOOD);
     al2.setAllergyType(AllergyType.SKIN);
     
     List<String> Symptoms = new ArrayList<String>();
     List<String> Symptoms2 = new ArrayList<String>();
     
     Symptoms.add("Vomiting");
     Symptoms.add("Weakness");
     Symptoms2.add("Rashes");
     
     al.setSymptons(Symptoms);
     al2.setSymptons(Symptoms2);
     
     
     List<String> AllergyItems = new ArrayList<String>();
     AllergyItems.add("peanuts");
     al.setAllergyItems(AllergyItems);
      
     alList.add(al);
     alList.add(al2);
     patient.setAllergy(alList);
     
   
     
     
     ll.add(patient);
                                                                                      
                                                                                 //     ll2.add(patient2);
      //map
     hm.put(1, ll);
                                                                              //hm.put(2, ll2);
     List<PatientInfo> values = new ArrayList<PatientInfo>( hm.get(1));

     
     for(PatientInfo p:values){
    	    
         System.out.println(p.gender);
         System.out.println(p.getName().getNameinfo());
         System.out.println(p.getAddress().display());
         System.out.println(p.dob);
         System.out.println(p.getAge());
         for(Allergy ai: alList){
        	 System.out.println(ai.getAllAllergyInfo());
         }
         }
	
	}

	

}


