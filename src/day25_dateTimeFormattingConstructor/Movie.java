package day25_dateTimeFormattingConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;


public class Movie {
    public String country, title, genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> cast ;

    public Movie(String country, String title, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        cast =  new ArrayList<>();
    }

    public void addCast(String name){//adds one name at a time
        cast.add(name);
    }
    public void addCast(String[] names){
        cast.addAll(Arrays.asList(names));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("MMM dd, YY")) +
                ", number of cast=" + cast.size() +
                '}';
    }

    /*public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("MMMM dd, YYYY")) +
                ", totalNumberOfCast=" + cast.size() +
                '}';
    }*/


  /*
     1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts
     */
}
