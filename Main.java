import java.util.Scanner;

class Calculator {
    private double result;

    // Методы для выполнения основных математических операций
    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Деление на ноль невозможно");
        } else {
            result = num1 / num2;
        }
    }

    // Методы для выполнения тригонометрических функций
    public void sin(double angle) {
        result = Math.sin(Math.toRadians(angle));
    }

    public void cosin(double angle) {
        result = Math.cos(Math.toRadians(angle));
    }

    public void tg(double angle) {
        result = Math.tan(Math.toRadians(angle));
    }

    // Метод для вычисления квадратного корня
    public void squareRoot(double number) {
        result = Math.sqrt(number);
    }

    // Метод для получения результата
    public double getResult() {
        return result;
    }

    public void ln(double number) {
        result = Math.log(number);
    }
    public void  log(double number) {
        result = Math.log10(number);
    }
    public void arcsin(double number) {
        result = Math.asin(number);
    }
    public void arccos(double number) {
        result = Math.acos(number);
    }
    public void arctan(double number) {
        result = Math.atan(number);
    }
    public void pow(double number, double pow) {
        result = Math.pow(number, pow);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите значения: ");
            String input = scanner.nextLine();

            if ("exit".equals(input)) {
                break;
            }

            String[] tokens = input.split("\\s+");
            String operation = tokens[0];switch (operation) {
                case "+":
                    calculator.add(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                    break;
                case "-":
                    calculator.subtract(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                    break;
                case "*":
                    calculator.multiply(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                    break;
                case "/":
                    calculator.divide(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                    break;
                case "sin":
                    calculator.sin(Double.parseDouble(tokens[1]));
                    break;
                case "cos":
                    calculator.cosin(Double.parseDouble(tokens[1]));
                    break;
                case "tan":
                    calculator.tg(Double.parseDouble(tokens[1]));
                    break;
                case "sqrt":
                    calculator.squareRoot(Double.parseDouble(tokens[1]));
                    break;
                case "arcsin":
                    calculator.arcsin((Double.parseDouble(tokens[1])));
                    break;
                case "arccos":
                    calculator.arccos((Double.parseDouble(tokens[1])));
                    break;
                case "arctan":
                    calculator.arctan((Double.parseDouble(tokens[1])));
                    break;
                case "ln":
                    calculator.ln((Double.parseDouble(tokens[1])));
                    break;
                case "log":
                    calculator.log((Double.parseDouble(tokens[1])));
                    break;
                case "pow":
                    calculator.pow(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
                    break;
                default:
                    System.out.println("Неизвестная операция");
                    break;
            }

            System.out.println(STR."Итог:\{calculator.getResult()}");
        }

        scanner.close();
    }
}