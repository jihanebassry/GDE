package org.cigma.td.gestiondesetudiat.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class Helper {
    public Matcher matchInput(final String matcher, final String input) {
        return Pattern.compile(matcher).matcher(input);
    }

    public Matcher matchInput(final String matcher, final Integer input) {
        return Pattern.compile(matcher).matcher(valueOf(input));
    }
}
