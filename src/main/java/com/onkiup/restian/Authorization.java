package com.onkiup.restian;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import com.onkiup.restian.interfaces.Entity;
import com.onkiup.restian.jdbc.WhereStatement;

public class Authorization {
  private Set<Class<? extends Entity>> entities = new HashSet();
  private WhereStatement binds;

  public Authorization add(Class<? extends Entity> entity) {
    this.entities.add(entity);
    return this;
  }

  public Authorization bind(WhereStatement bind) {
    this.binds = bind;
    return this;
  }

  public Stream<Class<? extends Entity>> entities() {
    return this.entities.stream();
  }
}

