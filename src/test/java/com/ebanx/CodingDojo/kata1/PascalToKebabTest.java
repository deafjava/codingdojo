package com.ebanx.CodingDojo.kata1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.isEmptyString;
import static org.junit.Assert.assertThat;

public class PascalToKebabTest {

    @Test
    public void noneWordsTest() {
        String result = PascalToKebab.convert("");
        assertThat(result, isEmptyString());
    }

    @Test
    public void twoWordsTest() {
        String result = PascalToKebab.convert("SomeWord");
        assertThat(result, is("some-word"));
    }

    @Test
    public void threeWordsTest() {
        String result = PascalToKebab.convert("SomeMoreWords");
        assertThat(result, is("some-more-words"));
    }

    @Test
    public void fakeWordsTest() {
        String result = PascalToKebab.convert("Someword");
        assertThat(result, is("someword"));
    }

}