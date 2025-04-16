package com.exemplo.notificacao;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void enviarNotificacao(String tipo, String mensagem) {
        NotificationStrategy estrategia = NotificationFactory.getStrategy(tipo);
        estrategia.enviar(mensagem);
    }
}