package com.BookMyShow;
import java.util.LinkedList;
import java.util.List;

import com.BookMyShow.Movie.Movie;
import com.BookMyShow.Theatre.Screen;
import com.BookMyShow.Theatre.Seat;
import com.BookMyShow.Theatre.Theatre;





public class BookingService {
    List<Location> location;
    List<Movie>movies;

    BookingService()
    {
        location=new LinkedList<>();
        movies =new LinkedList<>();

    }
    public void addLocation(Location l)
    {
        this.location.add(l);
    }
    public void addMovies(Movie m)
    {
        this.movies.add(m);
    }
    public List<Location> getLocations()
    {
        return this.location;
    }
    public List<Movie> getMoviesByLocation(Location l)
    {
        List<Movie> mv=new LinkedList<>();
        for(Theatre t:l.theatres)
        {
            for(Screen sc:t.getSc())
            {
                for(Show s:sc.shows)
                {
                    mv.add(s.movie);
                }
            }
        }
        return mv;
    }
    public List<Show> getShowsByLocationAndMovie(Location l, Movie m)
    {
        List<Show> s= new LinkedList<>();
        for(Theatre t: l.theatres)
        {
            for(Screen sc:t.getSc())
            {
                for(Show sh:sc.shows)
                {
                    if(sh.getMovie().equals(m))
                    {
                        s.add(sh);
                    }
                }
            }
        }
        return s;
    }
    public List<Seat> getShowMapping(Show s)
    {
        return null;
    }

    
}
