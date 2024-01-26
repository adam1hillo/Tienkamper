package be.vdab.tienkamper;

import java.util.Objects;

public class Tienkamper implements Comparable<Tienkamper>{

    private String naam = "";
    private int punten;

    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public final void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
    }

    public int getPunten() {
        return punten;
    }

    public final void setPunten(int punten) {
        if (punten >= 0) {
            this.punten = punten;
        }
    }

    @Override
    public String toString() {
        return naam + " - " + punten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienkamper t)) {
            return false;
        }
        return naam.equals(t.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(naam);
    }


    @Override
    public int compareTo(Tienkamper t) {
        return naam.compareTo(t.naam);
    }
}
