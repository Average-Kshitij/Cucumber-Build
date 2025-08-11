Feature: Amazon login page 

Background:
Given Browser is initialized

#@smoke
#Scenario Outline: Search for a product , filter the price range and verify search results contain product less than or equal to that price range.
#Given User navigates to the home page
#Then Searches for a <product_name>
#And Filters the price range to <min_price> and <max_price> values
#Then Checks the product prices are displayed for the filtered price range

#Example:
#product_name|min_price|max_price
#iPhone|0|70000


@smoke
Scenario: Homepage default login
Given User is on landing page
When User login into application using user name "Sawant" and password "4156"
Then Home page is populated
And Cards display "false"