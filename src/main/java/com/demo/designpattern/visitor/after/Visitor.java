package com.demo.designpattern.visitor.after;

import com.demo.designpattern.visitor.after.model.Bank;
import com.demo.designpattern.visitor.after.model.Company;
import com.demo.designpattern.visitor.after.model.Resident;
import com.demo.designpattern.visitor.after.model.Restaurant;

public interface Visitor {
    void visitBank(Bank bank);

    void visitCompany(Company company);

    void visitResident(Resident resident);

    void visitRestaurant(Restaurant restaurant);
}
