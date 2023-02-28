package org.example;


import java.util.Scanner;
import java.util.logging.Logger;


public class Database {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int opt;
        int run=0;
        while(run==0) {
            Dbconnection.getInstance();

            LOGGER.info("1.New Connection \n2.check Connection Status \n3.close Connection \n4.exit ");
            LOGGER.info("Enter option:");

            opt= input.nextInt();
            switch (opt) {
                case 1 -> Dbconnection.newconnection();
                case 2 -> Dbconnection.checkconnection();
                case 3 -> Dbconnection.closeconnection();
                case 4 -> run=1;
                default ->LOGGER.info(" Invalid choice");

            }

        }



    }
}