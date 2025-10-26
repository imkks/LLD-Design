package com.BookMyShow.Movie;


public class Movie {
    String title;
    String genre;
   public Movie(String title, String genre)
    {
        this.genre=genre;
        this.title=title;

    }
    @Override 
    public boolean equals(Object o)
    {
        if(o ==null || o.getClass() != getClass())
        return false;
        Movie m= (Movie) o;
        if(m.title.equals(title))
            return true;
        else 
            return false;
        
    }

    
}
