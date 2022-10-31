module com.theodinproject.top_projects {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.theodinproject.top_projects.caesarCipher;
    opens com.theodinproject.top_projects.caesarCipher to javafx.fxml;
    exports com.theodinproject.top_projects.substrings;
    opens com.theodinproject.top_projects.substrings to javafx.fxml;
}