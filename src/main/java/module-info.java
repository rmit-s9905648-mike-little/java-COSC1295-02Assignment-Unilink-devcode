/*
Changes made to this code:
20250117-1615:
    added a 'model' package, and so I need to
    expose the classes and methods contained to those classes and methods
    that will use it.
 */

module dev.research.devcode
{
    //--------specifies what is required in this module--------
    requires javafx.controls;
    requires javafx.fxml;
    /*
    MJL20250120-1550..
    "requires java.sql;" statement is required because "table_setup_login.java"
    needs to import a number of packages from java.sql.*

    import java.io.FileInputStream;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.Statement;
    import java.util.Scanner;
     */
    requires java.sql;


    // following commented out as it is not needed.
    //opens dev.research.devcode to javafx.fxml;
    //exports dev.research.devcode;

    //--------this opens the controller package--------
    // this have been added by the IDE when I moved "HelloController" into the controller package.
    exports dev.research.devcode.controller;
    // this have been added by the IDE when I moved "HelloController" into the controller package.
    opens dev.research.devcode.controller to javafx.fxml;

    //--------this opens the model package--------
    //exports dev.research.devcode.model;
    exports dev.research.devcode.model;
    opens dev.research.devcode.model to javafx.fxml;

}// Close module dev.research.devcode