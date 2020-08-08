Feature: This is student service
  Scenario: User want to perform operations on student service
    Given student service is up
    When user submit get request to fetch all students
    Then Return all students