package taouala.sendMultiplMails;

import  taouala.controller.Gmail;
import taouala.model.Mail;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	String fileDrivrlink="https://drive.google.com/file/d/1tE8PbNvHQmb1a53qB0Z6B6ewPgzcQ2VG/view?usp=sharing";
    	Gmail gmail=new Gmail();
    	Mail mail=new Mail("abdotaouala@gmail.com");
    	mail.setEmailSubject("Candidature stage PFE | Développeur logiciel junior");
    	mail.setEmailBody("Bonjour<br><br>"
    	
+"Je suis Étudiant en deuxième année Master spécialisé Systèmes d'Information Distribués à l'ENSETM (Ecole Normale Supérieure de l'Enseignement Technique de Mohammedia ).<br><br>" 

+"Dans le cadre de ma formation, je suis à la recherche d'une entreprise qui m’acquérir pour un stage PFE du 4 a 6 mois,a partir de février 2018. <br><br>"

+"Je possède de solides compétences en gestion de projet, conception et développement informatique notamment en Java/J2EE, et les frameworks Hibernate Spring, EJB, JSF les technologies JavaScript NodeJS, Angular, technologies mobile IONIC, Andruid et je suis confiant de pouvoir m'intégrer rapidement au sein de vos équipes.<br><br>"+ 

"Veuillez trouver ci-joint une version actualisée de mon cv.<br><br> "+

"Dans l’attente d’une réponse de votre part, je vous prie, d’agréé mes salutations respectueuses . <br><br>"+

"Bien cordialement<br><a href='"+fileDrivrlink+"'>.</a>");
    	
    	try {
			gmail.prepareMail(mail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
