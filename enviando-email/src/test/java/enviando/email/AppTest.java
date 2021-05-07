package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;

public class AppTest {

	private String userName = "brunoramos.testes@gmail.com";
	private String password = "Elmt2021*";

	@Test
	public void testeEmail() {

		try {
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true"); /* Autorização */
			properties.put("mail.smtp.starttls", "true");/* Autenticação */
			properties.put("mail.smtp.host", "smtp.gmail.com");/* Servidor gmail do Google */
			properties.put("mail.smtp.port", "465");/* Porta do servidor */
			properties.put("mail.smtp.socketFactory.port", "465");/* Especifica a Porta a ser conectada pelo socket */
			properties.put("mail.smtp.socketFactory.class",	"javax.net.ssl.SSLSocketFactory");/* Classe socket de conexão ao SMTP */

			Session session = Session.getDefaultInstance(properties, new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, password);
				}

			});

//			Address[] toUser = InternetAddress.parse("brunojramosr@gmail.com, brunoramos.quest@gmail.com");
			Address[] toUser = InternetAddress.parse("lisanascim@icloud.com");
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName)); //Email de remetente
			message.setRecipients(Message.RecipientType.TO, toUser);//Email de destino
			message.setSubject("AEEE!! Email enviado com JAVA!!!");
			message.setText("Olá programador. Você acaba de receber um email da aula sobre envio de emails com java do curso JDEV Treinamentos!");
			
			Transport.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
