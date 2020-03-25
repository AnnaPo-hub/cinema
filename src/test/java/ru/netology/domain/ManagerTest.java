package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {

    Manager manager = new Manager();
    CinemaData film = new CinemaData(9, "For all Mankind", "serial");

    @Test
    void addFilm() {

        CinemaData[] actual = manager.addFilm(film);
        CinemaData[] expected = {new CinemaData(1, "Onward", "cartoon"),
                new CinemaData(2, "Bladshort", "action"),
                new CinemaData(3, "Gentlemen", "action"),
                new CinemaData(4, "Invisible", "Thriller"),
                new CinemaData(5, "Troll's tour", "cartoon"),
                new CinemaData(7, "I BelieveInLove", "romance"),
                new CinemaData(8, "MyFriendMrPercivalle", "children"),
                new CinemaData(9, "For all Mankind", "serial")};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showAddedFilms() {
        manager.addFilm(film);
        CinemaData[] actual = manager.showAddedFilms();
        CinemaData[] expected = {new CinemaData(7, "I BelieveInLove", "romance"),
                new CinemaData(8, "MyFriendMrPercivalle", "children"),
                new CinemaData(9, "For all Mankind", "serial")};
    }
}