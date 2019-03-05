package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ContactRepository;
import com.example.demo.entities.Contact;

@SpringBootApplication
public class GestionContactApplication implements CommandLineRunner{
	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
	
		/*Contact c=new Contact("Hassani","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");
		
		Contact c1=new Contact("Berkani","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		Contact c2=new Contact("Hfyane","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		Contact c3=new Contact("Z3fane","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");
		Contact c4=new Contact("Hfyane","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		Contact c5=new Contact("Z3fane","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		
	Contact c6=new Contact("Hassani","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");
		
		Contact c7=new Contact("wwww","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		Contact c8=new Contact("sxscc","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		Contact c9=new Contact("sasa","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");
		Contact c10=new Contact("zzdaqsa","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		Contact c11=new Contact("ssss","Mohamed",df.parse("12/01/1999"),"mouhamed@gmail.com",(long) 054241,"jj.jpg");

		contactRepository.save(c);
		contactRepository.save(c1);
		contactRepository.save(c2);
		contactRepository.save(c3);
		contactRepository.save(c4);
		contactRepository.save(c5);
		contactRepository.save(c6);
		contactRepository.save(c7);
		contactRepository.save(c8);
		contactRepository.save(c9);
		contactRepository.save(c10);

		contactRepository.save(c11);*/
contactRepository.findAll().forEach(contact->{
			System.out.println(contact.getNom());
			
		});
		
		
	}

}
