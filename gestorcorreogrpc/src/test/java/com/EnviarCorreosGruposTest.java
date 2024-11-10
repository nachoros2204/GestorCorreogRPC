package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EnviarCorreosGruposTest {

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;
    private GrupoDeUsuarios grupo;

    @Test
public void testMandarMailAGrupoYUsuarios() {
    MailManager mailManager = new MailManager();
    usuario1 = mailManager.crearNuevoUsuario("Nacho", "Rosales", "nacho@gmail.com");
    usuario2 = mailManager.crearNuevoUsuario("Lourdes", "GomezSierra", "lourdesgomezsierra@gmail.com");
    usuario3 = mailManager.crearNuevoUsuario("Juani", "Gualtieri", "juani@gmail.com");

    ArrayList<String> para = new ArrayList<>();
        para.add("nacho@gmail.com"); //agregamos como destinatario individual al mismo remitente

    grupo = new GrupoDeUsuarios();
    grupo.agregarUsuarioAlGrupo(usuario2);
    grupo.agregarUsuarioAlGrupo(usuario3);

//creamos mail y lo enviamos
    Mail correo = usuario1.crearMensaje(mailManager, "Saludos", "Hola, ¿cómo están?", para, grupo);

    //verificamos que el correo este en la bandeja de salida del remitente
    assertTrue(usuario1.getSalida().contieneCorreo(correo));
    //verificamos que el correo este en la bandeja de entrada de los destinatarios
    assertTrue(usuario1.getEntrada().contieneCorreo(correo));
    assertTrue(usuario2.getEntrada().contieneCorreo(correo));
    assertTrue(usuario3.getEntrada().contieneCorreo(correo));
}


@Test
public void testMandarMailAGrupoConNuevoUsuario() {

    MailManager mailManager = new MailManager();
    usuario1 = mailManager.crearNuevoUsuario("Nacho", "Rosales", "nacho@gmail.com");
    usuario2 = mailManager.crearNuevoUsuario("Lourdes", "GomezSierra", "lourdesgomezsierra@gmail.com");
    usuario3 = mailManager.crearNuevoUsuario("Juani", "Gualtieri", "juani@gmail.com");
    grupo = new GrupoDeUsuarios();//creamos todo

//agregamos usuarios al grupo
    grupo.agregarUsuarioAlGrupo(usuario1);
    grupo.agregarUsuarioAlGrupo(usuario2);

//creamos mail y lo enviamos
    Mail correo = usuario1.crearMensaje(mailManager, "Saludos", "Hola, ¿cómo están?", null, grupo);

    //verificamos que el correo este en la bandeja de salida del remitente
    assertTrue(usuario1.getSalida().contieneCorreo(correo));
    //verificamos que el correo este en la bandeja de entrada de los destinatarios
    assertTrue(usuario1.getEntrada().contieneCorreo(correo));
    assertTrue(usuario2.getEntrada().contieneCorreo(correo));
    assertFalse(usuario3.getEntrada().contieneCorreo(correo));

    grupo.agregarUsuarioAlGrupo(usuario3); //agregamos otro usuario al grupo

    Mail correo2 = usuario1.crearMensaje(mailManager, "Saludos2", "Hola, ¿cómo están?2", null, grupo);

    //verificamos que el correo este en la bandeja de salida del remitente
    assertTrue(usuario1.getSalida().contieneCorreo(correo2));
    //verificamos que el correo este en la bandeja de entrada de los destinatarios
    assertTrue(usuario1.getEntrada().contieneCorreo(correo2));
    assertTrue(usuario2.getEntrada().contieneCorreo(correo2));
    assertTrue(usuario3.getEntrada().contieneCorreo(correo2));
}
}
