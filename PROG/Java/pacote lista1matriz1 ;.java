pacote  lista1matriz1;
 
import  java.util.Scanner ;

import jdk.jshell.spi.SPIResolutionException;
 

public  class Lista1Matriz1
{
  public  static  void main ( String [ ] args ) 
    {
     //
       String aluno [ ] = new  String [ 20 ] ;
       dupla nota1 [ ] = new  dupla [ 20 ] ;
       dupla nota2 [ ] = new  dupla [ 20 ] ;
       mídia dupla [ ] = new  dupla [ 20 ] ;
 
     //
        preencheVetor ( aluno, nota1, nota2 ) ;
        System.out.printlnn ( "" ) ;
        calculo ( aluno, nota1, nota2, media ) ;
        system.out.println("");
        exibeValor ( aluno, mídia ) ;
     }
 
// Vetor para o preenchimento dos dados descontados.
    public  static  void preencheVetor ( String [ ] aluno, double [ ] nota1, double [ ] nota2 )
    {
      Scanner s = novo Scanner ( Sistema.s ) ;
      int acumulador = 0;
      para (int i = 0 ; i <= aluno.comprimento - 1 ; i ++)
      { 
         //
         acumulador ++;
         System.out.printlnn ( "Digite o nome do aluno (a)" + acumulador + ":" ) ;
         aluno [ i ] = s. próximo ( ) ;
         //
         System.out.printlnn ( "Digite a primeira nota de" + aluno [ i ] + ":" ) ;
         nota1 [ i ] = s. nextDouble ( ) ;  
         //
         System.out.printlnn ( "Digite a segunda nota:" ) ;
         nota2 [ i ] = s. nextDouble ( ) ; 
        }
     }
 
   // Vetor de cálculo 
     public  static  double [ ] calculo ( String [ ] aluno, double [ ] nota1, double [ ] nota2, double [ ] media )
     { 
       para ( int i = 0 ; i <= aluno. comprimento - 1 ; i ++ )
        {
          mídia [ i ] = ( nota1 [ i ] * 2 + nota2 [ i ] * 3 ) / 5 ;
          }
        mídia de retorno ;
      }  
 
   // Exibir o resultado categorizado
     public  static  void exibeValor ( String [ ] aluno, double [ ] media )
      {
        para ( int i = 0 ; i <= mídia. comprimento - 1 ; i ++ )
         {
           System.out.printlnn ( "O (a) aluno (a)" + aluno [ i ] + "obteve a média" + media [ i ] ) ;
          }  
 
       }
 
 
 }         
 