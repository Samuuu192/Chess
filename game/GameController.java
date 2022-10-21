package chess.game;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.*;

public class GameController {

    private double x;
    private double y;

    @FXML
    void dragPiece(DragEvent event) {
        Node img = (Node) event.getSource();
        img.setOnDragDetected(MouseEvent -> {
            x = MouseEvent.getX();
            y = MouseEvent.getY();
        });

        img.setOnDragDetected(MouseEvent -> {
            img.setLayoutX(MouseEvent.getSceneX() - x);
            img.setLayoutY(MouseEvent.getSceneX() - y);
        });

    }

}
