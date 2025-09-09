package hei.exam;


import java.util.List;

public class TravailleurSalarie extends Travailleur{

    private final List<Promotion> promotionsSalaire;

    public TravailleurSalarie(int id, String nom, String prenom, String email, String num, List<Promotion> promotionsSalaire) {
        super(id, nom, prenom, email, num);
        this.promotionsSalaire = promotionsSalaire;
    }
}
