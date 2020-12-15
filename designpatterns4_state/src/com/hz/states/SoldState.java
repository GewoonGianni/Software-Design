package com.hz.states;

import com.hz.GumballMachine;

public class SoldState extends State {
    public SoldState (GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public String insertQuarter() {
        return "Please wait, we're already giving you a gumball";
    }

    @Override
    public String ejectQuarter() {
        return "Sorry, you already turned the crank";
    }

    @Override
    public String turnCrank() {
        return "Turning twice doesn't get you another gumball!";
    }

    @Override
    public String dispense() {
        gumballMachine.setCount(gumballMachine.getCount() - 1);
        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.changeState(new SoldOutState(gumballMachine));
        } else {
            gumballMachine.changeState(new NoQuarterState(gumballMachine));
        }
        return "A gumball comes rolling out the slot";
    }

    @Override
    public String toString() {
        return "delivering a gumball";
    }
}
