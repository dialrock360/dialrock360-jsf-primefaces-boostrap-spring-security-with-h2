package com.primestap.primefaces.service;

import com.primestap.primefaces.model.Brand;
import com.primestap.primefaces.model.Car;
import com.primestap.primefaces.model.colections.Color;
import com.primestap.primefaces.repository.BrandRepository;
import com.primestap.primefaces.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.*;

@Named
@ApplicationScoped
public class CarService2 {


    private  final   String[] brands={"Volvo", "BMW", "Ford", "Mazda","Renault","Mercedes","Fiat","Volkswagen","Honda","Jaguar","Ford","Audi","Toyota"};
    private final     String[] colors ={"Black", "White", "Green", "Red","Blue","Orange","Silver","Yellow","Brown","Maroon","Indigo","Dark blue","Gold"};
    private final     String[] Models = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    public   List<Car> cars;
    public    Car  car ;


    public     List<Car> genCars(int number ) {
        List<Car> list = new ArrayList<Car>();
        Random rand = new Random();
        for(int i = 1 ; i <= number ; i++) {
            int n=rand.nextInt(number);
            Brand brand= new Brand(i, brands[n], Models[n]+String.valueOf(n));
            this.car = new Car(i, this.getRandomYear(), this.getRandomPrice(), this.getRandomSoldState() , brand,n);
            list.add(this.car);
        }

        this.cars = list;
        return list;
    }


    public   String getRandomId() { return UUID.randomUUID().toString().substring(0, 8);}
    public   int getRandomYear() { return (int) (Math.random() * 50 + 1960); }
    public   int getRandomPrice() { return (int) (Math.random() * 100000); }
    public   boolean getRandomSoldState() { return Math.random() > 0.5; }





    public Car find(int id) {
        car = new Car();
        for(Car c: cars) {
            if (c.getId()==id){
                car=c;
                break;
            }
        }
        return car;
    }

    public List<Car> getCars() {
        return cars;
    }


    public void edit(Car c) {
        int i = 0;
        List<Car> list =  cars;
        for(Car car: list) {
            if (car.getId()==car.getId()){
                this.cars.get(i).setBrand(c.getBrand());
                this.cars.get(i).setColor(c.getColor());
                this.cars.get(i).setPrice(c.getPrice());
                this.cars.get(i).setYear(c.getYear());
                break;
            }
            i+=i;
        }
    }

    public String[] getBrands() {
        return brands;
    }

    public String[] getColors() {
        return colors;
    }

    public String[] getModels() {
        return Models;
    }


    public List<String> listColors() {

        List<String> icolors = new ArrayList<String>();
        for (Color color : Color.values()) {
            icolors.add(color.name());
        }
        return icolors;
    }
    public List<Hashtable> ilistColors() {

        List<Hashtable> icolors = new ArrayList<Hashtable>();
        int i=1;
        for (Color color : Color.values()) {
            Hashtable cl = new Hashtable();
            cl.put("id", String.valueOf(i));
            cl.put("name", color);
            icolors.add(cl);
            i+=i;
        }
        return icolors;
    }
}