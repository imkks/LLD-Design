package com.BookMyShow.Theatre;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.BookMyShow.Show;



public class Screen {
    public int no;
    public List<Seat> seats;
    public List<Show>shows;
    public Screen(int no, int sts)
    {
        this.no=no;
        seats= new ArrayList<>(sts);
        shows = new LinkedList<>();
        for(int i=0;i<sts;i++)
        {
            seats.add(new Seat(i));
        }

    }
    void addShows(Show s)
    {
        shows.add(s);
    }

    
}
