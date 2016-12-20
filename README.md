# How to generate JaCoCo coverage using offline instrumenatation

**Language**: Java 8

**Build tool**: maven

**Coverage tool**: JaCoCo


In some cases we have to use offline instrumentation instead of the default and preferd on-the-fly method of JaCoCo. In most of
those cases the reasone because we want to do that is to show coverage of **Powermock** instrumented tests. 

Because of the way Powermock works when using JaCoCo, by default, coverage is 0. 

This example shows how to generate jacoco.exec, jaococo-it.exec and the reports based on those files.

Project is easily built using: 
```mvn clean install```
