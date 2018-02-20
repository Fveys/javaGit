package be.heh.ex1;

public class Carre {

     private float cote;

     public Carre(float cote){
         this.cote = cote;
     }

     public float perimetre(){
         return cote*4;
     }

     public float aire(){
         return cote*cote;
     }

}
