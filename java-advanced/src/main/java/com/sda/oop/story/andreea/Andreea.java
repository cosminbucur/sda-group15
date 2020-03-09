package com.sda.oop.story.andreea;

import com.sda.oop.story.skills.Developer;
import com.sda.oop.story.skills.Polyglot;
import com.sda.oop.story.women.FinancialSecurity;
import com.sda.oop.story.women.Love;
import com.sda.oop.story.women.Woman;

public class Andreea extends Woman implements Polyglot, Developer {

    private Pony pony;

    // composition
    public Andreea(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
    }

    @Override
    public void feel() {
        System.out.println("andreea feels");
    }

    @Override
    public void dream() {
        System.out.println("andreea dreams");
    }

    @Override
    public void relax() {
        System.out.println("andreea relaxes");
    }

    public void haveFun() {
        System.out.println("having fun");
    }

    public void getTanned() {
        System.out.println("tanning");
    }

    public void getNailsDone() {
        System.out.println("getting nails done");
    }

    @Override
    public void speakEnglish() {
        System.out.println("hello");
    }

    @Override
    public void speakSpanish() {
        System.out.println("ola");
    }

    @Override
    public void writeCode() {
        System.out.println("andreea to the rescue");
    }

    // aggregation
    public void pleaseGiveMeAPony(Pony pony) {
        if (pony == null) {
            System.out.println("hey, you promised!");
        } else {
            this.pony = pony;
            String ponyName = pony.getName();
            System.out.println("hello " + ponyName);
            System.out.println("yey, now I can die happy!");
        }
    }

    public void feedPony() {
        System.out.println("here you go mr " + this.pony.getName());
        this.pony.eat();
    }
}
