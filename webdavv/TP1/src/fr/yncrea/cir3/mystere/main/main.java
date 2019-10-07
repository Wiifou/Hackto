package fr.yncrea.cir3.mystere.main;

import fr.yncrea.cir3.mystere.random.CompareInt;
import fr.yncrea.cir3.mystere.random.Int_random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Int_random roll = new Int_random();
        int valSaisie;
        int Tirage = roll.getTirage();
        CompareInt cmp = new CompareInt();
        ArrayList<Integer> tab = new ArrayList<>();

        while (cmp.getEtatFind() == 0){
            System.out.println("Entrez un nombre: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String read;
            try {
                 read = reader.readLine();
            }catch (IOException e){
                System.out.println(e);
                read = "-1";
            }
            valSaisie = Integer.parseInt(read);


            cmp.twoInt(Tirage, valSaisie);
            tab.add(valSaisie);

        }

        if (cmp.getEtatFind() == 1){
            System.out.println("Le nombre était : "+ Tirage);
            System.out.println("Découvert en " + tab.size() + " coup!");
            System.out.println("Les tentatives était:");
            for (Integer f : tab){
                System.out.println(f);
            }

        }

    }
}
