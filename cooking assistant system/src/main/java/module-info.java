module org.openjfx.javafxarchetypesimple {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.openjfx.javafxarchetypesimple to javafx.fxml;
    exports org.openjfx.javafxarchetypesimple;
    exports org.openjfx.javafxarchetypesimple.question;
    opens org.openjfx.javafxarchetypesimple.question to javafx.fxml;
    exports org.openjfx.javafxarchetypesimple.answer;
    opens org.openjfx.javafxarchetypesimple.answer to javafx.fxml;
    exports org.openjfx.javafxarchetypesimple.recipe;
    opens org.openjfx.javafxarchetypesimple.recipe to javafx.fxml;
    exports org.openjfx.javafxarchetypesimple.system;
    opens org.openjfx.javafxarchetypesimple.system to javafx.fxml;
    exports org.openjfx.javafxarchetypesimple.development_2_and_7;
    opens org.openjfx.javafxarchetypesimple.development_2_and_7 to javafx.fxml;
    exports org.openjfx.javafxarchetypesimple.development_3;
    opens org.openjfx.javafxarchetypesimple.development_3 to javafx.fxml;
}