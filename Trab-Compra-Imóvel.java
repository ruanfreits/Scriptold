import java.util.Scanner;
import java.io.IOException;
public class Main
{
	public static void main(String[] args) {

/*
As variaveis da classe Imóvel são modificadas com conforme é determinado o tipo de Imovel escolhido.
ou seja, após utilizar o setPreco com a classe Novo e determinar preco do imovel= 150000, automaticamente este ato torna a variável preco da classe imóvel = 150000 também.

Em outras palavras Imóvel é a classe que reflete as caracteristicas de suas escolhas.

*/




Scanner sc = new Scanner(System.in);

Imovel imovel = new Imovel();

Novo novo = new Novo();

Velho velho = new Velho();



imovel.EXcolha();

imovel.EXcolha();





//novo.setPreco();

/*Utilizado anteeeees*///imovel.escolha();



//novo.setPreco();

//imovel.setPreco();

//imovel.teste();


imovel.imprimirpreco();
imovel.imprimir_Endereco();

	}
}
//////////////////////////////////////////////////////


import java.util.Scanner;
import java.io.IOException;
class Imovel{
    
    public int endereco;
    public int preco;
    int resposta;
    
    /* utilizar como valor base */public static int precoBase = 100000;
    public static int imoveisx2 = 2;
    
    Scanner sc = new Scanner(System.in);
   
    
    
    
    
    
    
    public int escolha(){
        System.out.println("Digite um número para escolher ou dois Imóveis, |para sair precione qualquer outra tecla|.\n (1)Imóvel Novo \n (2)Imóvel Velho \n (3)Imóvel Novo e Velho");
    
    resposta = sc.nextInt();
   
    if(resposta == 1){
             Novo novo = new Novo();
            System.out.println("Imóvel escolhido (NOVO)");
        
         endereco = novo.setEndereco();
        return preco = novo.setPreco();
        }
            else {
                if(resposta == 2 ){
                    Velho velho = new Velho();
                    System.out.println("Imóvel escolhido (VELHO)");
               endereco = velho.setEndereco();
                return preco = velho.setPreco();
            }
            else{
                System.out.println("Imóveis escolhidos (NOVO e Velho)");
                preco = precoBase * imoveisx2;
                
                
                
                return preco;
                
                         }
                    }
          
            }

    
     public void imprimirpreco(){
          System.out.println("Valor do Imóvel ou imóveis R$"+preco+",00");
    }
    
    
    
    
    
    //////////////////PARTE MÉTODO-CENTRAL/////////////////////
    
    public int EXcolha(){
        
     
     System.out.println("Escolha o Imóvel digitando um número \n (1)Imóvel Novo \n (2)Imóvel Velho \n (3)Imóvel Novo&Velho \n para sair precione (0)");
    
    resposta = sc.nextInt();
    
    switch (resposta) {
  case 1:
Novo novo = new Novo();
            System.out.println("Imóvel escolhido (NOVO)");
        
         endereco = novo.setEndereco();
        return preco = novo.setPreco();
        
  case 2:
    Velho velho = new Velho();
                    System.out.println("Imóvel escolhido (VELHO)");
               endereco = velho.setEndereco();
                return preco = velho.setPreco();
  case 3:
       System.out.println("Imóveis escolhidos (NOVO e Velho)");
                endereco = setEndereco();
                return preco = precoBase * imoveisx2;
  
  case 0:
      System.out.println("Nenhum Imóvel Escolhido|Até mais...|");
     return 0;

  default:
     return 0;
}
}
    
   
    
    
    
    
  
  
  //////////////////PARTE DE ENDEREÇO//////////////////
  
    public int setEndereco(){
        return endereco = 3;
    }
    
    
    public void imprimir_Endereco(){
switch(endereco){
    case (0):  
        System.out.println("Seu Imóvel ainda não foi escolhido");
    
    break;
    case (1):
    
            System.out.println("Av.Bartolomeu de Gusmão nº123");
    
    break;
case (2):
              
                System.out.println("Av.Presidente Vargas nº456");
    break;
    
    
case (3):
        
            System.out.println("Você possui dois Imóveis... \n Seus endereços: \n Av.Bartolomeu de Gusmão nº123 \n Av.Presidente Vargas nº456");
    break;
    
        }
    
}



    
    
    public int setPreco(){
    return preco;
    }
}

///////////////////////////////////////////////////////


public class Novo extends Imovel{
    
   int valor_Adicional = 50000;
   
   
    @Override
    public int setPreco(){
       
       
       
        if(this.preco == 150000){
            System.out.println("você já possui um Imóvel novo.");
            
        }
        
        
        this.preco = this.preco + this.precoBase + valor_Adicional;
        System.out.println("valor do imovel escolhido: R$"+this.preco+",00");
        return this.preco;
    }
    
    @Override
    public int setEndereco(){
        
        return endereco = 1;
    }
    
    
    
    
}


//////////////////////////////////////////////////////////////////////

public class Velho extends Imovel{
    
    int valor_Desconto = 50000;
    
    
     @Override
    public int setPreco(){
        
        this.preco = this.preco + this.precoBase - valor_Desconto;
        System.out.println("valor do imovel escolhido: R$"+this.preco+",00");
        return this.preco;
    }
    
    
    
    @Override
    public int setEndereco(){
        
        return endereco = 2;
    }
    
}
