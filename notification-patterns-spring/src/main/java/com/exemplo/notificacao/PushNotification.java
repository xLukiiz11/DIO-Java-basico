package com.exemplo.notificacao;

public class PushNotification implements NotificationStrategy {
    public void enviar(String mensagem) {
        System.out.println("Enviando Push: " + mensagem);
    }
}