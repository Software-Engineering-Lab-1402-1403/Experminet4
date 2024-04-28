@tag
Feature: OperationCalculator

    Scenario Outline: apply operation
      Given two integers, <first> and <second>
      When applying operation, <operation> to them
      Then I want result <result>

      Examples:
        | first | second | operation | result |
        | 6     | 2      | *         | 12     |
        | 6     | 2      | /         | 3      |
        | 6     | 2      | ^         | 36     |