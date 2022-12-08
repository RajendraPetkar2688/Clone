package com.djamware

class Person {

    String name
    String email
    String address

    static constraints = {
        email email: true

    }
}
