
# Time Conversion

## Problem
Convert a given time from 12-hour AM/PM format to 24-hour format.

## Approach
- Extract the AM/PM part from the input.
- Extract the hour from the time.
- If the time is AM and hour is 12, change it to 00.
- If the time is PM and hour is not 12, add 12 to the hour.
- Return the converted time in 24-hour format.

## Complexity
- Time Complexity: O(1)
- Space Complexity: O(1)

## Language
Java 15

## Status
Accepted on HackerRank.
