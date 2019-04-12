package com.acme.mailreader.bdd;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.acme.mailreader.domain.Mail;
import com.acme.mailreader.domain.MailComparator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MainNulStep {
	
	
	private Mail mail1;
	private Mail mail2;
	private String resultatComparaison;
	Comparator<Mail> comparator = new MailComparator();
	
	private static final Map<Integer, String> resuAsString = new HashMap<Integer, String>();
	static {
		resuAsString.put(MailComparator.EGAUX, "EGAUX");
		
	}
	
	@Given("^un premier mail avec le sujet \"([^\"]*)\"$")
	public void un_premier_mail(String sujet) {
		mail1 = new Mail.Builder(sujet).build();
	}

	@Given("un deuxième mail est null")
	public void un_deuxieme_mail() {
		mail2 = null;
	}
	
	
	@Then("^le resultat est \"([^\"]*)\"$")
	public void le_test_d_egalité(String resu) throws Throwable {
		resultatComparaison = resuAsString.get(comparator.compare(mail1, mail2));
		Assert.assertEquals(resu, resultatComparaison);
	}

}
