package com.onkiup.restian.interfaces;

import com.onkiup.restian.Authorization;
import com.sun.net.httpserver.HttpExchange;

public interface AuthValidator {
  Authorization read(Class<? extends Entity> target, HttpExchange source);
  Authorization update(Class<? extends Entity> target, HttpExchange source);
  Authorization delete(Class<? extends Entity> target, HttpExchange source);
}

