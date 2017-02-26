

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button btnReset;
    @FXML
    TextField textField_1;
    @FXML
    TextField textField_2;
    @FXML
    Button btnSum;
    @FXML
    Button btnDiff;
    @FXML
    Button btnUmn;
    @FXML
    Button btnDel;
    @FXML
    Button btnPow;
    @FXML
    Button btnSin;
    @FXML
    Button btnCos;
    @FXML
    Button btnTan;
    @FXML
    Button btnCtg;
    @FXML
    Label label;

    public void sum() {
        try {
            if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var1 = Double.parseDouble(textField_1.getText());
                double var2 = Double.parseDouble(textField_2.getText());
                label.setText("Сумма равна: " + (var1 + var2));
            } else {
                label.setText("Вы ввели не все числа.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void diff() {
        try {
            if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var1 = Double.parseDouble(textField_1.getText());
                double var2 = Double.parseDouble(textField_2.getText());
                label.setText("Разность равна: " + (var1 - var2));
            } else {
                label.setText("Вы ввели не все числа.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void umn() {
        try {
            if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var1 = Double.parseDouble(textField_1.getText());
                double var2 = Double.parseDouble(textField_2.getText());
                label.setText("Произведение равно: " + (var1 * var2));
            } else {
                label.setText("Вы ввели не все числа.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void del() {
        try {
            if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var1 = Double.parseDouble(textField_1.getText());
                double var2 = Double.parseDouble(textField_2.getText());
                label.setText("Частное равно: " + (var1 / var2));
            } else {
                label.setText("Вы ввели не все числа.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void sinus() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                label.setText("Синус равен:" + String.valueOf(Math.sin(var)));
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                label.setText("Синус равен:" + String.valueOf(Math.sin(var)));
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void cosinus() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                label.setText("Косинус равен:" + String.valueOf(Math.cos(var)));
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                label.setText("Косинус равен:" + String.valueOf(Math.cos(var)));
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void tang() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                label.setText("Тангенс равен:" + String.valueOf(Math.tan(var)));
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                label.setText("Тангенс равен:" + String.valueOf(Math.tan(var)));
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void ctang() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                label.setText("Котангенс равен:" + String.valueOf(1 / Math.tan(var)));
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                label.setText("Котангенс равен:" + String.valueOf(1 / Math.tan(var)));
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void st() {
        try {
            if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var1 = Double.parseDouble(textField_1.getText());
                double var2 = Double.parseDouble(textField_2.getText());
                label.setText("Степень равна: " + Math.pow(var1, var2));
            } else {
                label.setText("Вы ввели не все числа.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void reset() {
        textField_1.setText("");
        textField_2.setText("");
        label.setText("");
    }

    public void f1() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                double y = 1 / var + 1 / Math.pow(var, 2) + 1 / Math.pow(var, 3);
                label.setText("y = " + y);
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                double y = 1 / var + 1 / Math.pow(var, 2) + 1 / Math.pow(var, 3);
                label.setText("y = " + y);
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void f2() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                double y = Math.cos(2 * var) / (Math.pow(Math.cos(var), 2) * Math.pow(Math.sin(var), 2));
                label.setText("y = " + y);
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                double y = Math.cos(2 * var) / (Math.pow(Math.cos(var), 2) * Math.pow(Math.sin(var), 2));
                label.setText("y = " + y);
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void f3() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                double y = Math.pow(var, 4) / 4 * (Math.pow(Math.log(var), 2) - Math.log(var) / 2 + 1 / 8);
                label.setText("y = " + y);
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                double y = Math.pow(var, 4) / 4 * (Math.pow(Math.log(var), 2) - Math.log(var) / 2 + 1 / 8);                label.setText("y = " + y);
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void f4() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                double y = (1 + 3 * Math.pow(var, 2)) / Math.sqrt(2 * var);
                label.setText("y = " + y);
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                double y = (1 + 3 * Math.pow(var, 2)) / Math.sqrt(2 * var);
                label.setText("y = " + y);
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void f5() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                double y = (2 / (1 + Math.pow(var, 2))) - (3 / (Math.sqrt(1 - Math.pow(var, 2))));
                label.setText("y = " + y);
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                double y = (2 / (1 + Math.pow(var, 2))) - (3 / (Math.sqrt(1 - Math.pow(var, 2))));
                label.setText("y = " + y);
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }

    public void f6() {
        try {
            if (!textField_1.getText().isEmpty() && textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_1.getText());
                double y = Math.pow(var, 2) * Math.pow(2, var) * Math.sin(2 * var);
            } else if (textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                double var = Double.parseDouble(textField_2.getText());
                double y = Math.pow(var, 2) * Math.pow(2, var) * Math.sin(2 * var);
                label.setText("y = " + y);
            } else if (!textField_1.getText().isEmpty() && !textField_2.getText().isEmpty()) {
                label.setText("Вы ввели два числа, введите одно.");
            } else {
                label.setText("Вы не ввели чисел.");
            }
        } catch (NumberFormatException e) {
            label.setText("Вы ввели не число!");
        }
    }
}
