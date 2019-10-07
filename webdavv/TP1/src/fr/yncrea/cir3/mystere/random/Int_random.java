package fr.yncrea.cir3.mystere.random;

import java.util.ArrayList;

public class Int_random {

    ArrayList<Integer> mTirage_tab;
    int Tirage;

    public ArrayList<Integer> getmTirage_tab() {
        return mTirage_tab;
    }

    public int getTirage() {
        return Tirage;
    }

    public Int_random(){
        mTirage_tab = new ArrayList<>();
        reroll();

    }

    public void reroll(){
        System.out.println("ROOOOOOOLLLL");
        Tirage =  (int)(Math.random() * ((100 - 0) + 1));
        mTirage_tab.add(Tirage);


    }
}
