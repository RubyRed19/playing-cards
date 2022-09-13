package com.tlglearning.cards.model;

public enum Suit {
  //these get expanded to constructor invocation in the byte code by the compiler
  CLUBS('\u2663'),  // Becomes > public static final Suit CLUBS = new Suit('\u2663'); ''-used for char literals
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol;

  //enum constructors are always private, can't be created at runtime, therefore doesn't need the
  //private modifier
  private Suit(char symbol) {
    this.symbol = symbol;
  }

  public char symbol(){
    return symbol;
  }

  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase();
  }
}