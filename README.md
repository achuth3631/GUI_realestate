# GUI_realestate

Your task is to extend the real estate application you created in Programming Assignment #4 to feature a graphical user interface using JavaFX. The application must meet the following requirements:

 

The application shall use the same data model you created for Programming Assignment #4 to manage three different types of properties: houses, condominiums, and apartments. You should be able to reuse and extend the classes you created for these items in the program you create for this assignment. All user interaction with your program must take place in a window-driven graphical user interface created using the JavaFX libraries.

Extend your previous data model to store a description for each property. This should be a text description of the property for sale or rental that can be defined by the user.

While JavaFX may be used to design interfaces for a variety of different device types, the design of your application should be targeted to users of desktop computers (as opposed to mobile devices). There is no need to design an interface that would be capable of running on many different types of devices.

Your application should be pre-populated with at least one listing of each type (house, condominium, apartment). When the application starts, you should initialize an object of each type and provide all data for the listing (address, price, image, description, etc.).

I have provide a shell program as attachment to this assignment (RealEstateListingSystem.zip) that implements a basic menu system and some stub event handlers for the following menu items:
Create House Listing
Create Condominium Listing
Create Apartment Listing
View Listings
Exit Program

You should use the shell program I've provided as the basis for your application. Only the Exit Program function has been implemented in this shell program. You will be responsible for implementing all other functions in the program. You may do this in any manner you want using JavaFX; all user interaction with the program must be done via a graphic user interface (no data entry or modification in the Java console is permitted).

When the user selects one of the options to create a listing (for either a house, condominium, or apartment), the application should display a single form that allows the user to enter all details for the property and click a Save button to store the listing on the system.

When the user selects the option to View Listings, the application should display a list of all properties stored in the system.  Listings should be organized under three separate headings (Houses, Condominiums, and Apartments).  Each listing should include complete details for the property in the same manner as your Assignment #4 program, but adding the description you added to the data model for this program. These listings should be neatly formatted in a scrollable window. Please use font stylings and colors as you please to make your listings easily readable; you can be as creative as you like with this.

The application shall only store data entered by the user during operation of the program in a single session; data does not need to be stored persistently by the application so that it may be accessed on future program executions. Only the pre-populated listings you initialize when the program starts need to be available upon program execution.
