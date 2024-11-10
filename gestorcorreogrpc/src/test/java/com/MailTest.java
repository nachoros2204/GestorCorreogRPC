package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class MailTest {
    @Test
    public void testTestMarcarComoFavorito() {
            ArrayList<String> destinatario = new ArrayList<>();
            destinatario.add("nacho@gmail.com");
        
            Mail correo = new Mail ("Asunto", "mensaje", "lourdes@gmail.com", destinatario);
        
            assertFalse(correo.esFavorito());
    
            correo.marcarComoFavorito();
            assertTrue(correo.esFavorito());
        
            correo.marcarComoFavorito();
            assertFalse(correo.esFavorito());
        
        }
    }
