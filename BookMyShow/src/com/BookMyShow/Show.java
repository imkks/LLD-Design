package com.BookMyShow;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.BookMyShow.Movie.Movie;
import com.BookMyShow.Theatre.Screen;



public class Show {
    
    LocalDateTime startTime;
    LocalDateTime endTime;
    Movie movie;
    Screen screen;
    List<Integer> bookedSeatIds;
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Screen getScreen() {
        return screen;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    public Show(Movie movie, Screen s, LocalDateTime startTime, LocalDateTime endTime)
    {
        this.movie=movie;
        this.screen=s;
        this.startTime=startTime;
        this.endTime=endTime;
        this.bookedSeatIds= new ArrayList<>();
    }

}
