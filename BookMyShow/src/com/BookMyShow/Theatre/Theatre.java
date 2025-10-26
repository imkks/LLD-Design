package com.BookMyShow.Theatre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Theatre {
    UUID id;
    String name;
    List<Screen> sc;
   public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Screen> getSc() {
        return sc;
    }
    public void setSc(List<Screen> sc) {
        this.sc = sc;
    }
   public Theatre(String name, int n)
    {
        this.name=name;
        this.id= UUID.randomUUID();
        sc=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            sc.add(new Screen(i,10));
        }
    }
    
    
}
