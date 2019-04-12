package com.acme.mailreader.model;

import java.util.Comparator;

/**
 * Comparateur de mails
 * 
 * Comme on désire afficher les mails les plus importants en premier, l'element le plus grand retourne une valeur négative
 *
 */
public class MailComparator implements Comparator<Mail> {

	private static final int EGAUX = 0;
	private static final int PREMIER_PLUS_PETIT = 1;
	private static final int PREMIER_PLUS_GRAND = -1;
	
	
	
	public int compare(Mail mail1, Mail mail2) {
		if (unDesMailsNul(mail1, mail2)){
			return EGAUX;
		}
		if (importanceEstDifferente(mail1, mail2)) {
			return classerParImportance(mail1, mail2);
		}
		if (statutEstDifferent(mail1, mail2)) {
			return classerParStatut(mail1, mail2);
		}
		if (sujetEstDifferent(mail1, mail2)) {
			return classerParSujet(mail1, mail2);
		}
		return mail2.getDate().compareTo(mail1.getDate());
	}

	private boolean unDesMailsNul(Mail mail1, Mail mail2) {
		return mail1 == null || mail2 == null;
	}

	private boolean importanceEstDifferente(Mail mail1, Mail mail2) {
		return mail1.isImportant() != mail2.isImportant();
	}

	private int classerParImportance(Mail mail1, Mail mail2) {
		if (mail1.isImportant() && !mail2.isImportant()) {
			return PREMIER_PLUS_GRAND;
		} else {
			return PREMIER_PLUS_PETIT;
		}
	}
	private boolean statutEstDifferent(Mail mail1, Mail mail2) {
		return mail1.getStatut() != mail2.getStatut();
	}


	private int classerParStatut(Mail mail1, Mail mail2) {
		int comp = mail1.getStatut().ordinal() - mail2.getStatut().ordinal();
		return comp < 0 ? PREMIER_PLUS_PETIT : PREMIER_PLUS_GRAND;
	}

	private boolean sujetEstDifferent(Mail mail1, Mail mail2) {
		if (mail1.getSujet() == null || mail2.getSujet() == null) {
			return true;
		}
		return !mail1.getSujet().equals(mail2.getSujet());
	}
	
	private int classerParSujet(Mail mail1, Mail mail2) {
		if (mail1.getSujet() == null && mail2.getSujet() != null) {
			return PREMIER_PLUS_PETIT;
		}
		else if (mail1.getSujet() != null && mail2.getSujet() == null) {
			return PREMIER_PLUS_GRAND;
		}
		return mail1.getSujet().compareTo(mail2.getSujet());
	}
	

}