package com.weidai.example.designparttern.facade;

/**
 * Created by Administrator on 2020/1/15.
 */
public class HomeFacade {

    private DVDPlayer dvdPlayer;

    private Projector projector;

    private Screen screen;

    private Popcorn popcorn;

    public HomeFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.popcorn = Popcorn.getInstance();
    }
}
