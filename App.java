import java.util.ArrayList;
import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
      boolean abate = false;
      int indice = 0; //para controlar qual individuo do arraylist está
      ArrayList<Animais> animal = new ArrayList<Animais>();
    
    try (Scanner scan = new Scanner(System.in)) {
        int teclado = 0;
   
    //colocar if para erro de string
    while(teclado != 1){
     System.out.println("Iniciar abate? Digite 1");
     teclado = scan.nextInt();
    }
     abate = true;
          animal.add(new Animais());
         
  System.out.println();
  System.out.println("Abate iniciado");
  //System.out.println("resposta errada"); 
    
  while(abate == true){
  System.out.println("Digite outro comando(número): ");
  teclado = scan.nextInt();
  switch (teclado){//2 aumenta numero de animais
    case 2: animal.add(new Animais());System.out.println(indice); indice++; System.out.println(indice); 
  break;
  
//3 aumenta numer0 de insensibilizações
    case 3:  animal.get(animal.size()-1).setNumInsensibilizacao(1); System.out.println(indice);
  break;
  
//4 houve sinais muda pra true = ruim 
    case 4: animal.get(animal.size()-1).setHouveSinaisObservadosNoAnimal(); System.out.println("\n  houve sinais:  " + animal.get(animal.size()-1).isHouveSinaisObservadosNoAnimal());
    break;
  //parar abate
    case 0: abate = false; break;

  //retorno caso não acerte comando
  default: System.out.println("Não é um comando válido. 2 para novo animal, 3 adicionar insensibilização \n 0 para sair.");
   }
  }

System.out.println(teclado);
System.out.println("animais " + animal.size());
System.out.println("número de insensibilizações do animal " + animal.get(animal.size()).getNumInsensibilizacao());
System.out.println("houve sinais: " + animal.get(animal.size()-1).isHouveSinaisObservadosNoAnimal());
    }

 System.out.println("Abate: " + abate);


    }

}

