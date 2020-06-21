package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetomany.entity.EMail;
import com.example.onetomany.entity.Person;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner{
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private EmailRepository emailRepo;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	System.out.println("app stareted");
		
		/*Person persom = new Person();
		persom.setId(101);
		persom.setFirstName("abc");
		persom.setName("priyanka");
		
		personRepo.save(persom);
		
		EMail mail = new EMail();
		mail.setId(102);
		mail.setMailId("@gmail.com");
		mail.setPassword("hlloe");
		mail.setPerson(persom);
		
		EMail mail1 = new EMail();
		mail1.setId(103);;
		mail1.setMailId("@gmail.com");
		mail1.setPassword("hlloe");
		mail1.setPerson(persom);
		
		emailRepo.save(mail);
		emailRepo.save(mail1);
	    //Update;
		
		EMail mailUpdate = emailRepo.findById(102).get();
		mailUpdate.setPassword("hkkopo");
		mailUpdate.getPerson().setFirstName("LLLLLLLL");
		emailRepo.save(mailUpdate);
		//Result : Person didnt get updated only mail got updated.
		
		//delete 
		
		emailRepo.delete(mailUpdate);
		//Referential integrity constraint violation: "FKDW5V24TJ4N5SY7O92PP0PPMN1: PUBLIC.EMAIL FOREIGN KEY(PERSON_ID) REFERENCES PUBLIC.PERSON(ID) (101)"; SQL statement:
		
		//If we have only one child then we wont get that issue.
		 
		 */
		
		//case 2:Dont save person save childs(mails)
		
		/*Person persom = new Person();
		persom.setId(101);
		persom.setFirstName("abc");
		persom.setName("priyanka");
		
		//personRepo.save(persom);
		
		EMail mail = new EMail();
		mail.setId(102);
		mail.setMailId("@gmail.com");
		mail.setPassword("hlloe");
		mail.setPerson(persom);
		
		EMail mail1 = new EMail();
		mail1.setId(103);;
		mail1.setMailId("@gmail.com");
		mail1.setPassword("hlloe");
		mail1.setPerson(persom);
		
		emailRepo.save(mail);
		emailRepo.save(mail1); */
	}
	
}
