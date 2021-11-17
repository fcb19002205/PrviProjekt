package six;

/**
 * Klasa može imati:
 * 1. polja ili atribute
 * 1.1. nestatička polja - movie1, movie2... instance ili varijable ili primjerke
 * 1.2. statička polja
 * 2. Konstruktor  ->
 * 3. Funckije ili metode
 * 3.1. instancne
 * 3.2. statičke
 * 4. Inner klasa
 */

public class Movie {
    public static int counter = 0;
    private String title;
    private String director;
    private int review;

    public Movie (){
        System.out.println("Konstruktor se pozvao...");
        counter++;

    }

    public Movie (String title) {
        this.title = title;
        System.out.println("Konstruktor sa jednim parametrom se pozvao");
        counter++;
    }


    public Movie (String title, String director, int review){
        this.title = title;
        this.director = director;
        this.review = review;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        if (review >=1 && review<=10 ) {
            this.review = review;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public static void print (){
        System.out.println("Counter: " + counter);
    }

}
