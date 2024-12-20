module dev.research.devcode
{
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.research.devcode to javafx.fxml;
    exports dev.research.devcode;

    // this have been added by the IDE when I moved "HelloController" into the controller package.
    exports dev.research.devcode.controller;
    // this have been added by the IDE when I moved "HelloController" into the controller package.
    opens dev.research.devcode.controller to javafx.fxml;

}// Close module dev.research.devcode