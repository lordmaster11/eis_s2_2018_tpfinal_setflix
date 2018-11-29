package dummies;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieRepositorio {
    private List<Serie> series = new ArrayList<>();

    public SerieRepositorio(){
        //0
        Serie serie1 = new Serie("Game of Thrones", "7", "", "Ciencia Ficcion","https://image.tmdb.org/t/p/w154/j17CGYDlysZjtSqJfbRKS6GmJKF.jpg");

        //1
        Serie serie2 = new Serie("Stranger Things", "2", "", "Ciencia Ficcion", "");

        //2
        Serie serie3 = new Serie("Breaking Bad", "5", "", "Drama", "");

        //3
        Serie serie4 = new Serie("The Last Kingdom", "2", "", "Ciencia Ficcion", "");

        //4
        Serie serie5 = new Serie("Vikings", "4", "", "Ciencia Ficcion", "");

        //5
        Serie serie6 = new Serie("Daredevil", "3", "", "Ciencia Ficcion", "");

        //6
        Serie serie7 = new Serie("The Defenders", "2", "", "Ciencia Ficcion", "");

        //7
        Serie serie8 = new Serie("Iron Fist", "2", "", "Ciencia Ficcion", "");

        //8
        Serie serie9 = new Serie("La Casa de Papel", "2", "", "Drama", "");

        //9
        Serie serie10 = new Serie("Black Mirrow", "4", "", "Ciencia Ficcion", "");

        //10
        Serie serie11 = new Serie("Merli", "3", "", "Drama", "");

        series.add(serie1);series.add(serie2);series.add(serie3);
        series.add(serie4);series.add(serie5);series.add(serie6);
        series.add(serie7);series.add(serie8);series.add(serie9);
        series.add(serie10);series.add(serie11);
    }

    public List<Serie> getSeries() { return series; }
}