module dev.research.devcode
{
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.research.devcode to javafx.fxml;
    exports dev.research.devcode;
}