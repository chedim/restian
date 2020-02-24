package com.onkiup.restian.errors;

public class NoSuchRoute extends HttpError {

  public NoSuchRoute() {
    super();
  }

  @Override
  public int code() {
    return 404;
  }
}

