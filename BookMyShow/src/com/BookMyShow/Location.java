package com.BookMyShow;

import java.util.ArrayList;
import java.util.List;

import com.BookMyShow.Theatre.Theatre;




public class Location {
    String name;
    List<Theatre> theatres;
    Location(String name)
    {
        this.name=name;
        theatres= new ArrayList<>();

    }
    public void addTheatre(Theatre th)
    {
        theatres.add(th);
    }
    
}
