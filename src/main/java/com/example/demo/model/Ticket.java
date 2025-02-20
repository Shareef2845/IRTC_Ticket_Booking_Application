package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String trainNumber;
    private String origin;
    private String destination;
    private String travelDate;
    private Double fare;
    
    

    public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(Long id, String passengerName, String trainNumber, String origin, String destination,
			String travelDate, Double fare) {
		super();
		this.id = id;
		this.passengerName = passengerName;
		this.trainNumber = trainNumber;
		this.origin = origin;
		this.destination = destination;
		this.travelDate = travelDate;
		this.fare = fare;
	}

	// Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", passengerName=" + passengerName + ", trainNumber=" + trainNumber + ", origin="
				+ origin + ", destination=" + destination + ", travelDate=" + travelDate + ", fare=" + fare + "]";
	}
    
    
}