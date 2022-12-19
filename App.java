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
     int qualanimal = 1;

         
  System.out.println();
  System.out.println("Abate iniciado");
  //System.out.println("resposta errada"); 
    
  while(abate == true){
  System.out.println("Digite outro comando(número): ");
  teclado = scan.nextInt();
  switch (teclado){// adicionar controlador para estabelecer qual animal está sendo controlado. modificar o -qualanimal do size()-qualanimal
    //2 aumenta numero de animais
    case 2: animal.add(new Animais());System.out.println("Caiu animal número: " + animal.get(animal.size()-qualanimal));
    animal.get(animal.size()-qualanimal).setNumInsensibilizacao();
    break;
   
//3 aumenta numer0 de insensibilizações
    case 3:  animal.get(animal.size()-qualanimal).setNumInsensibilizacao();
    System.out.println(animal.get(animal.size()-qualanimal));
  break;
  
//4 houve sinais muda pra true = ruim 
    case 4: animal.get(animal.size()-qualanimal).setHouveSinaisObservadosNoAnimal(); 
    System.out.println("\n  houve sinais:  " + animal.get(animal.size()-qualanimal).isHouveSinaisObservadosNoAnimal());
    break;

//5 vocalizacao
    case 5: animal.get(animal.size()-qualanimal).setVocalizacao(true);
    System.out.println("\n Houve vocalização no animal: " + animal.get(animal.size()-qualanimal).isVocalizacao());
    break;

//6 respiração 
    case 6: animal.get(animal.size()-qualanimal).setRespiracao(true);
    System.out.println("\n Houve respiração no animal: " + animal.get(animal.size()-qualanimal).isRespiracao()); 
    break;

//7 postura
    case 7: animal.get(animal.size()-qualanimal).setPostura(true);
    System.out.println("\n Houve tentativa de estabelecer postura: "+animal.get(animal.size()-qualanimal).isPostura());
    break;

//8 oculares
    case 8: animal.get(animal.size()-qualanimal).setOculares(true);
    System.out.println("\n Houve reflexo ocular: "+animal.get(animal.size()-qualanimal).isOculares());
    break;

// 9 dolorosos
    case 9: animal.get(animal.size()-qualanimal).setDolorosos(true);
    System.out.println("\n Houve reflexo doloroso: "+animal.get(animal.size()-qualanimal).isDolorosos());
    break;

//l0 boolean contusão
    case 10: animal.get(animal.size()-qualanimal).setContusao(true);
    System.out.println("\n Animal "+animal.get(animal.size()-qualanimal)+" com contusão.");
    break;

//11 traseiro
    case 11: animal.get(animal.size()-qualanimal).setTraseiro();
    System.out.println("\n Animal com "+animal.get(animal.size()-qualanimal).getTraseiro()+ " contusões no traseiro.");
    break;

//l2 dianteiro
    case 12: animal.get(animal.size()-qualanimal).setDianteiro();
    System.out.println("\n Animal com "+animal.get(animal.size()-qualanimal).getDianteiro()+ " contusões no dianteiro.");
    break;

//13 costela
    case 13: animal.get(animal.size()-qualanimal).setCostela();
    System.out.println("\n Animal com "+animal.get(animal.size()-qualanimal).getCostela()+ " Contusões na costela.");
    break;
    
//14 observações
    case 14: System.out.println("Digite a observação: ");
    String teclados = scan.next(); 
    animal.get(animal.size()-qualanimal).setObservacoes(teclados);    
    break;

// ajustar qual animal está trabalhando ... 20 diminui, 21 aumenta
    case 20: qualanimal--;
    if (qualanimal<1) qualanimal=1;
    break;
    case 21: qualanimal++;
    if (qualanimal>animal.size()) qualanimal=animal.size()-1;
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

