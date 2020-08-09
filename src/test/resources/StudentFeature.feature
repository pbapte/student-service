Feature: This is student service

  Scenario Outline: User want to perform operations on student service
    Given student service is up
    When user create student with <student_id> and <student_name>
    Then i should see newly created student
    Examples:

    Example:
      | student_id | student_name
      | 1          | Prashant