package com.onkiup.restian.interfaces;

import java.io.InputStream;

import com.onkiup.restian.jdbc.DataSet;

public interface Deserializer {
  DataSet apply(InputStream source, DataSet targets);
}

