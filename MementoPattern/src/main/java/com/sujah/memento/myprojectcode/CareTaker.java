package com.sujah.memento.myprojectcode;

import java.util.Stack;

public class CareTaker {

    Stack<Dashboard.DashboardMemento> history = new Stack<Dashboard.DashboardMemento>();

    public void save(Dashboard dashboard){
        history.push(dashboard.save());
    }

    public void revert(Dashboard dashboard){
        if (!history.isEmpty()){
            dashboard.revert(history.pop());
        }
        else {
            System.out.println("Cannot Undo");
        }
    }

}
