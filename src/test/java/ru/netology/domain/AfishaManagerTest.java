package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository  list;
    @InjectMocks
    private AfishaManager manager;
    CinemaData firstForTest = new CinemaData(11, "Troll", "children");
    CinemaData secondForTest = new CinemaData(12, "Troll2", "children");
    CinemaData thirdForTest = new CinemaData(13, "Troll3", "children");

    @Test
    void shouldShowAddedFilms() {
        CinemaData[] returned = new CinemaData[]{firstForTest, secondForTest};
        doReturn(returned).when(list).findAll();
        doNothing().when(list).save(thirdForTest);
        manager.addFilm(thirdForTest);
        manager.setNeededQuantityOfFilmsToAdd(2);
        CinemaData[] expected = new CinemaData[]{secondForTest, firstForTest};
        CinemaData[] actual = manager.showAddedFilms();
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldShowAll() {
        CinemaData[] returned = new CinemaData[]{firstForTest, secondForTest};
        doReturn(returned).when(list).findAll();
//        doNothing().when(list).save(thirdForTest);
        CinemaData[] expected = new CinemaData[]{firstForTest, secondForTest};
        CinemaData[] actual = manager.showAll();
        assertArrayEquals(expected, actual);
    }
}
