package com.sda.oop.story.stefania;

import com.sda.oop.story.skills.Developer;
import com.sda.oop.story.women.FinancialSecurity;
import com.sda.oop.story.women.Love;
import com.sda.oop.story.women.Woman;

public class Stefania extends Woman implements Developer {

    public Stefania(Love love, FinancialSecurity financialSecurity) {
        super(love, financialSecurity);
    }

    @Override
    public void feel() {
        System.out.println("stefania feels");
    }

    @Override
    public void dream() {
        System.out.println("stefania dreams");
    }

    @Override
    public void relax() {
        System.out.println("stefania relaxes");
    }

    @Override
    public void writeCode() {

    }
}
