package com.sda.recap.accessmodifier.away;

import com.sda.recap.accessmodifier.home.Parent;

public class Neighbor {

    public void hasAccessTo() {
        Parent parent = new Parent();
        System.out.println(parent.phoneNo);
    }
}
