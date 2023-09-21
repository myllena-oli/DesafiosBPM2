package org.example.desafio2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long seconds = scanner.nextLong();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date date = new Date(seconds * 1000);

        String formattedDate = dateFormat.format(date);

        System.out.println("Saída: " + formattedDate);
    }
}

