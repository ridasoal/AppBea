import java.util.ArrayList;
import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
      boolean abate = false;
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
  switch (teclado){// adicionar controlador para estabelecer qual animal está sendo controlado. modificar o -1 do size()-1
    //2 aumenta numero de animais
    case 2: animal.add(new Animais());System.out.println("Caiu animal número: " + animal.get(animal.size()-1));
    animal.get(animal.size()-1).setNumInsensibilizacao();
    break;
   
//3 aumenta numer0 de insensibilizações
    case 3:  animal.get(animal.size()-1).setNumInsensibilizacao();
    System.out.println(animal.get(animal.size()-1));
  break;
  
//4 houve sinais muda pra true = ruim 
    case 4: animal.get(animal.size()-1).setHouveSinaisObservadosNoAnimal(); 
    System.out.println("\n  houve sinais:  " + animal.get(animal.size()-1).isHouveSinaisObservadosNoAnimal());
    break;

//5 vocalizacao
    case 5: animal.get(animal.size()-1).setVocalizacao(true);
    System.out.println("\n Houve vocalização no animal: " + animal.get(animal.size()-1).isVocalizacao());
    break;

//6 respiração 
    case 6: animal.get(animal.size()-1).setRespiracao(true);
    System.out.println("\n Houve respiração no animal: " + animal.get(animal.size()-1).isRespiracao()); 
    break;

//7 postura
    case 7: animal.get(animal.size()-1).setPostura(true);
    System.out.println("\n Houve tentativa de estabelecer postura: "+animal.get(animal.size()-1).isPostura());
    break;

//8 oculares
    case 8: animal.get(animal.size()-1).setOculares(true);
    System.out.println("\n Houve reflexo ocular: "+animal.get(animal.size()-1).isOculares());
    break;

// 9 dolorosos
    case 9: animal.get(animal.size()-1).setDolorosos(true);
    System.out.println("\n Houve reflexo doloroso: "+animal.get(animal.size()-1).isDolorosos());
    break;

//10 boolean contusão
    case 10: animal.get(animal.size()-1).setContusao(true);
    System.out.println("\n Animal "+animal.get(animal.size()-1)+" com contusão.");
    break;

//11 traseiro
    case 11: animal.get(animal.size()-1).setTraseiro();
    System.out.println("\n Animal com "+animal.get(animal.size()-1).getTraseiro()+ " contusões no traseiro.");
    break;

//12 dianteiro
    case 12: animal.get(animal.size()-1).setDianteiro();
    System.out.println("\n Animal com "+animal.get(animal.size()-1).getDianteiro()+ " contusões no dianteiro.");
    break;

//13 costela
    case 13: animal.get(animal.size()-1).setCostela();
    System.out.println("\n Animal com "+animal.get(animal.size()-1).getCostela()+ " Contusões na costela.");
    break;
    
  //parar abate
    case 0: abate = false; break;

  //retorno caso não acerte comando
  default: System.out.println("Não é um comando válido. 2 para novo animal, 3 adicionar insensibilização \n 0 para sair.");
   }
  }

System.out.println(teclado);
System.out.println("Número de animais " + animal.size());

//saída info animais
for (Animais animais : animal) { //arrumar o tostring
  System.out.println("número de insensibilizações do animal " +animais+ (animais).getNumInsensibilizacao());
  //System.out.println("\n");
  System.out.println(" houve sinais: " + animais + animais.isHouveSinaisObservadosNoAnimal());
 // System.out.println("\n");
  System.out.println("Houve vocalização no animal: " + animais + animais.isHouveSinaisObservadosNoAnimal());
 // System.out.println("\n");
  System.out.println("Houve respiração no animal: " + animais + animais.isRespiracao());

}


    }

 System.out.println("Abate: " + abate);


    }

}

