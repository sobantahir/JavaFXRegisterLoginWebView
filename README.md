# JavaFX Registration, Login and WebView Form

This JavaFX application allows users to register, log in, and view a WebView of a GitHub profile.
<p align="center">
  <strong>THE G.O.A.T</strong>
</p>
<p align="center">
  <img alt="goat" src="https://yt3.googleusercontent.com/ytc/AIdro_mPFVsxROj1dOtTWc9iNBwDYV4z42Q8LPokBSewiW9pCSg=s176-c-k-c0x00ffffff-no-rj">
</p>

### Components 
1 - Main Application (Main.java)
- Description: Initializes the JavaFX application, setting up the initial scene for user registration.
- Functionality: Loads Registration.fxml as the starting scene.
- Usage: Execute Main.java to launch the application.

2 - Registration Controller (RegistrationController.java)
- Description: Manages user registration, validating inputs and writing them to users.txt.
- Functionality: Allows users to register by entering a username and password. Redirects to Login.fxml upon successful registration.
- Usage: Fill out tfUsername and pfPassword fields in Registration.fxml, then click "Register".

3 - Login Controller (LoginController.java)
- Description: Handles user login, validating credentials against users.txt.
- Functionality: Validates entered username and password. Displays error message for invalid attempts or navigates to WebView.fxml on successful login.
- Usage: Enter registered credentials in the login form (Login.fxml) and click "Login".

4 - Web View Controller (WebViewController.java)
- Description: Controls the WebView component to display a specified web page (https://github.com/sobantahir).
- Functionality: Initializes and loads the specified web page into the WebView upon application startup.
- Usage: Opens a WebView displaying https://github.com/sobantahir automatically when the application starts.

## Resources 

- [Using FXML to Create a User Interface](https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm#CHDCCHII): Learn how to use FXML in JavaFX to build graphical user interfaces.
- [How to Retrieve the Contents of a Text Field in JavaFX?](https://www.tutorialspoint.com/how-to-retrieve-the-contents-of-a-text-field-in-javafx#:~:text=To%20create%20a%20text%20field,using%20the%20getText()%20method): Understand how to retrieve and manipulate the content entered into text fields using JavaFX.
- [Java File Input/Output - It's Way Easier Than You Think](https://www.youtube.com/watch?v=ScUJx4aWRi0&ab_channel=CodingwithJohn): Explore the basics of reading from and writing to files in Java, simplifying file input and output operations.
- [Java Tutorial #82 - Java BufferedReader Class with Examples (File Handling)](https://www.youtube.com/watch?v=IMfMyd3M1Cw): Learn about the Java BufferedReader class for efficient reading of characters from files.
- [Java Tutorial #83 - Java BufferedWriter Class with Examples (File Handling)](https://www.youtube.com/watch?v=U28eKSLI7pw): Understand the Java BufferedWriter class for efficient writing of characters to files.
- [JavaFX Switch Scenes 💞](https://www.youtube.com/watch?v=hcM-R-YOKkQ&ab_channel=BroCode): Discover how to switch between scenes in JavaFX applications to manage different views and interactions.
- [Alert | JavaFX GUI Tutorial for Beginners](https://www.youtube.com/watch?v=KzxE3ZcSIvQ): Explore how to use alerts in JavaFX to provide informative messages or notifications to users.
- [JavaFX WebView + Building a Web Browser 🌐](https://www.youtube.com/watch?v=96r3olimdkA): Learn how to integrate a WebView component in JavaFX applications to display web pages and build a simple web browser.
- [JavaFX Login and Signup Form with Database Connection](https://www.youtube.com/watch?v=ltX5AtW9v30&ab_channel=WittCode): How to make interface look better.
- [GPT Help](https://chatgpt.com/c/627e6972-4fd7-43fc-ac1d-4868d512f0e3): Prompt "explain buffered reader and writer and why i cant use it instead of file writer and reader, also how do i show errors in javafx"
