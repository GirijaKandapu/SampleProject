Feature: DemoSite_Feature

  @Sample1
  Scenario: Login to Demosite_test random web elements
    When Browser Initiation
    |URL|http://the-internet.herokuapp.com/|
    And user tests Checkboxes functionality
    And user tests Mousehover functionality
    And user tests Dropdown functionality
    And user tests Frames functionality
    Then user closes the browser

  
