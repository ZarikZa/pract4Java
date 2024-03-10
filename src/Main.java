import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите фигуру:\n1. Круг\n2. Квадрат\n3. Треугольник\n4. Пятиугольник\n5. Трапеция\n6. Прямоугольник\n7. Параллелограмм\n8. Параллелепипед\n9. Цилиндр\n10. Сфера\n11. Ромб\n12. Конус\n13. Выход");
            System.out.println("Выбор: ");
            int vibor = scanner.nextInt();
            System.out.println("---------------------------------------");
            switch (vibor){
                case 1:
                    System.out.println("Введите радиус круга: ");
                    int radius = scanner.nextInt();
                    Krug krug = new Krug(radius);
                    krug.figura();
                    break;
                case 2:
                    System.out.println("Введите сторону квадрата: ");
                    int storona = scanner.nextInt();
                    Kvadrat kvadrat = new Kvadrat(storona);
                    kvadrat.figura();
                    break;
                case 3:
                    System.out.println("Введите основание треульника: ");
                    int osnova = scanner.nextInt();
                    System.out.println("Введите сторону треульника: ");
                    int b = scanner.nextInt();
                    System.out.println("Введите другую сторону треульника: ");
                    int c = scanner.nextInt();
                    System.out.println("Введите высоту треульника: ");
                    int visota = scanner.nextInt();
                    Treugolnic treugolnic = new Treugolnic(osnova,b,c,visota);
                    treugolnic.figura();
                    break;
                case 4:
                    System.out.println("Введите сторону пятиугольника: ");
                    storona = scanner.nextInt();
                    Pyatiugol pyatiugol = new Pyatiugol(storona);
                    pyatiugol.figura();
                    break;
                case 5:
                    System.out.println("Введите нижнее основание трапеции: ");
                    int osnovaNiz = scanner.nextInt();
                    System.out.println("Введите верхнее основание трапеции: ");
                    int osnovaVerh = scanner.nextInt();
                    System.out.println("Введите сторону трапеции: ");
                    int storona1 = scanner.nextInt();
                    System.out.println("Введите другу сторону треульника: ");
                    int storona2 = scanner.nextInt();
                    System.out.println("Введите высоту треульника: ");
                    visota = scanner.nextInt();
                    Trapeziya trapeziya = new Trapeziya(osnovaNiz, osnovaVerh, storona1, storona2, visota);
                    trapeziya.figura();
                    break;
                case 6:
                    System.out.println("Введите длину прямоульника: ");
                    int dlina = scanner.nextInt();
                    System.out.println("Введите ширину прямоульника: ");
                    int shirina = scanner.nextInt();
                    Pryamougol pryamougol = new Pryamougol(dlina, shirina);
                    pryamougol.figura();
                    break;
                case 7:
                    System.out.println("Введите основание паралелограмма: ");
                    osnova = scanner.nextInt();
                    System.out.println("Введите сторону паралелограмма: ");
                    storona = scanner.nextInt();
                    System.out.println("Введите высоту паралелограмма: ");
                    visota = scanner.nextInt();
                    Paralelogramm paralelogramm = new Paralelogramm(osnova, storona, visota);
                    paralelogramm.figura();
                    break;
                case 8:
                    System.out.println("Введите ширину параллелепипеда: ");
                    shirina = scanner.nextInt();
                    System.out.println("Введите длину параллелепипеда: ");
                    dlina = scanner.nextInt();
                    System.out.println("Введите высоту параллелепипеда: ");
                    visota = scanner.nextInt();
                    Paralelepiped paralelepiped = new Paralelepiped(shirina, dlina, visota);
                    paralelepiped.figura();
                    break;
                case 9:
                    System.out.println("Введите радиус цилиндра: ");
                    radius = scanner.nextInt();
                    System.out.println("Введите высоту цилиндра: ");
                    visota = scanner.nextInt();
                    Cilindr cilindr = new Cilindr(radius, visota);
                    break;
                case 10:
                    System.out.println("Введите радиус сферы: ");
                    radius = scanner.nextInt();
                    Sfera sfera = new Sfera(radius);
                    break;
                case 11:
                    System.out.println("Введите сторону ромба: ");
                    storona = scanner.nextInt();
                    System.out.println("Введите высоту ромба: ");
                    visota = scanner.nextInt();
                    Romb romb = new Romb(storona, visota);
                    romb.figura();
                    break;
                case 12:
                    System.out.println("Введите радиус ромба: ");
                    radius = scanner.nextInt();
                    System.out.println("Введите образующую ромба: ");
                    int obrazyuchaya = scanner.nextInt();
                    Konus konus = new Konus(radius, obrazyuchaya);
                    konus.figura();
                    break;
                default:
                    System.out.println("Пока пока");
                    System.exit(0);
                    break;
            }
            System.out.println("---------------------------------------");
        }
    }
}
