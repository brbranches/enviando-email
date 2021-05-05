package enviando.email;

import java.util.Properties;

import org.junit.jupiter.api.Test;

public class AppTest {
    
  @Test
  public void testeEmail() {
 
	  Properties properties = new Properties();
	  properties.put("mail.smtp.auth", "true"); /*Autorização*/
	  properties.put("mail.smtp.starttls", "true");/*Autenticação*/
	  properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail do Google*/
	  properties.put("mail.smtp.prt", "465");/*Porta do servidor*/
	  properties.put("mail.smtp.socketFactory.port", "465");/*Especifica a Porta a ser conectada pelo socket*/
	  properties.put("mail.smtp.socketFactory.Class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao SMTP*/
	  
	  
	  
  
  }
}
