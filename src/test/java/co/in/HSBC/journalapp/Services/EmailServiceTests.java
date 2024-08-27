package co.in.HSBC.journalapp.Services;

import co.in.HSBC.journalapp.entity.User;
import co.in.HSBC.journalapp.services.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    public void testMailSender() {
        emailService.mailSender(User.builder().build(),"shreep300@gmail.com", "Welcome To Journal App.", "Hi Shree, We welcome you to our journal application. Don't' forget to share it with your friends.");
    }
}
