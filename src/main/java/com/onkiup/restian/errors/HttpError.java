package com.onkiup.restian.errors;

public abstract class HttpError extends Exception {
  int code() {
    return 500;
  }
}

