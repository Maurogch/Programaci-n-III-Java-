package com.utn;

import java.util.function.Supplier;

public class TelefonoNoEncontradoException extends Exception {

  public TelefonoNoEncontradoException() {
  }

  public TelefonoNoEncontradoException(String message) {
    super(message);
  }

}
