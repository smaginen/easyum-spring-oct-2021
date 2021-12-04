package com.easyum.spring.repository;


/**
 * @author Dinesh Rajput
 *
 */

public class AccountRepository implements IAccountRepository{
    private  int count;


    public void setCount(int count) {
        this.count = count;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
