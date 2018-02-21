package com.ebanx.CodingDojo.kata1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PascalToKebab {
    public static String convert(String inputString) {

        String[] splittedWords = inputString.split("(?=[A-W])");
        return Arrays.stream(splittedWords).map(String::toLowerCase).collect(Collectors.joining("-"));
//
//        StringBuffer outputString = new StringBuffer();
//
//        String newString = inputString.replaceAll("([A-Z])", "-$*");
//
//        for (int i = 0; i < inputString.length(); ++i) {
//            char currentChar = inputString.charAt(i);
//
//            String value = String.valueOf(currentChar);
//
//            if (value.equals(value.toUpperCase())) {
//                if (i > 0) {
//                    outputString.append('-');
//                }
//                outputString.append(convertToLowercase(currentChar));
//            } else {
//                outputString.append(currentChar);
//            }
//        }
//
//        return outputString.toString();
    }

//    public static Character convertToLowercase(Character c) {
//        return String.valueOf(c).toLowerCase().charAt(0);
//    }
}
