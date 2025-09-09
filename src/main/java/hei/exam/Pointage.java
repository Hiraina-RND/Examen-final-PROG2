package hei.exam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;
import java.util.Date;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor


public class Pointage {

    private final LocalDate date;
    private  final TypeTravail typeTravail;
    private final float quotaTemps;
    private final String description;

    public boolean verifierPointage(){

        if (this.getQuotaTemps() == 1) {
            return true;
        }
        return false;
    }
}
