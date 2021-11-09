package com.example.hello;

import java.util.Objects;

public record Hello(String one) {
  public Hello {
    Objects.requireNonNull(one);
  }
}
