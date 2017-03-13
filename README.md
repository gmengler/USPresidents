# US Presidents
A Java web application that displays important and interesting information about all US presidents. This was our week 6 project in the Skill Distillery Full-Stack Java Web Development Bootcamp.

## Application URL
http://www.shaundashjian.com:8080/USPresidents

## How to Use the Application
The user could go through the list of all U.S. Presidents. The User could search by term number, go to the next or previous president.

## Technology
The application uses the MVC architecture with JSP and servlets.

1. **The DAO:**
The DAO (Data Access Object) reads the data of all presidents from a file. It has a getPresident() method to get the president object to the servlet.
2. **The Servlet:**
The servlet gets the President information from the DAO and maintains session-specific information per user. It manages which president is being presented based on termNumber with the current president variable. If the user goes past the last president it goes back to the first president and if the user goes below the first president it moves to the last.
3. **The JSP:**
The JSP uses [Bootstrap](http://getbootstrap.com). It makes the current president appear. It has a text box which allows you to search by term number as well as next and previous buttons to scroll through.

