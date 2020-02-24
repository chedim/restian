package com.onkiup.restian.errors;

public class UnsupportedMethod extends HttpError {

  @Override
  public int code() {
    return 400;
  }

}

