package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        ElectionBoothServiceImpl service=new ElectionBoothServiceImpl();
        service.checkAge(age);
        service.checkLocality(locality);
        service.checkVoterId(vid);
        return true;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Your age is under 18");
        }
        return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"JP Nagar", "BTM", "Whitefield"};
        for (String local : localities) {
            if (local.equals(locality))
                return true;
        }
        throw new LocalityNotFoundException("Your locality is not present");
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIdException {
        if (voterId>9999 ||voterId < 1000) {
            throw new InvalidVoterIdException("Your voter ID is invalid");
        }
        return true;
    }
}
