package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void crear_nuevo_usuario_con_nombre_apellido_y_correo() {
        Usuario nacho = new Usuario("Nacho", "Rosales", "nacho@gmail.com");
        assertEquals("Nacho", nacho.getNombre());
        assertEquals("Rosales", nacho.getApellido());
        assertEquals("nacho@gmail.com", nacho.getDireccionCorreo());
    }

    @Test
    public void crear_usuario_y_comprobar_entrada_en_lista() {
        MailManager gestorCorreo = new MailManager(); 
        Usuario nacho = gestorCorreo.crearNuevoUsuario("Nacho", "Rosales", "nacho@gmail.com");

        //verificamos que el usuario ha sido agregado correctamente a la lista de usuarios.
        assertEquals(1, gestorCorreo.getListaUsuarios().size());
        assertEquals(nacho, gestorCorreo.getListaUsuarios().get(0));
    }

    @Test
    public void personalizar_direccion_de_correo() {
        MailManager gestorCorreo = new MailManager(); 
        Usuario nacho = gestorCorreo.crearNuevoUsuario("Nacho", "Rosales", "nacho@gmail.com");

        //verificamos que la dirección de correo se haya guardado correctamente
        assertEquals("nacho@gmail.com", gestorCorreo.getListaUsuarios().get(0).getDireccionCorreo());
    }

    @Test
    public void testSetYGetCorreo() {
        Usuario nacho = new Usuario("Nacho", "Rosales", "nacho@example.com");
        nacho.setDireccionCorreo("nuevo@example.com");

        //verificamos que la dirección de correo se haya actualizado correctamente.
        assertEquals("nuevo@example.com", nacho.getDireccionCorreo());
    }

    @Test
    public void testSetYGetApellido() {
        Usuario juani = new Usuario("Juani", "Gualtieri", "juani@example.com");
        juani.setApellido("NuevoApellido");

        //verificamos que el apellido se haya actualizado correctamente.
        assertEquals("NuevoApellido", juani.getApellido());
    }

    @Test
    public void testSetYGetNombre() {
        Usuario lourdes = new Usuario("Lourdes", "GomezSierra", "lourdes@example.com");
        lourdes.setNombre("NuevoNombre");

        //verificamos que el nombre se haya actualizado correctamente.
        assertEquals("NuevoNombre", lourdes.getNombre());
    }

    @Test
    public void obtener_lista_de_contactos() {
        Usuario nacho = new Usuario("Nacho", "Rosales", "nacho@example.com");
        Contacto contacto1 = nacho.agregarNuevoContacto("Amigo1", "Apellido1", "amigo1@example.com");
        Contacto contacto2 = nacho.agregarNuevoContacto("Amigo2", "Apellido2", "amigo2@example.com");

        ArrayList<Contacto> listaContactos = nacho.getListaDeContactos();

        //verificamos que los contactos se hayan agregado correctamente.
        assertEquals(2, listaContactos.size());
        assertTrue(listaContactos.contains(contacto1));
        assertTrue(listaContactos.contains(contacto2));
    }

    @Test
    public void obtener_correo() {
        Usuario juani = new Usuario("Juani", "Gualtieri", "juani@example.com");

        //verificamos que la direccion de correo sea la correcta.
        assertEquals("juani@example.com", juani.getDireccionCorreo());
    }
}
