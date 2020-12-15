package com.hz.states;

import com.hz.GumballMachine;

public class HasQuarterState extends State {
    public HasQuarterState (GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public String insertQuarter() {
        return "You can't insert another quarter";
    }

    @Override
    public String ejectQuarter() {
        gumballMachine.changeState(new NoQuarterState(gumballMachine));
        return "Quarter returned";
    }

    @Override
    public String turnCrank() {
        gumballMachine.changeState(new SoldState(gumballMachine));
        return "You turned...";
    }

    @Override
    public String dispense() {
        return "No gumball dispensed";
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
