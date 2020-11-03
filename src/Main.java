// Создать класс Vector2D, представляющий собой двумерный вектор.
// Класс должен иметь следующие поля:
// Два числа (тип double) - координаты вектора.
// Класс должен иметь следующие методы:
// public void add(Vector2D other) - складывает вектор с другим
// public void sub(Vector2D other) - вычитает из вектора другой вектор
// public void mult(double t) - умножить вектор на число

public class Main {

    public static void main(String[] args) {
		int t = 5;
		Vector2D vector = new Vector2D();
		Vector2D vector1 = new Vector2D();
		vector.x = 10;
		vector.y = 7;
		vector1.x = 4;
		vector1.y = 6;
		vector.add(vector1);
		System.out.println(vector.x);
		System.out.println(vector.y);
		System.out.println("");
		vector.mult(5);
		System.out.println(vector.x);
		System.out.println(vector.y);
		System.out.println("");
		vector.sub(vector1);
		System.out.println(vector.x);
		System.out.println(vector.y);
    }
}
