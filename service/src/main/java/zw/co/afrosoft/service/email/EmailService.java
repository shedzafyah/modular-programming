package zw.co.afrosoft.service.email;

import org.springframework.beans.factory.annotation.*;
import org.springframework.mail.*;
import org.springframework.mail.javamail.*;
import org.springframework.stereotype.*;
import zw.co.afrosoft.domain.student.*;

@Service
public class EmailService {
    JavaMailSender javaMailSender;
    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(Student student){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("springboot894@gmail.com");
        message.setTo(student.getEmail());
        message.setSubject("Testing");
        message.setText("Your registration was a success. Thank you " +" "+ student.getFirstname() + " " +student.getLastname() +" "+"enrolling with us..");
        javaMailSender.send(message);
    }

}
