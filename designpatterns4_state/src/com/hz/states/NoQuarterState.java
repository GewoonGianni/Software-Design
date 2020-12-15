package com.hz.states;

import com.hz.GumballMachine;

public class NoQuarterState extends State {
    public NoQuarterState (GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public String insertQuarter() {
        gumballMachine.changeState(new HasQuarterState(gumballMachine));
        return "You inserted a quarter";
    }

    @Override
    public String ejectQuarter() {
        return "You haven't inserted a quarter";
    }

    @Override
    public String turnCrank() {
        return "You turned but there's no quarter";
    }

    @Override
    public String dispense() {
        return "You need to pay first";
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
