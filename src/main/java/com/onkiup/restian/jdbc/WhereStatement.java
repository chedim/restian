package com.onkiup.restian.jdbc;

public class WhereStatement {
  private String statement;
  private Object[] arguments;

  public WhereStatement(String statement, Object... arguments) {
    this.statement = statement;
    this.arguments = arguments;
  }

  public String statement() {
    return statement;
  }

  public Object[] arguments() {
    return arguments;
  }
}

