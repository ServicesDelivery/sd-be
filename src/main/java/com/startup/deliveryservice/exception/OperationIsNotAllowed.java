package com.startup.deliveryservice.exception;

import java.text.MessageFormat;

public class OperationIsNotAllowed extends RuntimeException {

  public OperationIsNotAllowed(String message, Object... parameters) {
    super(MessageFormat.format(message, parameters));
  }
}
