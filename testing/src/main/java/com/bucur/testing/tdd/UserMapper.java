package com.bucur.testing.tdd;

public class UserMapper {

    public UserDetails convert(User user) {
        // copy all fields from user to an object user details
        UserDetails userDetails = new UserDetails(user.name, user.email);
        //userDetails.name = user.name;
        //userDetails.email = user.email;

        return userDetails;
    }
}
