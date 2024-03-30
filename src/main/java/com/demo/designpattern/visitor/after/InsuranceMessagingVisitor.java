package com.demo.designpattern.visitor.after;

import com.demo.designpattern.visitor.after.model.Bank;
import com.demo.designpattern.visitor.after.model.Company;
import com.demo.designpattern.visitor.after.model.Resident;
import com.demo.designpattern.visitor.after.model.Restaurant;

/**
 * Messaging function moved from pojo to this concrete visitor.
 */
public class InsuranceMessagingVisitor implements Visitor {
    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending email about thief insurance");
    }

    @Override
    public void visitCompany(Company company) {
        System.out.println("Sending email about employees insurance");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending email about medical insurance");
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending email about fire insurance");
    }
}
