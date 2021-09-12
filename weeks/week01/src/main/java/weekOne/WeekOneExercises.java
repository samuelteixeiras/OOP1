package weekOne;

import java.util.Scanner;


public class WeekOneExercises {

    static Scanner scanner;

    public final static void main(String args[]) {
        Boolean didOswaldActAlone = didOswaldActAlone(true);
        if (didOswaldActAlone) {
            System.out.println("Oswald acted alone");
        } else {
            System.out.println("Oswald did not acted alone");
        }

        String favouriteFilmReturned = favouriteFilm("matrix");
        System.out.println("Move rating is: " + filmRating(favouriteFilmReturned));

    }

    public static boolean didOswaldActAlone(boolean response) {
        return response;
    }

    public boolean wasOjGuilty(boolean response) {
        return response;
    }

    public static String favouriteFilm(String movie) {
        return movie;
    }


    public static String filmRating(String movie) {
        scanner = new Scanner(System.in);
        System.out.println("Please enter the rating for movie : " + movie);

        String movieRate = scanner.nextLine();
        return movieRate;
    }
}
