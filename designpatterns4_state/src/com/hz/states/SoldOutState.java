package com.hz.states;

import com.hz.GumballMachine;

public class SoldOutState extends State {
    public SoldOutState (GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public String insertQuarter() {
        return "You can't insert a quarter, the machine is sold out";
    }

    @Override
    public String ejectQuarter() {
        return "You can't eject, you haven't inserted a quarter yet";
    }

    @Override
    public String turnCrank() {
        return "You turned, but there are no gumballs";
    }

    @Override
    public String dispense() {
        return "No gumball dispensed";
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
