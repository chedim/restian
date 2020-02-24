package com.onkiup.restian.jdbc;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Stream;

import com.onkiup.restian.interfaces.Entity;

public class DataQuery {
  private Set<Class<? extends Entity>> types = new HashSet<>();
  private Collection<WhereStatement> filters = new LinkedList<>();
  private int offset, limit;
  private Set<Sorting> sortings;
  
  public DataQuery(Class<? extends Entity>... types) {
    this.types.addAll(Arrays.asList(types));
  }

  public DataQuery(Collection<Class<? extends Entity>> types) {
    this.types.addAll(types);
  }

  public DataQuery filter(WhereStatement... filters) {
    this.filters.addAll(Arrays.asList(filters));
    return this;
  }

  public DataQuery filter(Collection<WhereStatement> filters) {
    this.filters.addAll(filters);
    return this;
  }

  public DataQuery frame(int offset, int limit)  {
    this.offset = offset;
    this.limit = limit;
    return this;
  }

  public DataQuery limit(int limit) {
    this.limit = limit;
    return this;
  }

  public DataQuery offset(int offset) {
    this.offset = offset;
    return this;
  }

  public DataQuery sort(Sorting... sorting) {
    this.sortings.addAll(Arrays.asList(sorting));
    return this;
  }

  public DataQuery sort(Collection<Sorting> sortings) {
    this.sortings.addAll(sortings);
    return this;
  }

  public Stream<Class<? extends Entity>> types() {
    return types.stream();
  }

  public Stream<WhereStatement> filters() {
    return filters.stream();
  }

  public int offset() {
    return offset;
  }

  public int limit() {
    return limit;
  }

  public Stream<Sorting> sortings() {
    return sortings.stream();
  }
}

