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
        | 6     | -3      | *         | -18     |
        | -6     | -3      | *         | 18     |
        | -6     | 3      | *         | -18     |
        | 6     | 0      | *         | 0     |
        | 5     | 2      | /         | 2.5      |
        | 5     | -2      | /         | -2.5      |
        | -5     | 2      | /         | -2.5      |
        | -5     | -2      | /         | 2.5      |
        | 0     | 2      | /         | 0      |
        | 0     | -2      | /         | 0      |
        | -0     | 2      | /         | 0      |
        | -6     | 2      | ^         | 36     |
        | -6     | 3      | ^         | -216     |
        | 2     | -1      | ^         | 0.5     |
        | -2     | -1      | ^         | -0.5     |
        | -2     | -2      | ^         | 0.25     |
        | -2     | -3      | ^         | -0.125     |
        | 0     | 2     | ^         | 0      |
        | -0    | 2     | ^         | 0      |
        | 2    | 0      | ^         | 1      |
        | 2    | -0     | ^         | 1      |
