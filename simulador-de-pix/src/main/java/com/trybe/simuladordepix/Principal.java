package com.trybe.simuladordepix;

public class Principal {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    Servidor servidor = new ServidorFake();
    ProcessadorDePix processadorDePix = new ProcessadorDePix(servidor);
    ControladorDePix controladorDePix = new ControladorDePix(processadorDePix);
    String mensagem = controladorDePix.aoConfirmarPix(10, "asdds322");
    System.out.println(mensagem);
  }
}
