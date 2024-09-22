package DesignPatterns.Adapter;

// Adapter 
// * Structural design pattern
// * Allows objects with incompatible interfaces to collaborate.
// * ANALOGY: 
// - Suppose you have iphone 13 with has different charging port than type-c
// - Your friend have iphone 15 with type-c port
// - Unable to charge friend's phone with your charger
// - Use a adapter that takes apple's old charging port in input and has type-c as output
// - Now able to charge friend's phone

// * ANALOGY[software based]:
// * 
public class School {
    public static void main(String[] args) {
        // PilotPen pp = new PilotPen();
        Pen penAdapter = new PenAdapter();
        AssignmentWork aWork = new AssignmentWork();
        aWork.setP(penAdapter);
        aWork.writeAssignment("I have completed my assignment!");
    }
}