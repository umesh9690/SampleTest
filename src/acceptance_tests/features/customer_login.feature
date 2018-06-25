@login
Feature: Customer Login
#Sample FEATURE FILE, should be removed later

  @test
  Scenario:  Customer logs in successfully
    Given a registered customer
    When they log in with the correct username and password
    Then the login is sucessful

  @test
  Scenario:  Customer logs in failure
    Given a registered customer
    When they log in with the correct username and password
    Then the login is failure