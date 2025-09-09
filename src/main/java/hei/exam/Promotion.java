package hei.exam;


import lombok.*;

import java.time.LocalDate;
import java.util.Date;


@Getter
@ToString
@EqualsAndHashCode

public class Promotion {


    private final String nom;
    private final String raison;
    private final LocalDate date;
    private double salaireMensuel;
    private float TJM;


    public Promotion(String nom, Date date, String raison, double salaireMensuel) {
        this.nom = nom;
        this.date = date;
        this.raison = raison;
        this.salaireMensuel = salaireMensuel;
    }


    public Promotion(String nom, Date date, String raison, float TJM) {
        this.nom = nom;
        this.date = date;
        this.raison = raison;
        this.TJM = TJM;
    }


}
