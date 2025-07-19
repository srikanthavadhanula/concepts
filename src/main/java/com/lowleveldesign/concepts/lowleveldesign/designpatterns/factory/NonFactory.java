package com.lowleveldesign.concepts.lowleveldesign.designpatterns.factory;

public class NonFactory {

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
    * With every new profile, we need to update the getRecommendations method
    * This will disobey open closed principle
    * */

    public static class Account {
        public String getRecommendations(String profile) {
            if(profile == "Srikanth") {
                SrikanthProfile sp = new SrikanthProfile();
                return sp.recommendations();
            }
            if(profile == "Lily") {
                LilyProfile lp = new LilyProfile();
                return lp.recommendations();
            }
            return "No Recommendations";
        }
    }

    public static void main(String[] args) {
        NonFactory.Account nfa = new Account();
        String lilyGenres = nfa.getRecommendations("Lily");
        System.out.println("Lily genres : "+lilyGenres);
        String srikanthGenres = nfa.getRecommendations("Srikanth");
        System.out.println("Srikanth genres : "+srikanthGenres);
    }

}
