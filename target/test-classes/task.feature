@Feature1
Feature: To validate the login functionality of facebook application.

Background:

Given To launch the chrome browser and maximise window.

@Smoke
Scenario: To validate the ligin with valid username and invalid password.
When To launch the Url of the facebook application.
And To pass the valid username in email field.
And To pass the invalid password in password field.
And To click login button.
And To check wheather it navigate home page or not.
Then  To Close the browser.

@Sanity
Scenario Outline: To validate positive and negative combination of login functionality.
When User has to launch the Url of the facebook application.
And User has to pass the data "<email>" in email field.
And User has to pass the data "<password>" in password field.
And User has to click the login button.
Then Uer has to close the browser.

Examples:

|email                |password |
|sunil@gmail.com      |sunil123 |
|framework@gmail.com  |1209787  |
|slenium@gmail.com    |sel23de  |
|apple@gmail.com      |ap2mchis |
|automation@gmail.com |234545   |
|abcd@gmail.com       |abd256f  | 



