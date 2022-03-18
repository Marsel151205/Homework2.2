package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(android(generateRandomAge(), 20));
        System.out.println(android(generateRandomAge(), 10));
        System.out.println(android(generateRandomAge(), -8));
        System.out.println(android(generateRandomAge(), 30));
        System.out.println(android(generateRandomAge(), 4));
    }
    public static String android(int ageHuman, int outdoorTemperature) {
        if (ageHuman >= 20 && ageHuman <= 45 && outdoorTemperature >= -30 && outdoorTemperature <= 20) {
            return "Можно идти гулять!";
        }
        else if  (ageHuman < 20 && outdoorTemperature > 0 && outdoorTemperature < 28) {
            return "Можно идти гулять!";
        } else if (ageHuman < 20 && outdoorTemperature > -10 && outdoorTemperature < 25) {
            return "Можно идти гулять!";
        } else {
            return "Оставайтесь дома!";
        }
    }
    public static int generateRandomAge(){
        int a = 0;
        int b = 80;

        int ageHuman = a + (int) (Math.random() * b);
        return ageHuman;
    }
}
