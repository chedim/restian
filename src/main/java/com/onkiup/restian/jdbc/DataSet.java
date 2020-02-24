package com.onkiup.restian.jdbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.onkiup.restian.interfaces.Entity;

public class DataSet {

  private Map<Class<? extends Entity>, Map<Object, Entity>> entities = new HashMap<>();

  public void add(Entity entity) {
    Class<? extends Entity> type = entity.getClass();
    if (entities.containsKey(type)) {
      entities.put(type, new HashMap<>());
    }

    Map<Object, Entity> typeEntities = entities.get(type);
    typeEntities.put(entity.id(), entity);
  }


  public Optional<Entity> get(Class<? extends Entity> type, Object id) {
    if (entities.containsKey(type)) {
      return Optional.ofNullable(entities.get(type).get(id));
    }

    return Optional.empty();
  }

  public int count() {
    return entities.values().stream()
      .collect(Collectors.summingInt(Map::size));
  }

  public int count(Class<? extends Entity> type) {
    if (entities.containsKey(type)) {
      return 0;
    }
    return entities.get(type).size();
   }

  public boolean contains(Class<? extends Entity> type) {
    return entities.containsKey(type);
  }

  public boolean contains(Class<? extends Entity> type, Object id) {
    return entities.containsKey(type) && entities.get(type).containsKey(id);
  }
}

