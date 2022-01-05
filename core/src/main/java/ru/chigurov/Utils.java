package ru.chigurov;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            return new StringUtils().isPositiveNumber(s);
        }
        return false;
    }

}
