abstract class Figure {
    public abstract void figura();
}

class Krug extends Figure{
    private double radius;
    public Krug(double radius){
        this.radius = radius;
    }
    @Override
    public void figura(){
        double S = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + S);
        double Dlina = 2 * Math.PI * radius;
        System.out.println("Длина круга: " + Dlina);
    }
}
class Kvadrat extends Figure{
    private int storona;
    public Kvadrat(int storona){
        this.storona = storona;
    }
    @Override
    public void figura(){
        int P = 4 * storona;
        System.out.println("Периметр квадрата: " + P);
        int S = (int) Math.pow(storona, 2);
        System.out.println("Площадь квадрата: " + S);
    }
}
class Treugolnic extends Figure{
    private int osnovanie;
    private int b;
    private int c;
    private int visota;
    public Treugolnic(int osnovanie,int b, int c, int visota){
        this.osnovanie = osnovanie;
        this.b = b;
        this.c = c;
        this.visota = visota;
    }
    @Override
    public void figura(){
        int P = osnovanie + b + c;
        System.out.println("Периметр треугольнка: " + P);
        double S = 0.5 * osnovanie * visota;
        System.out.println("Площадь треугольнка: " + S);
    }
}
class Pyatiugol extends Figure{
    private int storona;
    public Pyatiugol(int storona){
        this.storona = storona;
    }
    @Override
    public void figura(){
        int P = storona *  5;
        System.out.println("Периметр пятиугольника: " + P);
        double S = (double) 5 /4 * Math.pow(storona, 2) * Math.atan(Math.PI/5);
        System.out.println("Площадь пятиугольника: " + S);
    }
}
class Trapeziya extends Figure{
    private int osnivaNiz;
    private int osnivaVerh;
    private int a;
    private int b;
    private int visota;
    public Trapeziya(int osnivaNiz, int osnivaVerh, int a, int b, int visota){
        this.osnivaNiz = osnivaNiz;
        this.osnivaVerh = osnivaVerh;
        this.a = a;
        this.b = b;
        this.visota = visota;
    }
    @Override
    public void figura(){
        int P = osnivaNiz + osnivaVerh + a + b;
        System.out.println("Периметр трапеции: " + P);
        double S = (double) (osnivaNiz + osnivaVerh) /2  * visota;
        System.out.println("Площадь трапеции: " + S);
    }
}
class Pryamougol extends Figure{
    private int dlina;
    private int shirina;
    public Pryamougol(int dlina, int shirina){
        this.dlina = dlina;
        this.shirina = shirina;
    }
    @Override
    public void figura(){
        int P = dlina * 2 + shirina * 2;
        System.out.println("Периметр прямоульника: " + P);
        double S = dlina * shirina;
        System.out.println("Площадь прямоульника: " + S);
    }
}
class Paralelogramm extends Figure{
    private int osnova;
    private int storona;
    private int visota;
    public Paralelogramm(int osnova, int storona, int visota){
        this.osnova = osnova;
        this.storona = storona;
        this.visota = visota;
    }
    @Override
    public void figura(){
        int P = (osnova + storona) * 2;
        System.out.println("Периметр паралелограмма: " + P);
        double S = osnova * visota;
        System.out.println("Площадь паралелограмма: " + S);
    }
}
class Paralelepiped extends Figure{
    private int shirina;
    private int dlina;
    private int visota;
    public Paralelepiped(int shirina, int dlina, int visota){
        this.shirina = shirina;
        this.dlina = dlina;
        this.visota = visota;
    }
    @Override
    public void figura(){
        int P = (shirina + dlina + visota) * 2;
        System.out.println("Периметр паралелепипеда: " + P);
        double S = (dlina * shirina + dlina * visota + shirina * visota) * 2;
        System.out.println("Площадь паралелепипеда: " + S);
    }
}
class Cilindr extends Figure{
    private int radius;
    private int visota;
    public Cilindr(int radius, int visota){
        this.radius = radius;
        this.visota = visota;
    }
    @Override
    public void figura(){
        double S = 2 * Math.PI * radius * visota + 2 * Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь цилиндра: " + S);
    }
}
class Sfera extends Figure{
    private int radius;
    public Sfera(int radius){
        this.radius = radius;
    }
    @Override
    public void figura(){
        double S = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь сферы: " + S);
    }
}
class Romb extends Figure{
    private int storona;
    private int visota;
    public Romb(int storona, int visota){
        this.storona = storona;
        this.visota = visota;
    }
    @Override
    public void figura(){
        int P = 4 * storona;
        System.out.println("Периметр ромба: " + P);
        double S = visota * storona;
        System.out.println("Площадь ромба: " + S);
    }
}
class Konus extends Figure{
    private int radius;
    private int obrazu;
    public Konus(int radius, int obrazu){
        this.radius = radius;
        this.obrazu = obrazu;
    }
    @Override
    public void figura(){
        double S = Math.PI * radius * obrazu + Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь конуса: " + S);
    }
}