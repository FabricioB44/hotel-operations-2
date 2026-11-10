package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Room testRoom = new Room(2, 60.99, false, true);
        Reservation testReservation = new Reservation("king", 5, true);
        Employee testEmployee = new Employee(1234, "Joe Smith", "Plumming", 22.50, 46);

        System.out.println("Is room available? " + testRoom.getIsAvailable());
        System.out.println("Room price: " + testReservation.getPrice());
        System.out.println("Total reservation price: " + testReservation.getReservationTotal());
        System.out.println("Employee regular hours: " + testEmployee.getRegularHours());
        System.out.println("Employee overtime hours: " + testEmployee.getOvertimeHours());
        System.out.println("Employee total paycheck: " + testEmployee.getTotalPay());
    }
}
