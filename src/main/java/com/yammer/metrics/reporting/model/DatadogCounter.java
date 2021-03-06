package com.yammer.metrics.reporting.model;

public class DatadogCounter extends DatadogSeries<Long> {
  
  public DatadogCounter(String name, Long count, Long epoch, String host) {
    super(name, count, epoch, host);
  }

  public String getType() {
    return "counter";
  }
}
