package com.testing.framework.practice.interviewDone.siemens.t2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ChangeDateFormat {
    public static void main(String[] args) {
        String inputDate = "04/01/2026";

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date = LocalDate.parse(inputDate, inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String outputDate = date.format(outputFormat);
        System.out.println(outputDate);
    }
}
