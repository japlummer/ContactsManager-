package com.novauc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JacobP on 2/16/17.
 */
public class CharacterTest {
    @Test
    public void testBattle() throws Exception {

        Player player = new Player();
        player.name = "Test Player";

        Enemy enemy = new Enemy("Test Enemy",5, 5);

        player.battle(enemy);


    }

}