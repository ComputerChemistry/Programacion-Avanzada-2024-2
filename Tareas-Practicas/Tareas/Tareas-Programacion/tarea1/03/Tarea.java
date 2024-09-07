/*
Programa 3

Nombres: Carlos Eduardo Moreno Vargas, Joan Lazaro Silva, Joaquin Castro Cordova, Cesar Alejandro Rojas Murrieta

Curso: Programacion Avazada 2024-2

**/

public class Tarea {
  public static String imprimeSinComentarios(String cadena) {
    StringBuilder resultado = new StringBuilder();
    boolean enComentario = false;
    for (int i = 0; i < cadena.length(); i++) {
      char caracter = cadena.charAt(i);
      if (caracter == '<' && !enComentario) {
        enComentario = true;
      } else if (caracter == '>' && enComentario) {
        enComentario = false;
      } else if (!enComentario) {
        resultado.append(caracter);
      }
    }
    return resultado.toString();
  }
 
  public static void main(String[] args) {
    String textoNormal = "texto normal";
    String comentarioNormal = "este tiene un comentario normal <exactamente aquí> para ser borrado";
    String multiplesMenorQue = "este tiene múltiples menor-que en un comentario <<<<<aquí>";
    String mayorQueFuera = "este > tiene <comentario>mayor-que fuera de un comentario >>";
    String multiplesComentarios = "<hi>este tiene <foo> múltiples <bar> comentarios <baz><><>.";
    String comentarioNoCerrado = "este tiene un comentario <no cerrado";
 
    System.out.println("Texto normal: " + imprimeSinComentarios(textoNormal));
    System.out.println("Comentario normal: " + imprimeSinComentarios(comentarioNormal));
    System.out.println("Múltiples menor-que: " + imprimeSinComentarios(multiplesMenorQue));
    System.out.println("Mayor-que fuera: " + imprimeSinComentarios(mayorQueFuera));
    System.out.println("Múltiples comentarios: " + imprimeSinComentarios(multiplesComentarios));
    System.out.println("Comentario no cerrado: " + imprimeSinComentarios(comentarioNoCerrado));
  }
}





