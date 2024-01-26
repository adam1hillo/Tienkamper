package be.vdab;

import be.vdab.tienkamper.Tienkamper;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Tienkamper> atletenAl = new ArrayList<>();
        atletenAl.add(new Tienkamper("Adam", 100));
        atletenAl.add(new Tienkamper("Ziggy", 80));
        atletenAl.add(new Tienkamper("Eugene", 200));
        atletenAl.add(new Tienkamper("John", 130));
        atletenAl.add(new Tienkamper("Bilbo", 100));
        for (Tienkamper tienkamper : atletenAl) {
            System.out.println(tienkamper);
        }
        System.out.println();

        Set<Tienkamper> atletenTs = new TreeSet<>(atletenAl);
        for (Tienkamper t : atletenTs) {
            System.out.println(t);
        }
    }
}
