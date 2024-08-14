package com.demo.designpattern.visitor.after;

import com.demo.designpattern.visitor.after.model.Bank;
import com.demo.designpattern.visitor.after.model.Company;
import com.demo.designpattern.visitor.after.model.Resident;
import com.demo.designpattern.visitor.after.model.Restaurant;

public interface Visitor {
    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);
}
