package com.sda.enums;

public enum Role {

    FIGHTER("sword ready"),
    ARCHER("arrows ready"),
    ASSASSIN("poison ready");

    private String description;

    Role(String description) {
        this.description = description;
    }

    // print all elements in enum
    public void printEnum() {
        // for (type element : collection )
        for (Role role : Role.values()) {       // get values of enum
            System.out.println(role.name()); // FIGHTER
            System.out.println(role.getDescription()); // sword ready
        }
    }

    public String getDescription() {
        return description;
    }
}
