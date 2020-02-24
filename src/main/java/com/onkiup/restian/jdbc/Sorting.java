package com.onkiup.restian.jdbc;

import com.onkiup.restian.interfaces.Entity;

public class Sorting {
  private Class<? extends Entity> type;
  private String fieldName;
  private boolean reversed; 

  public Sorting(Class<? extends Entity> type, String fieldName) {
    this.type = type;
    this.fieldName = fieldName;
  }

  public Sorting(Class<? extends Entity> type, String fieldName, boolean reversed) {
    this(type, fieldName);
    this.reversed = reversed;
  }

  public Class<? extends Entity> type() {
    return type;
  }

  public String field() {
    return fieldName;
  }

  public boolean reversed() {
    return reversed;
  }
}

