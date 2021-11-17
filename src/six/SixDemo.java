package six;

/**
 * MOdifikatori vidljivosti
 * 1. public
 * 2. paketno privatni
 * 3. protected
 * 4. privatno vidljivu
 * "SixDemo" - auter klasa
 *
 * OUTER -> public, paketno privatna
 * Klasa može imati
 * 1. polja, properties, attributes ili member varijable klase
 */

public class SixDemo {
    public static void main(String[] args) {
        Movie.print();

        Movie movie1 = new Movie();
        movie1.setDirector ("Tarantino");
        movie1.setTitle ("Django");
        movie1.setReview (9);

        System.out.println(movie1.getDirector());
        Movie.print();//najispravnije

        int review1 = movie1.getReview();

        Movie movie2 = new Movie ();
        movie2.setDirector ("Steven Spielberg");
        movie2.setTitle ("E.T.");
        movie2.setReview(88);

        System.out.println(movie2.getDirector());
        System.out.println(movie2.counter);
        System.out.println(movie1.counter);

        Movie movie3 = new Movie ("Ničija zemlja");
        System.out.println(movie3.getTitle());
        System.out.println(movie1.counter);
        System.out.println(movie2.counter);


    }

}
