package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService{

    @Override
    public boolean validatePassword(String password) throws TooLongException, TooShortException {
        if(password.length()<=6)
            throw new TooShortException("Password is too Short");
        if(password.length()>15)
            throw new TooShortException("Password is too Long");
        return true;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames={"Kushal","Manju","Basava"};
        for (String name:usernames) {
            if(name.equals(username))
                throw new NameExistsException("Name Already exists");
        }
        return true;
    }
}
