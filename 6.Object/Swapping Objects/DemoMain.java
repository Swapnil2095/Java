class Car{
    int number_of_cars;
    String model;
    Car(int number_of_cars,String model){
        this.number_of_cars = number_of_cars;
        this.model = model;
    }

    void print(){
        System.out.println("Model = "+this.model +"\tNumber of cars = "+this.number_of_cars);
    }
}

class CarWrapper{

    Car c;

    CarWrapper(Car c){
        this.c = c;
    }
}

class DemoMain{


    public static void swap(CarWrapper cw1,CarWrapper cw2){
          Car temp = cw1.c;
          cw1.c = cw2.c;
          cw2.c = temp;
    }

    public static void main(String[] args){
        Car c1 = new Car(101,"S-Cross");
        Car c2 = new Car(501, "Innova");
       
        CarWrapper cw1 = new CarWrapper(c1);
        CarWrapper cw2 = new CarWrapper(c2);

        swap(cw1,cw2);
        cw1.c.print();
        cw2.c.print(); // only wrapper classes change
        
        c1.print();   // no change
        c2.print();

        
    }
}