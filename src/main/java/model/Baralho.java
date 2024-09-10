package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho{

  private List<Carta> cartas = new ArrayList<Carta>();

  public Baralho(){
      int ponto;
    for(Naipe naipe : Naipe.values()){
        for(Valor valor : Valor.values()){
            ponto = valor.ordinal() + 1 ;
            if(ponto > 10){
                ponto = 10;
            }
            Carta carta = new Carta(naipe, valor,ponto);
            cartas.add(carta);
        }
    }
  }

  public void exibirBaralho(){
      for(Carta carta : cartas){
          System.out.println(carta);
      }
  }

  public void embaralhar(){
    Collections.shuffle(cartas);
  }

  public Carta getCarta(){
    Carta x = cartas.get(0);
      cartas.remove(0);
      return x;
  }  

}