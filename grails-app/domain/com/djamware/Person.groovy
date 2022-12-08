package com.djamware

class Person {

    String name
    String email
    String address
    Date created = new Date()
    static constraints = {
        email email: true
      

    }
}
