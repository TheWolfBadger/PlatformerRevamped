package com.jaredscarito.platformerrevamped.timers;

import com.jaredscarito.platformerrevamped.characters.GameCharacter;

import java.util.TimerTask;

/**
 * Created by user on 12/6/2017.
 */
public class GravityTimer extends TimerTask {
    /**
     * The action to be performed by this timer task.
     */
    private GameCharacter gCharacter;
    public GravityTimer(GameCharacter character) {
        this.gCharacter = character;
    }
    @Override
    public void run() {
        //
    }
}
