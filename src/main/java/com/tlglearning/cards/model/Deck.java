package com.tlglearning.cards.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card>{

  private final List<Card> cards;

  //Constructor -no parameter👌
  public Deck() {
    cards = new ArrayList<>();
    //nested enhanced for-loop, to go through suits♥♦♠♣ and for each suit assign values
    for (Suit suit : Suit.values()){
     for (Rank rank : Rank.values()){
       Card card = new Card(rank, suit);
       cards.add(card); // TODO: 9/16/2022 shuffle, deal, order cards
     }
    }
  }

  @Override
  public Iterator<Card> iterator() {
    return cards.iterator();
  }
}
