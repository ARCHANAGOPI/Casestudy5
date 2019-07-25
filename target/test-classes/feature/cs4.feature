Feature: Test cart
Scenario: Check test cart functionality
Given open application
When login the app
And give username as "lalitha"
And give password as "password123"
And search for required item
And click search
Then check for cart
Then close application
