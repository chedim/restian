package com.onkiup.restian.interfaces;

public interface Endpoint {
  Class<? extends Entity> model();
  Api owner();
}

