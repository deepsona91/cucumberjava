#https://www.youtube.com/watch?v=4e9vhX7ZuCw
#https://cheatography.com/davechild/cheat-sheets/regular-expressions/
#https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285
#A feature is like a test class. Scenarios are test.
#Each line inside scenarios are steps. This steps are linked(glued) to step definations in step definition classes.
#Examples can be used for passing data.
#Tags can be added at Feature or scenario. but cannot be added on given,when,then etc.
@smokefeature
Feature: Feature to test name is updated when entering

  @smokescenario
  Scenario Outline: Check name is updated in name textbox
    Given browser is open
    When Enter "<name>" on name textbox
    When Enter "<position>" on position textbox
    When click on login button
    Then home page is visible

    Examples: 
      | name     | position  |
      | Deepsona | Senior QA |
      | Annesha  | Wife      |
      | Deblina  | Developer |
