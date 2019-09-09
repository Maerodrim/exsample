public class Pounts {
    private Pounts() {;}
    public static Point sum(Point a, Point b){
        Point o= new Point((a.pointX+b.pointX),(a.pointY+b.pointY),(a.pointZ+b.pointZ));
        return o;}
    public static Point subtract(Point a, Point b){ Point o= new Point((a.pointX-b.pointX),(a.pointY-b.pointY),(a.pointZ-b.pointZ));
        return o;}
    public static Point multiply(Point a, Point b){ Point o= new Point((a.pointX*b.pointX),(a.pointY*b.pointY),(a.pointZ*b.pointZ));
        return o;}
    public static Point divide(Point a, Point b){ Point o= new Point((a.pointX/b.pointX),(a.pointY/b.pointY),(a.pointZ/b.pointZ));
        return o;}
    public static Point enlarge(Point a, double b){Point o= new Point((a.pointX*b),(a.pointY*b),(a.pointZ*b));
        return o;}
    public static Point opposite(Point a){Point o= new Point((-a.pointX),(-a.pointY),(-a.pointZ));
        return o;}
    public static Point inverse(Point a){Point o= new Point((1/a.pointX),(1/a.pointY),(1/a.pointZ));
        return o;}
}
