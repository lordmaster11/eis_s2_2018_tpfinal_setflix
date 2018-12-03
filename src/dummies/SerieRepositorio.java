package dummies;

import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieRepositorio {
    private List<Serie> series = new ArrayList<>();

    public SerieRepositorio(){
        //0
        Serie serie1 = new Serie("Game of Thrones", "7", "Cuando el Rey Robert Baratheon (Mark Addy) le pide a su viejo amigo Ned Stark (Sean Bean) que realice la función de nuevo consejero real (cargo conocido como la Mano del Rey). La esposa de Ned, Catelyn (Michelle Fairley) recibe una carta de su hermana, Lysa (Kate Dickie) que le da razones para creer que la Casa Lannister, a la cual pertenece Cercei, la esposa del rey, está involucrada en la muerte de la anterior Mano del Rey. Ned debe viajar al Sur con el Rey para descubrir el asesino de la Mano del Rey muerto, Jon Arryn (John Standing) y a la misma vez proteger a su familia de los Lannister. Mientras descubre las razones detrás de la muerte de Jon, desentierra el oscuro secreto concerniente a los Lannister que el propio Arryn murió tratando de revelar. "
        		, "Ciencia Ficcion","https://upload.wikimedia.org/wikipedia/en/thumb/d/d1/Game_of_Thrones_Season_6.jpeg/220px-Game_of_Thrones_Season_6.jpeg", "https://www.youtube.com/watch?v=f-rlcVEH-Y4");

        //1
        Serie serie2 = new Serie("Stranger Things", "2", "Stranger Things es una serie web estadounidense de ciencia ficción coproducida y distribuida por Netflix.3​ Escrita y dirigida por los hermanos Matt y Ross Duffer y producida ejecutivamente por Shawn Levy,4​ fue estrenada en la plataforma Netflix el 15 de julio de 2016, con críticas positivas por parte de la prensa especializada, quienes elogiaron la interpretación, caracterización, ritmo, atmósfera y el claro homenaje al Hollywood de los años 80, con referencias a películas de Steven Spielberg,5​ Wes Craven,6​ John Carpenter,7​ Stephen King,8​ Rob Reiner9​ y George Lucas, entre otros, incluyendo varias películas, anime y videojuegos.10​ La historia se sitúa en el ficticio condado de Hawkins, en Indiana, Estados Unidos, durante los años 80, cuando un niño de doce años llamado Will Byers desaparece misteriosamente.", "Ciencia Ficcion"
        		, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQul0L3SaYYmgcDc0mXSRFWcFItF05KzYkOZJCBbCJlzvxEFUKqig", "https://www.youtube.com/watch?v=2RKHhfls0Fo");

        //2
        Serie serie3 = new Serie("Breaking Bad", "5", "Walter White (Bryan Cranston) es un frustrado profesor de química en un instituto, padre de un joven discapacitado y con una mujer (Anna Gunn) embarazada. Walt, además, trabaja en un lavadero de coches por las tardes. Cuando le diagnostican un cáncer pulmonar terminal se plantea qué pasará con su familia cuando él muera. En una redada de la DEA, a la cual fue invitado por el agente Hank Schrader, su cuñado (Dean Norris), reconoce a un antiguo alumno suyo, Jesse Pinkman (Aaron Paul), a quien contacta para fabricar y vender metanfetamina y así asegurar el bienestar económico de su familia.", "Drama", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7RXLeUjUnpFN_jZot9UXpTIrQHJXmpCyEfJhIQs0vHC7RZbA", "https://www.youtube.com/watch?v=rJnjxvgvkBM");

        //3
        Serie serie4 = new Serie("The Last Kingdom", "2", "Es el año 872 y muchos de los reinos separados de lo que ahora se conoce como Inglaterra han caído en manos de los invasores daneses, dejando al gran reino de Wessex solo y bajo el mando del rey Alfredo el Grande. Durante este tiempo, el Lord Uhtred, un noble sajón, es asesinado por los daneses y su hijo Uhtred de Bebbanburg, es capturado y criado como un danés. Pronto se ve obligado a elegir entre el país de su nacimiento y la gente que lo crio, por lo que su lealtad será probada. ", "Ciencia Ficcion", "https://images-na.ssl-images-amazon.com/images/I/51n-caRr%2BoL._SY445_.jpg", "https://www.youtube.com/watch?v=T0AMNd95P-k");

        //4
        Serie serie5 = new Serie("Vikings", "4", "Vikings es una serie que está basada en las leyendas sobre el vikingo Ragnar Lodbrok, (Travis Fimmel) uno de los héroes más famosos de la cultura nórdica que saqueó Northumbria, Francia y Bretaña. La serie retrata a Lodbrok como un guerrero curioso y navegante, tecnológicamente innovador, ambicioso y rebelde, que hace construir un barco a su amigo Floki, para lanzarse a explorar los territorios al oeste de Escandinavia desobedeciendo al jefe tribal, el Jarl (Conde) Haraldson, que ordena viajar hacia el este (orientación cardinal en la que se especulaba con gran riqueza en aquella época). ", "Ciencia Ficcion", "http://s.sidereel.com/tv_shows/53934/giant_2x/Vikings-Season3-ShowcardVertical3x4.jpg", "https://www.youtube.com/watch?v=FLurEJN5KcY");

        //5
        Serie serie6 = new Serie("Daredevil", "3", "Daredevil, alias de Matthew Michael \"Matt\" Murdock, es un personaje ficticio de la editorial Marvel Comics, creado por Stan Lee y Bill Everett, el cual tuvo su primera aparición en el comic-book Daredevil #1, publicado en 1964. El nombre del personaje significa temerario en español, pero en España Vértice lo publicó como Dan Defensor para justificar las dos \"D\" sobre su pecho, mientras que en algunos países de Hispanoamérica recibió el nombre de Diabólico. Hoy en día se publica con su nombre original en inglés, Daredevil. Tanto antes como ahora se le añade el sobrenombre de \"El hombre sin miedo\".\n" + 
        		"\n" + 
        		"", "Ciencia Ficcion", "https://images-na.ssl-images-amazon.com/images/I/814yhr5aYmL._SX342_.jpg", "https://www.youtube.com/watch?v=-ZBr68fIvsY");

        //6
        Serie serie7 = new Serie("The Defenders", "2", "The Defenders es una serie de televisión de CBS de comedia dramática legal del 2010.1​2​ La serie de una hora se estrenó el 22 de septiembre de 2010, y actualmente se transmite los viernes a las 8:00 p.m hora del este y 7:00 p.m. central.3​ Es un remake de la serie original de 1961 que se estrenó en CBS. El programa es protagonizado por abogados defensores, con Jim Belushi y Jerry O'Connell. ", "Ciencia Ficcion", "https://m.media-amazon.com/images/M/MV5BNWU4NmY3MTMtMTBmMi00NjFjLTkwMmItYWZhZWUwNDg5M2ExXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_UX182_CR0,0,182,268_AL_.jpg", "https://www.youtube.com/watch?v=jziPMN_ufnU");

        //7
        Serie serie8 = new Serie("Iron Fist", "2", "Daniel Rand nació en la ciudad de Nueva York. Su padre, Wendell Rand, cuando era un niño pasó por la mística ciudad de K'un-L'un. Durante su tiempo en K'un L'un, Wendell salvó la vida del gobernante de la ciudad, Lord Tuan, y fue adoptado como el hijo de Tuan. Sin embargo, Wendell eventualmente dejó K'un L'un y se convirtió en un rico empresario en los Estados Unidos. Se casó con la mujer de la alta sociedad Heather Duncan y tuvo un hijo: Daniel. ", "Ciencia Ficcion", "https://vignette.wikia.nocookie.net/doblaje/images/c/c8/Iron_Fist.jpg/revision/latest?cb=20170222212332&path-prefix=es", "https://www.youtube.com/watch?v=a4yY4vLg0Gc");

        //8
        Serie serie9 = new Serie("La Casa de Papel", "2", "La casa de papel es una serie de televisión española creada por Álex Pina y producida por Atresmedia en colaboración con Vancouver Media para su emisión en Antena 3. Protagonizada por Úrsula Corberó, Itziar Ituño y Álvaro Morte, entre otros, se presentó en el III Festival de Televisión de Primavera en Burgos en marzo de 2017.1​ ", "Drama", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4T3CHJfl-KM0PstSu9bBgHX-WkcZ9LfCcoGg1hkv7U5akrAGa", "https://www.youtube.com/watch?v=nJ0Jik9Tokk");

        //9
        Serie serie10 = new Serie("Black Mirrow", "4", "Black Mirror es una serie de televisión británica creada por Charlie Brooker y producida por Zeppotron para Endemol. La serie gira en torno a cómo la tecnología afecta nuestras vidas, en ocasiones sacando lo peor de nosotros; Brooker ha señalado que «cada episodio tiene un tono diferente, un entorno diferente, incluso una realidad diferente, pero todos son acerca de la forma en que vivimos ahora y la forma en que podríamos estar viviendo en 10 minutos si somos torpes", "Ciencia Ficcion", "https://m.media-amazon.com/images/M/MV5BNTEwYzNiMGUtNzRlYS00MTMzLTliNzgtOGUxZGZiNThlNWYwXkEyXkFqcGdeQXVyMjYwNDA2MDE@._V1_.jpg", "https://www.youtube.com/watch?v=kV75RhPgfAI");

        //10
        Serie serie11 = new Serie("Merli", "3", "Merlí es una serie española creada y producida por la productora Veranda TV (Grupo Godó y Boomerang TV), y emitida por la cadena catalana TV3 entre el 14 de septiembre del 2015 y el 15 de enero del 2018. La serie trata sobre un profesor de filosofía del mismo nombre, que estimula a sus alumnos a pensar libremente mediante unos métodos poco ortodoxos, que dividirán las opiniones de la clase, el profesorado y las familias.", "Drama", "https://img.travessa.com.br/livro/BA/78/78f94501-6e06-41c7-ab29-798ce34e5633.jpg", "https://www.youtube.com/watch?v=-ePPB8X5jEI");

        series.add(serie1);series.add(serie2);series.add(serie3);
        series.add(serie4);series.add(serie5);series.add(serie6);
        series.add(serie7);series.add(serie8);series.add(serie9);
        series.add(serie10);series.add(serie11);
    }

    public List<Serie> getSeries() { return series; }
}