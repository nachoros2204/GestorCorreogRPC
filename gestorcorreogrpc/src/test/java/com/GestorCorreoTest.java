package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GestorCorreoTest {
    
    @Test
    public void comprobar_instancia_de_gestor_de_correo() {
        MailManager gestorCorreo = new MailManager();
        assertTrue(gestorCorreo instanceof MailManager);
    }
}
