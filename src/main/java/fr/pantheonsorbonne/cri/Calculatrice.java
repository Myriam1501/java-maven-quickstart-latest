package fr.pantheonsorbonne.cri;

public class Calculatrice {

    private Calculatrice(){
    }
    
    public static int getEvenIntegerSumBetween(int begin, int end){
        int somme=0;
        for(int i=begin;i<=end; i++){
            if(i%2==0){
                somme+=i;

            }
        }
        return somme; 
    };
/**
 * La methode getEvenIntegerSumBetween(int begin, int end) permet de calculer la somme des entiers 
 * paire entre begin et end inclus.
 * @param begin est le premier chiffre pour commencer calcul
 * @param end est le dernier chiffre 
 * @return retourner la sommen des entiers paires
 */
    public static int getIntegerSumBetween(int begin, int end){

        if( begin>end){
            throw new IllegalArgumentException();
        }
        if( begin<0){
            throw new IllegalArgumentException();
        }
        int result =0;
        for(int i=begin; i<=end; i++){
            result += i;
        }
        return result;
    }
    
}
