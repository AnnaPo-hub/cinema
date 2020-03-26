package ru.netology.domain;

public class AfishaRepository {

    private CinemaData[] list = {new CinemaData(1, "Onward", "cartoon"),
            new CinemaData(2, "Bladshort", "action"),
            new CinemaData(3, "Gentlemen", "action"),
            new CinemaData(4, "Invisible", "Thriller"),
            new CinemaData(5, "Troll's tour", "cartoon"),
            new CinemaData(7, "I BelieveInLove", "romance"),
            new CinemaData(8, "MyFriendMrPercivalle", "children")};

    CinemaData film = new CinemaData(9, "For all Mankind", "serial");

    CinemaData[] findAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }

    void save(CinemaData film) {
        int length = list.length + 1;
        CinemaData[] addedFilm = new CinemaData[length];
        for (int i = 0; i < list.length; i++) {
            addedFilm[i] = list[i];
        }
        int lastIndex = addedFilm.length - 1;
        addedFilm[lastIndex] = film;
        list = addedFilm;
    }

    CinemaData findByID(int id) {
        for (CinemaData item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


    void removeById(int id) {
        boolean b = false;
        for (CinemaData item : list) {
            if (item.getId() == id) {
                b = true;
                break;
            }
        }
        if (b) {
            int length = list.length - 1;
            CinemaData[] newArray = new CinemaData[length];
            int index = 0;
            for (CinemaData item : list) {
                if (item.getId() != id) {
                    newArray[index] = item;
                    index++;
                }
            }
            list = newArray;
        }
    }

    void removeAll() {
        list= new CinemaData[0];

        }
    }




