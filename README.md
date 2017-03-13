# USPresidents


# The DAO

The dao reads the input from a file and catches an exception if you try to type in a president other than presidents 1 -45
It also has a getPresident method to get the president object.

# The Servlet

The servlet gets the information from the JSP. If the currentPresident variable is empty it loads up a session which keeps track of what the user is viewing. It manages which president is being presented based on termNumber with the current president variable. If the user goes past president 45 it goes back to president 1 and if the user goes below president 1 it move them to president 45.

# The JSP
The JSP is made with HTML and bootstrap. It uses expressional language and makes the current president appear. It has 2 arrows that move through the hashmap of presidents. It has a text box which allows you to search by term number as well as next and previous buttons.

