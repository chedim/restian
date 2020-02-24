package com.onkiup.restian.interfaces;

import com.onkiup.restian.jdbc.TypeConverter;

public interface Api {
  String baseUrl();
  EntityRouter router();
  EntityManager entityManager();
  TypeConverter typeConverter();
  AuthValidator authValidator();
  Serializer serializer();
}

