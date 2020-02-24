package com.onkiup.restian.interfaces;

import com.onkiup.restian.interfaces.Endpoint;
import com.sun.net.httpserver.HttpExchange;

/**
 * Common interface for API request routing
 */
public interface EntityRouter {
  /**
   * Router algorithm entrance point
   * @param exchange an HTTP request to route
   * @return entity class to which this request should be mapped (or null if this request cannot be routed)
   */
  Endpoint route(HttpExchange exchange);
}

