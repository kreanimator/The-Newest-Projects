public class app {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.8,8.3,0);
        System.out.println("Сторона треугольника 1 = "+ rectangle.getRectangleHeight()+
                "\nСторона треугольника 2 = " + rectangle.getRectangleWidth() +
                "\nПлощадь прямоугольника = " + rectangle.getArea());
        Rectangle rectangle1 = new Rectangle(7.9, 5.4,0);
        System.out.println("Сторона треугольника 1 = "+ rectangle1.getRectangleHeight()+
                "\nСторона треугольника 2 = " + rectangle1.getRectangleWidth() +
                "\nПлощадь прямоугольника = " + rectangle1.getArea());

    }
}
