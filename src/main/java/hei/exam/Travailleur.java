package hei.exam;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;



@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class Travailleur {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String email;
    private final String num;
}
