// import static org.junit.jupiter.api.Assertions.assertEquals;
import model.*;
import java.lang.Object;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
// import org.junit.jupiter.api.Test;

public class Main {
  private List<Player> jogadores = new ArrayList<Player>();
  public Player Vencedor = new Player("teste");




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     int opMenu = 0;
    boolean Finalizar = false;
    int op = 0;
    int verificador = 0;
    String nome;
    Main teste = new Main();
    //teste.jogadores.add(new Player("Player 1"));
    //teste.jogadores.add(new Player("Player 2"));
    while(opMenu != 2){
    System.out.println("-----menu-----");
    System.out.println("1 - Adicionar Player ");
    System.out.println("2 - Jogar");
    opMenu = scanner.nextInt();
    if(opMenu == 1){
      System.out.println("Digite o nome do jogador");
      scanner.nextLine();
      nome = scanner.nextLine();
      teste.jogadores.add(new Player(nome));
    }
    }

    Baralho baralho = new Baralho();

    baralho.embaralhar();


    do{
      
      
      for(Player jogadores : teste.jogadores){
        
        if(jogadores.getParar()){
          verificador += 1;
          continue;
        }
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Jogador: " + jogadores.getPlayer());
        System.out.println("1 - Comprar mais uma carta");
        System.out.println("2 - parar");
        System.out.println();
        op = scanner.nextInt();

        switch (op){
          case 1:
            Carta carta = baralho.getCarta();
            jogadores.setTotal(carta.getPonto());
            jogadores.sacarCarta(carta);
            jogadores.mostrarDeck();
            if(jogadores.getTotal() > 21){
              jogadores.setParar();
              System.out.print("você perdeu");
            }
            break;
          case 2:
            jogadores.setParar();
            break;
          default:
            Finalizar = true;
            break;
        }
      }
      if(verificador == teste.jogadores.size()){
        Finalizar = true;
      }
      verificador = 0;
    }while(!Finalizar);



    teste.definirVencedor();

  }

  public void definirVencedor(){
    int menor = 100;
    
    for(Player jogador : this.jogadores){
      if(jogador.getTotal() < menor){
        menor = jogador.getTotal();
        this.Vencedor = jogador;
      }
    }
    System.out.print("O vencedor é: " + this.Vencedor.getPlayer());
  }
  
}