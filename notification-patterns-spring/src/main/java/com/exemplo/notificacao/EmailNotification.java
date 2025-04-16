package com.exemplo.notificacao;

public class EmailNotification implements NotificationStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}