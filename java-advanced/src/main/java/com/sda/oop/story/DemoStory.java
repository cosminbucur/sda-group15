package com.sda.oop.story;

import com.sda.oop.story.andreea.Andreea;
import com.sda.oop.story.andreea.Pony;
import com.sda.oop.story.stefania.Stefania;
import com.sda.oop.story.women.FinancialSecurity;
import com.sda.oop.story.women.Love;

public class DemoStory {

    public static void main(String[] args) {
        Love love = new Love();
        FinancialSecurity financialSecurity = new FinancialSecurity();

        andreeaStory(love, financialSecurity);

        stefaniaStory(love, financialSecurity);

        andreeaStory(new Love(), new FinancialSecurity());
    }

    private static void andreeaStory(Love love, FinancialSecurity financialSecurity) {
        // create andreea
        Andreea andreea = new Andreea(love, financialSecurity);

        // give her a mock pony
        Pony mockPony = null;
        andreea.pleaseGiveMeAPony(mockPony);

        // give her a real pony
        Pony realPony = new Pony("buttercup");
        andreea.pleaseGiveMeAPony(realPony);
        andreea.feedPony();
        realPony.sleep();

        // use all skills
        andreea.feel();
        andreea.dream();
        andreea.relax();

        andreea.haveFun();
        andreea.getTanned();
        andreea.getNailsDone();

        andreea.speakEnglish();
        andreea.speakSpanish();

        andreea.writeCode();
    }

    // method for stefania's story
    public static void stefaniaStory(Love love, FinancialSecurity financialSecurity) {
        Stefania stefania = new Stefania(love, financialSecurity);
        stefania.dream();
        stefania.feel();
        stefania.relax();

        stefania.writeCode();
    }


    // define method
    private static void hello(String name) {
        System.out.println("hello " + name);
    }
}
