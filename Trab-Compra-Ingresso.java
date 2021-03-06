import java.util.Scanner;
import java.io.IOException;

public class Main
{
    int resposta;
    
	public static void main(String[] args) {

Main principal = new Main();

Scanner sc = new Scanner(System.in);


     Normal NRML = new Normal();
     Vip vip = new Vip();
     camarote_Inferior CAMINF = new camarote_Inferior();
     camarote_Superior CAMSUP = new camarote_Superior();
    
    
   /*Prova de que o valor no ingresso não foi definido ainda, irá aparecer R$0,00*/NRML.imprimeValor();
   /*Prova de que o valor no ingresso não foi definido ainda, irá aparecer R$0,00*/vip.imprimeValor();
   
   
   
   /* Este método é o que estabelece o seu tipo de ingresso e define o preço do ingresso normal */ NRML.setPreco();
    /*agora que já foi definido como normal, Este método mostrará o valor do ingresso R$10,00,  */NRML.imprimeValor();
    
  
  
  /* Este método é o que estabelece o seu tipo de ingresso e define o preço do ingresso normal */vip.setPreco();
    /* agora que já foi definido como vip ,Este método mostra o valor do ingresso R$ 15,00 */vip.imprimeValor();
    
   
   
   
   /*Prova de que camarote ainda não definido, Este método mostrar uma messagem dizendo que a localização nâo foi definida*/vip.mostrarLocalizacao();
   
    /*este método possibilita o usuário a definir qual camarote ele deseja, caso não seja escolhido nenhum o programa encerrará*/vip.setLocal();
    
    /*agora que já foi definido a localização, através deste método será apresentado o camarote escolhido*/vip.mostrarLocalizacao();




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

         //outras formas de definir o ingresso vip, seja camarote inferior ou superior, sem utilizar o método vip.setLocal();.//
    
    
     /*definir ingresso como camarote inferior*/  CAMINF.setPreco();
    /*imprimir preco do camarote inferior */CAMINF.imprimeValor();
    
    
    /*definir ingresso como camarote superior*/CAMSUP.setPreco();
    /*imprimir preço do camarote superior */CAMSUP.imprimeValor();
	}
}


/////////////////////////////////////////////////////////////////////////////////
public abstract class Ingresso{
    int preconormal = 10;
    int preco;
   
    protected String categoria;
    public abstract void imprimeValor();
    
    public abstract int setPreco();
}

//////////////////////////////////////////////////////////////////////////////////
public class Normal extends Ingresso{
    
  
  @Override
    public int setPreco(){
        
        System.out.println("Você determinou o seu tipo de ingresso...\n INGRESSO ESCOLHIDO (NORMAL)");
        return this.preco = this.preco + this.preconormal;
    }
     
    public void imprimeValor(){
        System.out.println("Valor do seu Ingresso Normal R$"+ preco +",00");
    }
    
    /*
    public int void setLocalização(){
        return String = "CamoroteInferior";
    }
 
    //Pedido no Trabalho
   
    public void ImprimeNormal(){
        System.out.println(valornormal);
        
    }
    
   */ 
}

/////////////////////////////////////////////////////////////////////////////////////////


import java.io.IOException;
import java.util.Scanner;
public class Vip extends Ingresso{
    
  Scanner sc = new Scanner(System.in);
  
 /*é necessário declarar o preco vip, para utilizalo no camarote_superior*/ int precovip = 15;
    
    int taxaVip = 5;
    int resposta;
    public int localizacao = 0;



    public int setLocal(){
        System.out.println("Qual a localização você deseja? \n DIGITE 1 PARA (INFERIOR) \n DIGITE 2 PARA (SUPERIOR) \n clique qualquer outra tecla para sair");

resposta = sc.nextInt(); 

if(resposta == 1){
                    return localizacao = 1;
                }
                
            else{
                    if(resposta == 2){
                         System.out.println("Você determinou o seu tipo de ingresso...\n INGRESSO ESCOLHIDO(VIP SUPERIOR)");
                    return localizacao = 2;
                                    }
                 else{System.out.println("NENHUMA OPÇÃO ESCOLHIDA... ATÉ MAIS");
                                        return 0;
                     
                     }   
                }
                
    }
 
 
 
 
 
 
 
 
 
 
 public void mostrarLocalizacao(){
     
                 if (localizacao == 0){
                        System.out.println("SEU CAMAROTE AINDA NÃO FOI DEFINIDO");
                                        }
                                             else{
                                                        if(localizacao == 1){
                                                                     System.out.println("SEU CAMAROTE É O INFERIOR");
                                                                            }
                                                        else{
                                                         System.out.println("SEU CAMAROTE É O SUPERIOR");
        
                                                              }
                                                 }
                                }

    
    
    
     @Override
    public int setPreco(){
        System.out.println("Você determinou o seu tipo de ingresso...\n INGRESSO ESCOLHIDO(VIP)");
        
        
        return this.preco = this.preconormal + taxaVip;
    }

  public void imprimeValor(){
        System.out.println("Valor do seu Ingresso Vip R$"+ preco +",00");
    }
    
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////


public class camarote_Inferior extends Vip{
    
      @Override
    public int setPreco(){
        System.out.println("Você determinou o seu tipo de ingresso...\n INGRESSO ESCOLHIDO(VIP INFERIOR)");
        
        return this.preco = this.preconormal + taxaVip;
    }
    
    
     public void imprimeValor(){
        System.out.println("Valor do Ingresso Vip Camarote Inferior R$"+ preco +",00");
    }
    
    
}


///////////////////////////////////////////////////////////////////////////////////////////////////


public class camarote_Superior extends Vip{
    
    
  int taxaVipSuper = 5 ;
    
    
    
        @Override
    public int setPreco(){
        System.out.println("Você determinou o seu tipo de ingresso...\n INGRESSO ESCOLHIDO(VIP SUPERIOR)");
        
        return this.preco = this.precovip + taxaVipSuper;
    }

 public void imprimeValor(){
        System.out.println("Valor do Ingresso Vip Superior R$"+ preco +",00");
    }
    
    
}
