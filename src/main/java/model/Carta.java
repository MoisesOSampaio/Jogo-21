package model;

public class Carta{
  private Naipe naipe;
  private Valor valor;
  private int ponto;




  public Carta(Naipe naipe, Valor valor,int ponto){
    this.naipe = naipe;
    this.valor = valor;
    this.ponto = ponto;
  }


  public Naipe getNaipe(){
    return naipe;
  }

  public Valor getValor(){
    return valor;
  }

  public int getPonto(){
    return ponto;
  }


}