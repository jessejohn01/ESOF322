public class Company{
	public string name;
	public Address headquaters;
	public Employee[] employee;
	public Customer[] customer;
	public VehicleRentalService service;
	public Motorbike[] motorbike;
	public Car[] car;
	public Truck[] truck;
}

public abstract class Person{
	public string name;
	public string email;
	public Address address;
}

public class Address{
	public string street;
	public string postalCode;
	public string city;
}

public class Employee extends Person{
	
}

public class Customer extends Person{
	public BankAccount bankaccount;
	
}

public class BankAccount{
	public UnlimitedNatural number;
	public string depositor;
	public string bank;
}

public class Subcontractor extends Employee,Customer{
	
}

public abstract class Service{
	public Customer customer;
}
public class VehicleRentalService extends Service{
	public Vehicle vehicle;
	public void offerCar()
	public void offerMotorbike();
	public void offerTruck();
}

public abstract class Vehicle implements Rentable{
	
}
public class Rentable{
	public void rent();
}

public class Truck extends Vehicle{
	public UnlimitedNatural weight;
	public UnlimitedNatural power;
	public string manufacuturer;
	public string regNo;
}

public class Car extends Vehicle{
	public CarKind kind;
	public UnlimitedNatural noSeats;
	public UnlimitedNatural power;
	public string manufacuturer;
	public string regNo;
}

public class Motorbike extends Vehicle{
	public MbKind kind;
	public UnlimitedNatural cylinderCap;
	public UnlimitedNatural power;
	public string manufacuturer;
	public string regNo;
}