Feature: Sample_Feature
  
  @Sample1
  Scenario: Login to Gmail account_compose email_logout
    When Browser Initiation
    And Login to Gmail account
    And Compose Email
    Then Logout of Gmail account
    
