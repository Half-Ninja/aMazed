package com.example.amazed;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class MazeController {
    @FXML
    private Canvas canvas;
    @FXML
    private Spinner spinner;

    @FXML
    protected void onRemakeButtonPress(){
        System.out.println(spinner.getValue());

    }

    public void initialize() {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory<Integer>() {
            @Override
            public void decrement(int steps) {
                int res = this.getValue() - steps;
                if (res < 5) res = 5;
                this.setValue(res);
            }

            @Override
            public void increment(int steps) {
                int res = this.getValue() + steps;
                if (res > 50) res = 50;
                this.setValue(res);
            }
        };
        valueFactory.setValue(5);
        spinner.setValueFactory(valueFactory);
    }
}
