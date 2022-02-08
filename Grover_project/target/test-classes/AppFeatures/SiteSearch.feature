Feature: Searching the Grover website displays relevant results

  Scenario:Searching within the menu bar
    When I search Product Samsung
    Then the Appropriate search should contain the search input
    When I click on Cart Button
    And I Enter Sign_up Details
    Then Mobile confirmation should display
    And I select Mobile country code 
    And I Enter Mobile number
    #And I click on confirm button