package com.exemplo.notificacao;

public class NotificationFactory {
    public static NotificationStrategy getStrategy(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        };
    }
}