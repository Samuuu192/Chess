package chess.game;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class GameController {

    private double x;
    private double y;

    @FXML
    void dragPiece(MouseEvent event) {
        Node img = (Node) event.getSource();
        img.setOnMousePressed(MouseEvent -> {
            x = MouseEvent.getX();
            y = MouseEvent.getY();
        });

        System.out.format("X: %.2f | Y: %.2f\n",x,y);

        img.setOnMouseDragged(MouseEvent -> {
            img.setLayoutX(MouseEvent.getSceneX() - x);
            img.setLayoutY(MouseEvent.getSceneX() - y);
        });
    }

}
