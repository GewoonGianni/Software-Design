package com.hz;

import com.hz.states.HasQuarterState;
import com.hz.states.NoQuarterState;
import com.hz.states.State;

public class GumballMachine {

    private State state;

    public State getState() {
        return state;
    }

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = new NoQuarterState(this);
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        System.out.println(state.insertQuarter());
    }

    public void ejectQuarter() {
        System.out.println(state.ejectQuarter());
    }

    public void turnCrank() {
        if (this.getState() == new HasQuarterState(this)){
            System.out.println(state.turnCrank());
            this.dispense();
        } else {
            System.out.println(state.turnCrank());
        }
    }

    private void dispense() {
        System.out.println(state.dispense());
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        this.state = new NoQuarterState(this);
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #69420\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        result.append(state.toString());
        result.append("\n");
        return result.toString();
    }
}
