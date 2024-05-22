package edu.leonardo.primeirasemana;

public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarCanal( int novoCanal){

    canal = novoCanal;
System.out.println("Selecionando canal : " + canal);
  }

  public void aumentarCanal(){
    canal++;
    System.out.println("mudando canal para : " + canal);
  }

  public void diminuirCanal(){
    canal--;
    System.err.println("mudando canal para : " + canal);
  }


  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando volume para : " + volume);
  }
  
  public void diminuirVolume(){
    volume--;
    System.out.println("dimiuindo volume para: " + volume);
  }

  public void ligar(){

    ligada=true;

  }
  public void desligar(){

    ligada=false;

  }


  
}
