package edu.leonardo.primeirasemana;
public class MinhaClasse {

  public static void main(String[] args) {
    
    System.out.println("Olá turma, sejam bem vindos!");
    
    String primeiroNome = "Leonardo";
    String segundoNome = "Xavier";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome){

    return primeiroNome.concat(" ").concat(segundoNome);
  }


}