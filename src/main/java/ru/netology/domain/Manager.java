package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Manager {
    private int neededQuantityOfFilmsToAdd = 3;

    CinemaData[] list = {new CinemaData(1, "Onward", "cartoon"),
            new CinemaData(2, "Bladshort", "action"),
            new CinemaData(3, "Gentlemen", "action"),
            new CinemaData(4, "Invisible", "Thriller"),
            new CinemaData(5, "Troll's tour", "cartoon"),
            new CinemaData(7, "I BelieveInLove", "romance"),
            new CinemaData(8, "MyFriendMrPercivalle", "children")};

    CinemaData film = new CinemaData(9, "For all Mankind", "serial");


    public void addFilm(CinemaData film) {
        int length = list.length + 1;
        CinemaData[] addedFilm = new CinemaData[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = film;
        list = addedFilm;
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(i);
    }


    public void showAddedFilms() {
        for (int i = list.length - 1; i > list.length - (neededQuantityOfFilmsToAdd + 1) & i >= 0; i--) {
            System.out.print(list[i]);
        }
    }

}




