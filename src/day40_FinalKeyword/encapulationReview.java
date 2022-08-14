package day40_FinalKeyword;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Square;

import java.sql.SQLClientInfoException;

public class encapulationReview {

    private Circle circle;

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(){
        if (circle.getRadius() <5){
            return;
        }
        this.circle =circle;
    }

    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }



}
