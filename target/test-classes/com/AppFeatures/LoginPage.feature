Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Cogmento CRM123"

Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "suchitest1988@gmail.com"
And user enters password "Nisha@1234"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Cogmento CRM123"



