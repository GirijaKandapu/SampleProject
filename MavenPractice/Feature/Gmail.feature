Feature: Gmail_Feature
  
  @Sample1
  Scenario: Login to Gmail account_compose email_logout
    When Browser Initiation
    |URL|https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin|
    And Login to Gmail account
    And Compose Email
    Then Logout of Gmail account
    
