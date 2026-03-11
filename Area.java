class Area {

    double area(double r){
        return 3.14*r*r;
    }

    int area(int l,int b){
        return l*b;
    }

    double area(double b,double h){
        return 0.5*b*h;
    }

    public static void main(String args[]) {

        Area a = new Area();

        System.out.println("Circle area:"+a.area(5));
        System.out.println("Rectangle area:"+a.area(4,6));
        System.out.println("Triangle area:"+a.area(3.0,4.0));
    }
}
