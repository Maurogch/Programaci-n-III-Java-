package com.utn;

import java.util.Map;

public class Agenda {

  private Map<Contacto, Telefono> contactos;

  public Agenda(Map<Contacto, Telefono> contactos) {
    this.contactos = contactos;
  }

  public Map<Contacto, Telefono> getAgenda() {
    return contactos;
  }

  public Contacto buscarContacto(String nombre, String apellido) {
    for (Map.Entry<Contacto, Telefono> c : contactos.entrySet()) {
      if (c.getKey().getNombre().equals(nombre) && c.getKey().getApellido().equals(apellido)) {
        return c.getKey();
      }
    }
    return null;
  }

  public Telefono buscarTelefono(Contacto c) throws TelefonoNoEncontradoException {
    if (this.contactos.containsKey(c)) {
      return this.contactos.get(c);
    }
    throw new TelefonoNoEncontradoException("El contacto " + c + " no existe en la agenda");
  }

  public Telefono agregarContacto(Contacto c, Telefono t) {
    return this.contactos.put(c, t);
  }

  public Telefono eliminarContacto(Contacto c) {
    return this.contactos.remove(c);
  }

  /** El editar funciona igual que un agregar porque se pisaria el value para la key cliente. */
  public Boolean editarTelefono(Contacto c, Telefono t) throws TelefonoNoEncontradoException {
    if (this.contactos.containsValue(t)) {
      this.contactos.put(c, t);
      return true;
    }
    throw new TelefonoNoEncontradoException("El telefono " + t + " no existe en la agenda");
  }
}
