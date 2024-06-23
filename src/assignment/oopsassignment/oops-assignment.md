## OOP Assignment

# Inheritance
Create a Java program to model different types of vehicles. 
Define a superclass called [Vehicle], which has the following attributes and methods: 
Attributes: [make, model, year] 
Methods: [start(), stop(), displayInfo()] 
Next, create two subclasses Car and Motorcycle that inherit from the Vehicle class.
Each subclass should have an additional attribute specific to its type ([numDoors] for Car and [numCylinders] 
for Motorcycle), along with any necessary methods. Then, create a subclass [ElectricCar] that inherits from
the Car class. ElectricCar should have an additional attribute [batteryCapacity] and a method [chargeBattery()]. 
Finally, write a Main class to demonstrate the functionality 
of these classes by [creating objects of Car, Motorcycle, and ElectricCar and calling their methods.]












# Polymorphism
You are developing a simple payroll system for a company. 
The company has different types of employees, including full-time employees and part-time employees. 
Each employee is paid based on their specific type, and the calculation may vary depending on whether the 
employee is full-time or part-time. Implement polymorphism to handle the calculation of
pay for different types of employees. Define a superclass called Employee with common attributes 
such as employee ID and name, and a method calculatePay() to calculate the pay for an employee. 
Then, create two subclasses FullTimeEmployee and PartTimeEmployee that inherit from the Employee class. 
Each subclass should override the calculatePay() method to provide the specific pay calculation
for full-time and part-time employees, respectively.

Your solution should include: A Employee class with attributes for employee ID and name,
and a method calculatePay() to calculate the pay for an employee.
A FullTimeEmployee class that inherits from the Employee class and overrides the calculatePay() 
method to calculate the pay for a full-time employee. 
A PartTimeEmployee class that inherits from the Employee class and overrides the calculatePay() 
method to calculate the pay for a part-time employee. A Main class to demonstrate the functionality
of these classes by creating objects of FullTimeEmployee and PartTimeEmployee and calling their calculatePay() methods.















# Abstract class
Problem: Develop a multimedia player system that supports playing [audio], [video], and [displaying images]. 
The system should consist of the following components:

abstract class [MediaDevice]: An abstract class representing a generic media device. 
It should have a [name] field and a method [void displayDetails()] to display details about the device.

class [AudioPlayer]: A class representing an audio player, 
which is a subclass of MediaDevice and 
It should have fields for the [song name] and [artist]. The [play()] method should play the audio,
and [displayDetails()] should display details about the audio player.

VideoPlayer: Another class representing a video player, 
which is a subclass of MediaDevice  
It should have fields for the video title and duration. 
The play() method should play the video, and displayDetails() should display details about the video player.

ImageDisplay: A class representing an image display device, which is a subclass of MediaDevice. 
It should have fields for the image name and resolution. 
The displayImage() method should display the image, and displayDetails() should display 
details about the image display device.

Write a Java program to implement the multimedia player system. 
Create instances of AudioPlayer, VideoPlayer, and ImageDisplay, 
and test their functionality by playing media and displaying device details.














# Interfaces
Problem statement 1 Create an interface Animal with methods feed() and makeSound() to represent basic animal behaviors. Create interfaces for specific behaviors, such as Swimmable with methods swim() for aquatic animals and Climbable with methods climb() for animals that can climb. Implement classes for different animal types (e.g., Lion, Penguin, Monkey) that implement the relevant interfaces. Each animal type should exhibit its unique behaviors, such as a lion roaring and a penguin swimming. Design the architecture to allow the addition of new animal types with minimal code changes.

================ Problem statement 2

Create an interface NotificationSender with a method sendNotification(String message) to represent the basic notification sending functionality. Create interfaces for different notification channels, such as EmailNotification with methods for setting recipients and sending email notifications, SMSNotification with methods for specifying phone numbers and sending SMS notifications, and PushNotification with methods for sending push notifications to devices.

Implement classes that represent each notification channel (e.g., EmailNotificationSender, SMSNotificationSender, PushNotificationSender) that implement the corresponding interfaces.

Each notification channel class should encapsulate the logic for sending notifications through its respective channel.

Design the architecture in a way that new notification channels can be added with minimal code modifications.