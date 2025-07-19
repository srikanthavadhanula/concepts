package com.lowleveldesign.concepts.lowleveldesign.designpatterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    /*
     * Making the constructor private
     * so that the external world cant create
     * object for the ThreadSafeSingleton class
     * */
    private ThreadSafeSingleton() {}

    /*
     * Since we are restricting the external world
     * to create instance of ThreadSafeSingleton class, we
     * need to provide a static method to access the instance
     * */

    /*
    * Since we made the getInstance method synchronized,
    * it will be thread safe
    * */

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
