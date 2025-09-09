package hei.exam;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PointageTest {

    @Test
    public void pointageTest() {
        Pointage pointage = new Pointage(LocalDate.of(2025, 06, 01), TypeTravail.COMMUNICATION, 1, "je ne trouve pas quoi mettre");
        assertTrue(pointage.verifierPointage());
    }
}
