package com.example;

import java.util.logging.Logger;

public final class Main {
  private static final Logger LOG = Logger.getLogger(Main.class.getSimpleName());

  private Main() {}

  public static void main(String... args) {
    var hello = new Hello("world");
    LOG.info(hello::toString);
  }
}
