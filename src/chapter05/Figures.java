package chapter05;

class Figures{
    private int pointNumbers;
    private Point[] points;

    Figures(int pointNumbers,double x,double y){
    // Угол на начальную точку, угол приращения
    // и расстояние до начальной точки:
        double phi0;
        double phi;
        double r;
        Point p = new Point('A',x,y);

        this.pointNumbers = pointNumbers;
        points = new Point[pointNumbers];
    // Вычисление угла на начальную точку:
        phi0 = Math.atan2(y,x);
    // Вычисление угла приращения:
        phi = 2 * Math.PI/ pointNumbers;
    // Расстояние от начала координат
    // до начальной точки:
        r = p.dist();
        System.out.print(
                "Правильный "+ pointNumbers +"-угольник с вершинами в точках "
        );

        for(int i = 0; i < pointNumbers - 1; i++){
            p.show();
            System.out.print(i == pointNumbers - 2?" и ":", ");
            points[i] = p;
            p=new Point(
                    (char)(p.name + 1),
                    r*Math.cos(phi0 + (i + 1) * phi),
                    r*Math.sin(phi0 + (i + 1) * phi)
            );
        }

        points[pointNumbers - 1] = p;
        p.show();
        System.out.println();
        System.out.println("Периметр:\t"+perimeter());
        System.out.println("Площадь:\t"+square());
    }

    double dist(Point A,Point B){
        return Math.sqrt(
                (A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y)
        );
    }

    double perimeter(){
        double P=0;
        for(int i = 0; i < pointNumbers - 1; i++){
            P += dist(points[i],points[i + 1]);
        }
        P += dist(points[pointNumbers -1],points[0]);
        return P;
    }

    double square(){
        double r=points[0].dist();
        double phi= 2 * Math.PI / pointNumbers;
        double s= r * r * Math.sin(phi) / 2;
        return s * pointNumbers;
    }
}