package com.assesment.java1;
import java.util.ArrayList;
public class TestTollBooth { 
    public static void main(String[] args) {
    	   TollBooth booth = new RaviTollBooth();
    	   	 
    	   	 Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
    	   	 Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg 
    	   	 
    	   	 booth.arrived(ford);
    	   	        booth.arrived(nissan);
    	   	        booth.displayData();

    	ArrayList<Truck> trucksList = makeTruckList(args);
 
        System.out.println("\nAt Ravi Toll Booth : \n");
        TollBooth tollBooth = new RaviTollBooth();
        for (Truck truck : trucksList)
            tollBooth.arrived(truck);
        tollBooth.displayData();
 
        System.out.println("\nAt Islamabad Toll Booth :\n");
        tollBooth = new IslamabadTollBooth();
        for (Truck truck : trucksList)
            tollBooth.arrived(truck);
        tollBooth.displayData();
    }
 
    public static ArrayList<Truck> makeTruckList(String[] commandLineArguments) {
        ArrayList<Truck> trucksList = new ArrayList<>();
        for (int i = 0; i < commandLineArguments.length; i++) {
            String data[] = commandLineArguments[i].split("-");
            String make = data[0];
            int axles = Integer.parseInt(data[1]);
            double weight = Double.parseDouble(data[2]);
 
            if (make.equals("1")) {
                trucksList.add(new FordTruck(axles, weight));
            } else if (make.equals("2")) {
                trucksList.add(new NissanTruck(axles, weight));
            } else if (make.equals("3")) {
                trucksList.add(new DaewooTruck(axles, weight));
            }
        }
return trucksList;
}
}