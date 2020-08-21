class Circle {

    double radius;


    /*Радиус равен половине диаметра, а диаметр, соответственно, — двум радиусам (2r).
    Тогда формула имеет вид: C = 2πr, где C — длина окружности, r — радиус окружности.
    То есть длина окружности равна удвоенному произведению радиуса на число пи (π примерно равно 3,14).*/
    public double getLength ( ) {
        double length = 2 * Math.PI * radius;
        return length;
    }

    public double getArea(){
        double area = Math.pow( radius,2 ) * Math.PI;
        return area;
    }


}