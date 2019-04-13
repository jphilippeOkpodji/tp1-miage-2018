# Nom des étudiants de ce binôme 
(les DEUX noms) : Jean-philippe N'GUESSAN et Nada KANITA




# Exercice 1 et 2 fait 

__Travaille fait dans  le projet fourni mailreader-ex1-ini__



# Exercice 3 - Injection de dépendances avec Guice
Voici notre arbre d'injection 

L'objet InterpreteurLigneCommande a besoin qu'on lui injecte un objet MailService. Et l'objet MailService a besoin qu'on lui injecte un objet MailSender.

InterpreteurLigneCommande ---> MailService ---> MailSender

# Exercice 4 - Fait 

# Exercice 5 - BDD avec Cucumber-jvm (fait en intégrité )
_Temps estimé : 40 mins_

Point de synchro : repartir du projet fourni `mailreader-ex5-ini`

cucumber-jvm est l'implémentation java de cucumber, un framework de BDD (Behavioral Driven Development) très populaire. Il est existe d'autres : JBehave (l'original, très similaire), Concordion, JGiven ...

Pour les besoins du TP, nous utilisons ici les notions de Scenario Outline, de Data Table et de Transformer permettant l'utilisation de données tabulaires et de formats custom.

1) Compléter la classe `MailComparaisonStep`
2) Lancer le test `CucumberRunnerTest` en junit
3) Ouvrir dans un navigateur `target/cucumber/index.html`
4) Ajouter des cas de test dans la feature `trier_mail.feature`. Notez qu'aucun nouveau code n'a été nécessaire pour ajouter ces tests contrairement à un TU.

5) Ecrire un scenario simple au format textuel et les steps correspondants.

# Cleanup
Si vous le désirez, vous pourrez supprimer votre projet github mais pas avant fin juin (noté)

# Jean Philippe

