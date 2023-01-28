package com.company;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Desktop desktop = Desktop.getDesktop();
        String[] time;
        DateTimeFormatter dtf;
        LocalTime now;
    do {
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        now = LocalTime.now();
        System.out.println(dtf.format(now));
        time = now.toString().split(":");

        if(time[0].equals("08") && time[1].equals("00")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }
        else if(time[0].equals("08") && time[1].equals("55")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }
        else if(time[0].equals("09") && time[1].equals("50")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }
        else if(time[0].equals("10") && time[1].equals("45")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }
        else if(time[0].equals("11") && time[1].equals("40")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }
        else if(time[0].equals("12") && time[1].equals("35")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }
        else if(time[0].equals("13") && time[1].equals("30")){
            desktop.browse(URI.create("https://us05web.zoom.us/j/6551637290?pwd=WUtJWDM1cTRBazdJUUgzcDRzMVQvdz09"));
            //System.out.println("work");
        }


        Thread.sleep(60000);
    } while (Integer.parseInt(time[0])<15);

    }
}

