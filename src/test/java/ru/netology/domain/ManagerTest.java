package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {

    private AfishaManager manager = new AfishaManager(new AfishaRepository());

    CinemaData film = new CinemaData(9, "For all Mankind", "serial");

    @Test
    void addFilm() {
        manager.addFilm(film);
        CinemaData[] expected = {new CinemaData(9, "For all Mankind", "serial")};
        manager.setNeededQuantityOfFilmsToAdd(1);
        CinemaData[] actual = manager.showAddedFilms();
        assertArrayEquals(expected, actual);
    }

}
