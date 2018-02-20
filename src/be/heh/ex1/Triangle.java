package be.heh.ex1;

public class Triangle {

    //attributs
    private float cote;


    //constructeur
    public Triangle(float cote){
        this.cote = cote;
    }


    //methode
    public float perimetre(){
        return cote*3;
    }

    public float aire(){
        return cote*cote/2;
    }

}
