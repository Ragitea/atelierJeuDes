package atelierjeuxdes;

public class De {

    private int num;
    private int nbFaces;
    private int val;
    private boolean estPipe=false;

    public De() { //initialisation
        num = 0;
        nbFaces = 6;
        val = 0;

    }

    public De(int num, int nbFaces, int val) { //constructeur
        this.num = num;
        this.nbFaces = nbFaces;
        this.val = val;
    }

    public De(int nbFaces) {
        this();
        this.nbFaces = nbFaces; 
    }

    public void Lancer() { // Lancer au hasard
        val = (int) Math.floor(nbFaces * Math.random()) + 1; 
        //System.out.println(val);
    }

    @Override
    public String toString() {
        return " dé " + num + " : " + val;
    }

    public void piper() { // De truqué
//        if (val ==1) {
//            val = 1;
//        } 
//        else if (val==2){
//            val = 2;
//        }
//        else if (val==3){
//            val = 2; 
//        }
//        else if (val==4) {
//            val = 4;
//        }
//        else if (val==5) {
//            val =4;
//        }
//        else if (val==6) {
//            val = 1;
//        }
//        System.out.println(" Dé " + num + " : " + val);
        val = (int) Math.floor(3 * Math.random()) + 1;
        if (val == 1) {
            val = 1;
        } else if (val == 2) {
            val = 2;
        } else if (val == 3) {
            val = 4;
        }
        System.out.println(" Dé " + num + " : " + val);
    }

    public int getNum() {
        return num;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int getVal() {
        return val;
    }

}
