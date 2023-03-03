Feature:  Upload file verification
  User story: As a user I should be able to Upload file under the Files module

  Scenario: Upload a file from a computer
  Given user is already logged in to TryCloud application
  When user click the Files module
  Then user click the + button
  #Then user click the Upload file button
  And user upload a file from the computer
  Then user see the uploaded file in the list

