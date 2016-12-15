package step03;

import k.Passenger;

public final class PassengerEqualityJava {
    public static void main(String... args) {
        final Passenger bob = new Passenger();
        final Passenger tom = new Passenger();
        System.out.println("Bob equals Tom = " + bob.equals(tom));
    }
}
