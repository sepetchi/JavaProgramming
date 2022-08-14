package day32_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class CountriesObjects {
    public static void main(String[] args) {
        countries country1 = new countries("United states");
        countries country2 = new countries("Canada", 1643);
        countries country3= new countries("Netherland", true,"Europe");
        countries country4 = new countries("Italy", 5000000,700, true);
        countries country5 = new countries("Sweeden",1035000,500,true,"Europe");

        ArrayList<countries> listOfCountry = new ArrayList<>();
        listOfCountry.addAll(Arrays.asList(country1,country2,country3,country4,country5));
        listOfCountry.forEach(p-> System.out.println(p.isDemocratic == true ? p.countryName : ""));

        System.out.println("-----------------------------------------------------");

        for (countries each : listOfCountry) {
            if (each.isDemocratic == true){

                System.out.println(each.countryName);
            }


        }


        }
    static {
        System.out.println("Features of Countries");

        }
    }







