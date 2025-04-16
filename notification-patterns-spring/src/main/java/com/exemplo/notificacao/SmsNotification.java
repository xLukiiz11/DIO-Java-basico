package com.exemplo.notificacao;

public class SmsNotification implements NotificationStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}