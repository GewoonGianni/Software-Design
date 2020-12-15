package com.hz.states;

import com.hz.GumballMachine;

public abstract class State {
    GumballMachine gumballMachine;

    /**
     * Super constructor for states
     * @param gumballMachine the gumball machine to perform on.
     */
    public State (GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public abstract String insertQuarter();
    public abstract String ejectQuarter();
    public abstract String turnCrank();
    public abstract String dispense();
    public abstract String toString();
}
