# Metrics Datadog Reporter
Simple Metrics reporter that sends The Goods to Datadog.

This project is a lightly modified fork of [vistarmedia/metrics-datadog](https://github.com/vistarmedia/metrics-datado://github.com/vistarmedia/metrics-datadog) where the ability to enable a DatadogReporter which publishes metrics with a given prefix was added.

This reporter can be used in a Dropwizard app with at least `dropwizard-core` 0.6.X

## Usage

~~~scala
import com.yammer.metrics.reporting.DatadogReporter

...

DatadogReporter.enable(15, TimeUnit.SECONDS, myDatadogKey);

// To enable a DatadogReporter which reports metrics with a given prefix.
DatadogReporter.enable(15, TimeUnit.SECONDS, myDatadogKey, optionalHost, "myMetricPrefix");

~~~

