package main.java.com.sarmat.javacore.chapter08;

public class Box {
   private double width;
   private double height;
   private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;


    BoxWeight(double w, double h,double d, double m) {
        super(w, d, h);
        weight = m;
    }
BoxWeight(BoxWeight ob){
    super(ob);
    weight = ob.weight;
        }
        /*
        width = w;
        height = h;
        depth = d;
        weight = m;
        */
    BoxWeight(){
        super();
        weight=-1;
    }
    BoxWeight(double len,double m){
        super(len);
        weight=m;
    }
    }

class DemoWeight{
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("1 V= "+vol);
        System.out.println("1 W= "+mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("2 V= "+vol);
        System.out.println("2 W= "+mybox2.weight);
        System.out.println();
    }
}

class ColorBox extends Box {
    int color;

    ColorBox(double w,double h,double d,int c){
       // width = w;
       // height = h;
      //  depth = d;
        color = c;
    }
}
class DemoSuper{
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol=mybox1.volume();
        System.out.println("V1=" +vol);
        System.out.println("W1=" +mybox1.weight);
        System.out.println();

        vol=mybox2.volume();
        System.out.println("V2=" +vol);
        System.out.println("W2=" +mybox2.weight);
        System.out.println();

        vol=mybox3.volume();
        System.out.println("V3=" +vol);
        System.out.println("W3=" +mybox3.weight);
        System.out.println();

        vol=myclone.volume();
        System.out.println("VCL=" +vol);
        System.out.println("WCL=" +myclone.weight);
        System.out.println();

        vol=mycube.volume();
        System.out.println("VC=" +vol);
        System.out.println("WC=" +mycube.weight);
        System.out.println();


    }
}

class Shipment extends BoxWeight{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h,double d,double m,double c){
        super(w, h, d, m);
        cost = c;
    }
    Shipment(){
        super();
        cost =-1;
    }

    Shipment(double len,double m,double c){
        super(len,m);
        cost =c;
    }
}
class DemoShipment{
    public static void main(String[] args){
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;
        vol = shipment1.volume();
        System.out.println("VS1 = "+vol);
        System.out.println("WS1 = "+shipment1.weight);
        System.out.println("Price1 = "+shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("VS2 = "+vol);
        System.out.println("WS2 = "+shipment2.weight);
        System.out.println("Pric2 = "+shipment2.cost);
        System.out.println();
    }
}