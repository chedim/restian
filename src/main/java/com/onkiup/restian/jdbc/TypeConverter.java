package com.onkiup.restian.jdbc;

import java.lang.reflect.Field;

public interface TypeConverter {
  String asSQL(Field info);
}

