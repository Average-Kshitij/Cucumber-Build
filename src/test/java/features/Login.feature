Feature: Application login

Scenario: Homepage default login
Given User is on landing page
#|kshitij|
When User login into application using user name "Kshitij" and password "1234"
Then Home page is populated
And Cards display "true"


Scenario: Homepage default login
Given User is on landing page
When User login into application using user name "Sawant" and password "4156"
Then Home page is populated
And Cards display "false"