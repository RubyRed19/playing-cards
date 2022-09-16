package com.tlglearning.cards.model;

import java.util.Objects;

public class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank rank() {
    return rank;
  }

  public Suit suit() {
    return suit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, suit);
    // FIXME: 9/16/2022 Move this to initialization.
  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;  //check to see if they're pointing to the same place, if yes no need to compare, they're the same.
    } else if (obj instanceof Card) {   //if they're not pointing to the same place, then check for equality of state
     Card other = (Card) obj;
     result = (this.rank == other.rank && this.suit == other.suit);  //using "this" is optional
    }else {   //if we get here, they don't point to same place, and don't have equality of state, then you're done, they're not equal
      result = false;
    }
      return result;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  @Override
  public int compareTo(Card other) {
    return 0; // TODO: 9/16/2022 Replace comparison based on suit and rank.
  }

}
