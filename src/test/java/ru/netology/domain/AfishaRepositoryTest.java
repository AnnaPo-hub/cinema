package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaRepositoryTest {

    AfishaRepository repo = new AfishaRepository();

    @Test
    void findAll() {
        CinemaData[] expected = {new CinemaData(1, "Onward", "cartoon"),
                new CinemaData(2, "Bladshort", "action"),
                new CinemaData(3, "Gentlemen", "action"),
                new CinemaData(4, "Invisible", "Thriller"),
                new CinemaData(5, "Troll's tour", "cartoon"),
                new CinemaData(7, "I BelieveInLove", "romance"),
                new CinemaData(8, "MyFriendMrPercivalle", "children")};

        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void save() {
        repo.save(repo.film);
        CinemaData[] expected = {new CinemaData(1, "Onward", "cartoon"),
                new CinemaData(2, "Bladshort", "action"),
                new CinemaData(3, "Gentlemen", "action"),
                new CinemaData(4, "Invisible", "Thriller"),
                new CinemaData(5, "Troll's tour", "cartoon"),
                new CinemaData(7, "I BelieveInLove", "romance"),
                new CinemaData(8, "MyFriendMrPercivalle", "children"),
                new CinemaData(9, "For all Mankind", "serial")};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);


    }

    @Test
    void findByID() {
        CinemaData expected = new CinemaData(3, "Gentlemen", "action");
        CinemaData actual = repo.findByID(3);
        assertEquals(expected, actual);


    }

    @Test
    void removeById() {
        repo.removeById(4);
        CinemaData[] expected = {new CinemaData(1, "Onward", "cartoon"),
                new CinemaData(2, "Bladshort", "action"),
                new CinemaData(3, "Gentlemen", "action"),
                new CinemaData(5, "Troll's tour", "cartoon"),
                new CinemaData(7, "I BelieveInLove", "romance"),
                new CinemaData(8, "MyFriendMrPercivalle", "children")};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAll() {
        repo.removeAll();
        CinemaData[] expected = {};
        CinemaData[] actual = repo.findAll();
        assertArrayEquals(expected, actual);

    }
}