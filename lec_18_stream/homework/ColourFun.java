package lec_18_stream.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * У нас есть коробка в которой находятся цветные фигуры. Например:
 * Красный треугольник, Синяя точка, Черный квадрат, Желтый круг.
 *
 * 1. Покрасить все фигуры в определенный цвет
 * 2. Сгруппировать все фигуры по цвету
 * 3. Посчитать суммарное количество желтых точек и черных квадратов
 */
public class ColourFun {
    public static void main(String[] args) {
        Box box = new Box();
        box.addFigures(
                new Figure(Shape.TRIANGLE, Colour.RED),
                new Figure(Shape.DOT, Colour.BLUE),
                new Figure(Shape.SQUARE, Colour.BLACK),
                new Figure(Shape.CIRCLE, Colour.YELLOW)
        );

        paintAllFigures(box, Colour.WHITE);

        Map<Colour, Figure> groupedByColour = groupByColour(box);

        int sumOfYellowDotsAndBlackSquares = sumOfYellowDotsAndBlackSquares(box);
    }

    private static int sumOfYellowDotsAndBlackSquares(Box box) {
        //TODO 3 task
        return 0;
    }

    private static Map<Colour, Figure> groupByColour(Box box) {
        //TODO 2 task
        return null;
    }

    private static void paintAllFigures(Box box, Colour white) {
        //TODO 1 task
    }


}


class Box {
    List<Figure> figures;

    public void addFigures(Figure... fs) {
        figures = Arrays.asList(fs);
    }
}

class Figure {
    Shape shape;
    Colour colour;

    public Figure(Shape shape, Colour colour) {
        this.shape = shape;
        this.colour = colour;
    }
}

enum Shape {
    CIRCLE, SQUARE, TRIANGLE, LINE, DOT
}

enum Colour {
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE
}