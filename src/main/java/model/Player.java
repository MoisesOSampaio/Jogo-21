package model;

import java.util.List;
import java.util.ArrayList;


public class Player{
  private String player;
  private int total;
  private boolean parar;
  private List<Carta> deck = new ArrayList<Carta>();

  public Player(String player){
    this.player = player;
    this.total = 0;
    this.parar = false;
  }

  public void sacarCarta(Carta carta){
    deck.add(carta);
  }
  
  public int getTotal(){
    return total;
  }

  public String getPlayer(){
    return player;
  }

  public void setTotal(int valor){
    this.total += valor;
  }

  public boolean getParar(){
    return parar;
  }

  public void setParar(){
     parar = !parar;
  }

  public void mostrarDeck(){
    for(Carta card : deck){
      System.out.println();
      System.out.println("Naipe: " + card.getNaipe());
      System.out.println("Valor: " + card.getValor());
      System.out.println("Ponto: " + card.getPonto());
      System.out.println("------");
    }

  }
}