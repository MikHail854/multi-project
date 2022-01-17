package ru.chigurov;

public class App {

    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(utils.isAllPositiveNumbers("12","79"));

        ArrayListCustom<String> arrayListCustom = new ArrayListCustom<String>();
        arrayListCustom.add("Custom collection is working");
        System.out.println(arrayListCustom);
    }

}
