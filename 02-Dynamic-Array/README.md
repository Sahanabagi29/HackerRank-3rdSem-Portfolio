
# Dynamic Array

## Problem
Perform two types of queries on multiple sequences and return the answers from type 2 queries.

## Approach
- Create N empty sequences.
- Initialize lastAnswer to 0.
- Calculate the sequence index using (x ^ lastAnswer) % n.
- For type 1, append y to the selected sequence.
- For type 2, find the required element and update lastAnswer.
- Store each answer in the result list.

## Complexity
- Time Complexity: O(N + Q)
- Space Complexity: O(N + Q)

## Language
Java 15

## Status
Accepted on HackerRank.
