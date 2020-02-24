package com.onkiup.restian.errors;

public class Unauthorized extends HttpError {

  @Override
  public int code() {
    return 401;
  }

}

