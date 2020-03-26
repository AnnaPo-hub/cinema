package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfishaManager {
    private AfishaRepository repo = new AfishaRepository();
    private int neededQuantityOfFilmsToAdd = 3;


    public AfishaManager(AfishaRepository repository) {
        this.repo = repository;
    }


    public void addFilm(CinemaData film) {
        repo.save(film);
    }

    public CinemaData[] showAddedFilms() {
        int c = 0;
        CinemaData[] listNew = new CinemaData[neededQuantityOfFilmsToAdd];
        CinemaData[] all = repo.findAll();
        for (int i = all.length - 1; i > all.length - (neededQuantityOfFilmsToAdd + 1) & i >= 0; i--) {

            listNew[c] = all[i];
            System.out.print(all[i]);
            c++;
        }
        return listNew;
    }

}




