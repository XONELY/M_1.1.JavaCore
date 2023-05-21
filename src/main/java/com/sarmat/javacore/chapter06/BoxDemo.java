package main.java.com.sarmat.javacore.chapter06;

class Box {
    double width;
    double heght;
    double depth;

    void Volume() {
        System.out.print("Обьем равен ");
        System.out.println(width * heght * depth);
    }

    double VolumeReturn() {
        return width * heght * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 10;
        mybox.heght = 20;
        mybox.width = 15;
        vol = mybox.width * mybox.heght * mybox.depth;
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
        mybox1.heght = 20;

        mybox2.width = 3;
        mybox2.depth = 9;
        mybox2.heght = 6;

        vol = mybox1.width * mybox1.heght * mybox1.depth;
        System.out.println("Обьем равен " + vol);

        vol = mybox2.width * mybox2.heght * mybox2.depth;
        System.out.println("Обьем равен " + vol);
    }
}
    class BoxDemo3 {
        public static void main(String[] args) {
            Box mybox1 = new Box();
            Box mybox2 = new Box();

            mybox1.width = 10;
            mybox1.depth = 15;
            mybox1.heght = 20;

            mybox2.width = 3;
            mybox2.depth = 9;
            mybox2.heght = 6;

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
                mybox1.heght = 20;

                mybox2.width = 3;
                mybox2.depth = 9;
                mybox2.heght = 6;

                double vol = mybox1.VolumeReturn();
                System.out.println("Обьем равен " + vol);
                vol = mybox2.VolumeReturn();
                System.out.println("Обьем равен " + vol);
            }
        }






