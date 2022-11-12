package busREservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        //Bus obj = new Bus(0,true,3);
        //buses.add(obj);
        buses.add(new Bus(1,true,1));
        buses.add(new Bus(2,false,3));
        buses.add(new Bus(3,true,4));

        for(Bus b: buses){
            b.displayBusInfo();
        }

        int useropt =1;
        Scanner input = new Scanner(System.in);
        while(useropt==1){
            System.out.println("Enter 1 to Book and 2 to Exit");
            useropt=input.nextInt();
            if (useropt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println("Your Booking is Confirmed ");
                }
                else
                    System.out.println("Sorry. Bus is full....Try Another Bus");
            }
        }
    }
}
