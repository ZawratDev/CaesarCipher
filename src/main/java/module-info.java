module com.theodinproject.top_projects {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.theodinproject.top_projects to javafx.fxml;
    exports com.theodinproject.top_projects;
}