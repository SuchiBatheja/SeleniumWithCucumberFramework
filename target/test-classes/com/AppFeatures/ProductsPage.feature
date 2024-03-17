

Feature: Products page feature


Background:
Given User has looged in to application
|username|password|
|suchitest1988@gmail.com|Nisha@1234|



Scenario: Add product
Given user is on Products Page
And User selects New Button
And Enters field name "DEF"
Then User selects Save button











