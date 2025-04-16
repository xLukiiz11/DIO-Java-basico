package com.exemplo.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificacaoApp implements CommandLineRunner {

    @Autowired
    private NotificationService notificationService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApp.class, args);
    }

    @Override
    public void run(String... args) {
        notificationService.enviarNotificacao("email", "Bem-vindo ao nosso sistema!");
        notificationService.enviarNotificacao("sms", "Sua verificação foi concluída.");
        notificationService.enviarNotificacao("push", "Você recebeu uma nova mensagem!");
    }
}