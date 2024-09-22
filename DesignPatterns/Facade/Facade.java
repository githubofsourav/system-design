package DesignPatterns.Facade;

// *Facade*
// - Structural design pattern
// - provides a simplified interface to a library, a framework, or any other complex set of classes
// - provides convenient access to a particular part of the subsytem's functionality
// - sometimes the facade can grow too big and become a |god Object|, to avoid this, an additional facade can be created with unrelated features
// - the idea of facade is providing a simplified interface to the client, and if the code becomes too dependent on this class, that might make it 
//  another complex structure and no longer a |simple object|
// - subsystem classes(CryptoFactory, CryptoDatabase, BitcoinService) aren't aware of the facade's existence, they operate within the system and work with each other directly
// - client uses the facade instead of calling the subsystem objects directly

/*
 * Facade Pattern *
 - a class that serves as a front-facing interface that masks complex underlying structural code 
 - improves the readability and usability of a software library by hiding the interaction of its components
 - applies Single Responsibilty Principle
 */


// ANALOGY[crypto investment app]:
// - allow user to buy crypto using local money
// - you want to use already existing third-party library containing wide range of methods and interfaces, 
//  each meant to perform specific task and may affect multiple parts of our app
// - you want to use buyCurreny method of this library

public class Facade {

}