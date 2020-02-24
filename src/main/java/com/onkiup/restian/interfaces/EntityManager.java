package com.onkiup.restian.interfaces;

import java.util.Map;
import java.util.Set;

import com.onkiup.restian.jdbc.WhereStatement;

public interface EntityManager {

  Map<Class<? extends Entity>, Map<Object, Entity>> fetch(Set<Class<? extends Entity>> types, int offset, int limit, WhereStatement... filters);
  void store(Entity... entities);
  void delete(Entity... entities);
  int count(Set<Class<? extends Entity>> types, int offset, int limit, WhereStatement... filters);
}

