package hei.exam;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.List;


@Getter
@ToString
@EqualsAndHashCode(callSuper = false)


public class TravailleurPrestataire extends Travailleur {

    private final float nombreJour;
    private final List<Promotion> promotionsSalaire;
    private final List<Pointage> pointages;

    public float calculerTotalNombreJour() {
        return pointages
                .stream()
                .filter((pointage) -> pointage.getTypeTravail() != TypeTravail.ABS_NON_PAYÉE && pointage.getTypeTravail() != TypeTravail.ABS_PAYÉE)
                .toList()
                .size();
    }

    public float calculerSalaire(LocalDate startDate, LocalDate endDate) {
        return promotionsSalaire
                .stream()
                .filter(promotion -> promotion.getDate().isAfter(startDate) && promotion.getDate().isBefore(endDate))
                .map(promotion -> promotion.getTJM() * this.nombreJour)
                .reduce(0f, Float::sum);
    }

    public TravailleurPrestataire(int id, String nom, String prenom, String email, String num, float nombreJour, List<Promotion> promotionsSalaire, List<Pointage> pointages) {
        super(id, nom, prenom, email, num);
        this.nombreJour = nombreJour;
        this.promotionsSalaire = promotionsSalaire;
        this.pointages = pointages;
    }
}
