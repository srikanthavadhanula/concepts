package com.lowleveldesign.concepts.lowleveldesign.designpatterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    /*
    * Making the constructor private
    * so that the external world cant create
    * object for the LazySingleton class
    * */
    private LazySingleton() {}

    /*
    * Since we are restricting the external world
    * to create instance of LazySingleton class, we
    * need to provide a static method to access the instance
    * */

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
