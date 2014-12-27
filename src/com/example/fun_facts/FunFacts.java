package com.example.fun_facts;

import java.util.Random;

/**
 * Created by michal.matlosz on 24.12.2014.
 */
public class FunFacts {

  private String[] facts = {
      "Paznokcie u rąk rosną cztery razy szybciej niż u nóg.",
      "Osoby praworęczne żyją przeciętnie dziewięć lat dłużej niż leworęczne.",
      "Jeśli potrzesz cebulą o stopę, poczujesz jej smak w ciągu 30-60 minut, ponieważ \"wędruje\" on w krwioobiegu.",
      "Nie można popełnić samobójstwa wstrzymując oddech (po utracie przytomności zaczniesz normalnie oddychać)",
      "Na fragmencie ludzkiej skóry o powierzchni 1 cala kwadratowego (ok. 6,4 cm2) żyje 20 milionów mikroskopijnych żyjątek.",
      "Ślimak może spać przez 3-4 lata. Nie potrzebuje wtedy pokarmu.",
      "Żyrafy potrafią przeżyć bez wody dłużej niż wielbłądy (czyli nawet ponad 6 tygodni).",
      "By sprawdzić czy perła jest prawdziwa, wystarczy potrzeć ją octem - skład perły spowoduje, że ocet zabulgocze.",
      "Mężczyźni są przeciętnie 30% silniejsi od kobiet, szczególnie w górnej części ciała, a ich mózgi ważą więcej niż kobiece."
  };

  public String getFact() {
    return facts[new Random().nextInt(facts.length)];
  }
}
