package fr.yncrea.cir3.mystere.random;


public class CompareInt {
    public int getEtatFind() {
        return etatFind;
    }

    int etatFind;
    public CompareInt(){
        etatFind = 0;
    }

    public  void twoInt(int x1, int x2){
        if (x1 > x2){
            System.out.println("Le nombre est plus grand!");
        }else if (x2 > x1){
            System.out.println("Le nombre est plus petit!");
        }else{
            System.out.println("Le nombre est égal bravo !");
            etatFind = 1;
        }

    }
}
