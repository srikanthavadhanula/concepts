package com.lowleveldesign.concepts.lowleveldesign.designpatterns.factory;

public class Factory {

    public interface Profile{
        public abstract String recommendations();
    }

    public static class SrikanthProfile implements Profile {
        @Override
        public String recommendations() {
            return "Comedy";
        }
    }

    public static class LilyProfile implements Profile {
        @Override
        public String recommendations() {
            return "Thriller";
        }
    }

    /*
     * With every new profile, we just need to create a new Class
     * */
    public interface AccountOwner{
        public abstract Profile createProfile();
        public default String getRecommendations() {
            return createProfile().recommendations();
        }
    }

    public static class Srikanth implements AccountOwner{
        @Override
        public Profile createProfile() {
            return new SrikanthProfile();
        }
    }

    public static class Lily implements AccountOwner{
        @Override
        public Profile createProfile() {
            return new LilyProfile();
        }
    }

    public static void main(String[] args) {
        Factory.AccountOwner srikanth = new Srikanth();
        System.out.println("srikanth genres : "+srikanth.getRecommendations());

        Factory.AccountOwner lily = new Lily();
        System.out.println("lily genres : "+lily.getRecommendations());

    }
}
