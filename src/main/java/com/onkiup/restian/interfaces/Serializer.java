package com.onkiup.restian.interfaces;

import com.sun.net.httpserver.HttpExchange;

public interface Serializer {
  void serialize(HttpExchange target, Object source);
}

