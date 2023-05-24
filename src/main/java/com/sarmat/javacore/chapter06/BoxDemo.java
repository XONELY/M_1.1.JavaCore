package main.java.com.sarmat.javacore.chapter06;


class Box {
    double width;
    double height;
    double depth;

    void Volume() {
        System.out.print("Обьем равен ");
        System.out.println(width * height * depth);
    }

    double VolumeReturn() {
        return width * height * depth;
    }

    void SetDim(double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }

    Box() {
        System.out.println("Конструирование обьекта BOX");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }

}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 10;
        mybox.height = 20;
        mybox.width = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Обьем равен " + vol);
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;

        mybox2.width = 3;
        mybox2.depth = 9;
        mybox2.height = 6;

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Обьем равен " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Обьем равен " + vol);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;

        mybox2.width = 3;
        mybox2.depth = 9;
        mybox2.height = 6;

        mybox1.Volume();
        mybox2.Volume();
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;

        mybox2.width = 3;
        mybox2.depth = 9;
        mybox2.height = 6;

        double vol = mybox1.VolumeReturn();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.VolumeReturn();
        System.out.println("Обьем равен " + vol);
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.SetDim(10, 20, 15);
        mybox2.SetDim(3, 6, 9);
        vol = mybox1.VolumeReturn();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.VolumeReturn();
        System.out.println("Обьем равен " + vol);
    }
}
class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        vol = mybox1.VolumeReturn();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.VolumeReturn();
        System.out.println("Обьем равен " + vol);
    }
}

class BoxDemo7 {
    public static void main(String[] args){
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);
        double vol;
        vol = mybox1.VolumeReturn();
        System.out.println("Обьем равен " + vol);
        vol = mybox2.VolumeReturn();
        System.out.println("Обьем равен " + vol);
    }
}





