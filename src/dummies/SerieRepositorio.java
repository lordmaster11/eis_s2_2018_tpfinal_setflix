package dummies;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieRepositorio {
    private List<Serie> series = new ArrayList<>();

    public SerieRepositorio(){
        //0
        Serie serie1 = new Serie("Game of Thrones", "7", "", "Ciencia Ficcion","https://upload.wikimedia.org/wikipedia/en/thumb/d/d1/Game_of_Thrones_Season_6.jpeg/220px-Game_of_Thrones_Season_6.jpeg");

        //1
        Serie serie2 = new Serie("Stranger Things", "2", "", "Ciencia Ficcion", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQul0L3SaYYmgcDc0mXSRFWcFItF05KzYkOZJCBbCJlzvxEFUKqig");

        //2
        Serie serie3 = new Serie("Breaking Bad", "5", "", "Drama", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7RXLeUjUnpFN_jZot9UXpTIrQHJXmpCyEfJhIQs0vHC7RZbA");

        //3
        Serie serie4 = new Serie("The Last Kingdom", "2", "", "Ciencia Ficcion", "https://images-na.ssl-images-amazon.com/images/I/51n-caRr%2BoL._SY445_.jpg");

        //4
        Serie serie5 = new Serie("Vikings", "4", "", "Ciencia Ficcion", "http://s.sidereel.com/tv_shows/53934/giant_2x/Vikings-Season3-ShowcardVertical3x4.jpg");

        //5
        Serie serie6 = new Serie("Daredevil", "3", "", "Ciencia Ficcion", "https://images-na.ssl-images-amazon.com/images/I/814yhr5aYmL._SX342_.jpg");

        //6
        Serie serie7 = new Serie("The Defenders", "2", "", "Ciencia Ficcion", "https://m.media-amazon.com/images/M/MV5BNWU4NmY3MTMtMTBmMi00NjFjLTkwMmItYWZhZWUwNDg5M2ExXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_UX182_CR0,0,182,268_AL_.jpg");

        //7
        Serie serie8 = new Serie("Iron Fist", "2", "", "Ciencia Ficcion", "https://vignette.wikia.nocookie.net/doblaje/images/c/c8/Iron_Fist.jpg/revision/latest?cb=20170222212332&path-prefix=es");

        //8
        Serie serie9 = new Serie("La Casa de Papel", "2", "", "Drama", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4T3CHJfl-KM0PstSu9bBgHX-WkcZ9LfCcoGg1hkv7U5akrAGa");

        //9
        Serie serie10 = new Serie("Black Mirrow", "4", "", "Ciencia Ficcion", "https://m.media-amazon.com/images/M/MV5BNTEwYzNiMGUtNzRlYS00MTMzLTliNzgtOGUxZGZiNThlNWYwXkEyXkFqcGdeQXVyMjYwNDA2MDE@._V1_.jpg");

        //10
        Serie serie11 = new Serie("Merli", "3", "", "Drama", "https://img.travessa.com.br/livro/BA/78/78f94501-6e06-41c7-ab29-798ce34e5633.jpg");

        series.add(serie1);series.add(serie2);series.add(serie3);
        series.add(serie4);series.add(serie5);series.add(serie6);
        series.add(serie7);series.add(serie8);series.add(serie9);
        series.add(serie10);series.add(serie11);
    }

    public List<Serie> getSeries() { return series; }
}