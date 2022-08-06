public class circle {
    static double radius;
    circle(){radius=1;}
    circle(double r)
    {
        radius=r;
    }
    static double getArea()
    {
        return (3.14*radius*radius);
    }
    static double getPerimeter()
    {
        return (2*(3.14)*radius);
    }
    
}
