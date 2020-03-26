//package ru.netology.domain;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//@ExtendWith(MockitoExtension.class)
//class AfishaManagerTest {
//    @Mock
//    private AfishaRepository repository;
//    @InjectMocks
//    private AfishaManager manager;
//
//    @Test
//    void addFilm() {
//        manager.addFilm(repository.film);
//        CinemaData[] expected = {new CinemaData(9, "For all Mankind", "serial")};
//        manager.setNeededQuantityOfFilmsToAdd(1);
//        CinemaData[] actual = manager.showAddedFilms();
//        assertArrayEquals(expected, actual);
//    }
//}