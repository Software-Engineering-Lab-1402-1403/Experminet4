@tag
Feature: OperationalCalculator

    Scenario Outline: calculate operations between two int
        Given Two input values op, <first> and <second>
        When Applying operation, <operation>
        Then The result is <result>

      Examples:
        | first | second | operation | result |
        | 6 | 2 | * | 12 |
        | 6 | 2 | / | 3 |
        | 6 | 2 | ^ | 36 |