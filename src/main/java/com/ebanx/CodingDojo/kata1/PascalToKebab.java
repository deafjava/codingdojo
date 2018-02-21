package com.ebanx.CodingDojo.kata1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PascalToKebab {
    public static String convert(String inputString) {

        String[] splittedWords = inputString.split("(?=[A-Z])");
        return Arrays.stream(splittedWords).map(String::toLowerCase).collect(Collectors.joining("-"));

    }

}
