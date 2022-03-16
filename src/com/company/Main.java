package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(android(35, 20));
        System.out.println(android(28, 10));
        System.out.println(android(16, -8));
        System.out.println(android(16, 30));
        System.out.println(android(40, 4));

    }

    public static String android(int ageHuman, int outdoorTemperature) {
        if (ageHuman >= 20 && ageHuman <= 45 && outdoorTemperature >= -30 && outdoorTemperature <= 20) {
            return "Можно идти гулять!";
        }
        else if  (ageHuman < 20 && outdoorTemperature > 0 && outdoorTemperature < 28) {
            return "Можно идти гулять!";
        } else if (ageHuman < 45 && outdoorTemperature > -10 && outdoorTemperature < 25) {
            return "Можно идти гулять!";
        } else {
            return "Оставайтесь дома!";
        }
    }
}
