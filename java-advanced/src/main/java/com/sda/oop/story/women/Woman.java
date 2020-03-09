package com.sda.oop.story.women;

public abstract class Woman {

    protected Love love;
    protected FinancialSecurity financialSecurity;

    public Woman(Love love, FinancialSecurity financialSecurity) {
        this.love = love;
        this.financialSecurity = financialSecurity;
    }

    public abstract void feel();

    public abstract void dream();

    public abstract void relax();
}
