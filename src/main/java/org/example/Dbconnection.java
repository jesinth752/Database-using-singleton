package org.example;

import java.util.logging.Logger;

class Dbconnection {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    static int status = 0;

    static Dbconnection connector = null;


    private Dbconnection() {

    }

    public static Dbconnection getInstance() {

        if (connector == null) {

            connector = new Dbconnection();
        }


        return connector;
    }

    static void newconnection() {
        if (status == 1) {
            String connect ="Already  connection  " + connector+"is exists";
            LOGGER.info(connect);
        } else {
            String connect="connected to " + connector;
            LOGGER.info(connect);
        }
        status = 1;


    }

    static void checkconnection() {
        if (status == 1) {
            LOGGER.info("connection status:ON ");

        } else {
            LOGGER.info("connection status:OFF ");
        }

    }

    static void closeconnection() {

        connector = null;

        if (status == 1) {
            status = 0;
            LOGGER.info(" Connection is closed");
        } else {

            LOGGER.info("NO active Connection");
        }


    }
}