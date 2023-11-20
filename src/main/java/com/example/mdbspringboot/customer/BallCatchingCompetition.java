package com.example.mdbspringboot.customer;

import java.util.Scanner;

public class BallCatchingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Sudut elevasi mesin penembak bola terhadap gedung :");
        double elevationAngle = scanner.nextDouble();
        System.out.println("Kecepatan Peserta Km/Jam:");

        double speedParticipantKmph = scanner.nextDouble();

        // Convert speed from km/hour to m/s
        double speedParticipantMs = speedParticipantKmph * (1000.0 / 3600.0);

        // Given time
        double time = 6.0; // 6 seconds

        // Convert the elevation angle from degrees to radians
        double elevationAngleRad = Math.toRadians(elevationAngle);

        // Calculate the horizontal component of the initial velocity
        double initialVelocity = 50.0 / (Math.sin(elevationAngleRad) * time); // 50.0 is the height of the building

        // Calculate the horizontal distance
        double horizontalDistance = initialVelocity * Math.cos(elevationAngleRad) * time;

        // Determine whether participants can catch the ball
        boolean participantsCanCatch = horizontalDistance <= speedParticipantMs * time;

        // Output
        System.out.println("Jarak mendatar bola ke gedung: " + String.format("%.1f", horizontalDistance) + " meters");
        System.out.println("Peserta dapat menangkap bola: " + participantsCanCatch);
    }
}