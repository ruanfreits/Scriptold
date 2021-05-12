#include <stdio.h>

//Implementar algoritimo simples de Fila
//Variaveis de controle:  int inicio, fim , total , tamanho
//Vetor da fila: int vetor[5];
//funcoes:  filaCheia(),filaVazia(),inserirFila(int elemento), removerFila(), mostrarFila()


int vetor[5];
int total = 0;
int inicio = 0;
int fim = 0;
int tamanhoVetor = 5;

//se total for igual a tamanho, retorna 1 ... fila cheia
int filaCheia(){
   if(total >= tamanhoVetor){
       return 1;
   } 
   return 0;
}

//recebe um elemento inteiro via parametro e insere no vetor de fila caso a fila nao esteja cheia
void inserirFila(int elemento){
    if(filaCheia() == 1){
        printf("fila cheia");
    }else{
        vetor[fim] = elemento;
        fim++;
        total++;
        if(fim >= tamanhoVetor){
            fim = 0;
        }
    }   
}

int filaVazia(){
    if(total == 0){
        return 1;
    }    
    return 0;
}

int removerFila(){
    if(filaVazia() == 1){
        printf("fila vazia");
    }
    else{
        int elemento = vetor[inicio];
        inicio++;
        total--;
        if(inicio >= tamanhoVetor){
            inicio = 0;
        }
        
        
    }
}

void mostrarFila(){
	int posicao = inicio;
	
	for(int i = 0; i < total; i++){
		printf("%d Elemento da fila e: %d     posicao no vetor: %d \n",i+1, vetor[posicao],posicao);
		posicao++;
		if(posicao >= tamanhoVetor){
			posicao = 0;
		}	
		
	}
	printf("\n");
}

int ultimoDaFila(){
    return vetor[fim-1];
}

int primeiroFila(){
    return vetor[inicio];
}
int main()
{
    inserirFila(10);
    inserirFila(20);
    inserirFila(30);
    inserirFila(40);
    inserirFila(50);
    mostrarFila();
    removerFila();//remove o 10
    removerFila();//remove o 20
    removerFila();//remove o 30
    removerFila();//remove o 40
    mostrarFila();//remove o 50
    inserirFila(60);
    mostrarFila();
    
    printf("\n\n ultimo: %d", ultimoDaFila());
    printf("\n\n primeiro: %d", primeiroFila());
    return 0;
}
