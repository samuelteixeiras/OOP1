package weekOne;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class WeekOneExercisesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private static final String OSWALD_ALONE = "Oswald acted alone";
    private static final String FAVORITE_MOVIE = "matrix";
    private static final String MOVIE_RATE_VALUE = "5";
    private static final String MOVIE_RATE = "Move rating is: " + MOVIE_RATE_VALUE;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    private WeekOneExercises weekOneExercises;

    @Before
    public void setup() {
        weekOneExercises = new WeekOneExercises();
    }

    @Test
    public void itTestDidOswaldActAlone() {
        Assert.assertTrue(WeekOneExercises.didOswaldActAlone(true));
        Assert.assertFalse(WeekOneExercises.didOswaldActAlone(false));
    }

    @Test
    public void itTestWasOjGuilty() {
        Assert.assertTrue(weekOneExercises.wasOjGuilty(true));
        Assert.assertFalse(weekOneExercises.wasOjGuilty(false));
    }

    @Test
    public void itTestFavoriteFilm() {
        Assert.assertTrue(WeekOneExercises.favouriteFilm(FAVORITE_MOVIE).equals(FAVORITE_MOVIE));
    }

    @Test
    public void itTestFilmRating() {
        InputStream in = new ByteArrayInputStream(MOVIE_RATE_VALUE.getBytes());
        System.setIn(in);

        WeekOneExercises.main(null);
        Assert.assertTrue(outContent.toString().contains(MOVIE_RATE));
        Assert.assertTrue(outContent.toString().contains(OSWALD_ALONE));
    }
}
