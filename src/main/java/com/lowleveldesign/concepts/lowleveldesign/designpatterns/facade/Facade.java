package com.lowleveldesign.concepts.lowleveldesign.designpatterns.facade;

public class Facade {

    static class Vegitables {
        public String getTomatos() {
            return "2kgs Tomatos";
        }

        public String getOnions() {
            return "2kgs onions";
        }
    }

    static class Groceries {
        public String getMilk() {
            return "2packets of milk";
        }

        public String getCookingOil() {
            return "5packets of oil";
        }
    }

    /*
    * FacadePlanner is a Facade class, which is responsible to know all the
    * sub systems and how to handle them
    *
    * In future if something comes up, FacadePlanner is the only place where
    * we need to make the changes
    *
    * Client needs to simply call the getItems it doesn't bother about any
    * other nuances of the systems
    * */

    static class FacadePlanner {
        Vegitables veg = new Vegitables();
        Groceries gro = new Groceries();

        public StringBuilder getItems() {
            StringBuilder response = new StringBuilder();
            response.append("List of Items\n");
            response.append(veg.getOnions()).append("\n");
            response.append(veg.getTomatos()).append("\n");
            response.append(gro.getMilk()).append("\n");
            response.append(gro.getCookingOil()).append("\n");
            return response;
        }
    }

    public static void main(String[] args) {
        FacadePlanner plan = new FacadePlanner();
        StringBuilder items = plan.getItems();
        System.out.println(items);
    }
}
