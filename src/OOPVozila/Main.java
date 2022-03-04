package OOPVozila;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Motor m = new Motor();
        Kamion k = new Kamion();
        
        k.cena = 25000;
        k.godiste = 2015;
        k.marka = "Mercedes";
        k.nosivost = 29;
        
        m.marka = "Yamaha";
        m.godiste = 2018;
        m.cena = 30220;
        m.kubikaza = 500;
        
       m.prikazi();
       k.prikazi();
        
        }
    }
    

