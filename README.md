Unreadable code
================================================================================

Exercise in refactoring unreadable code into readable code, with "Hit and Blow".


Requirements
--------------------------------------------------------------------------------

- Java 21


Hit and Blow
--------------------------------------------------------------------------------

Hit and Blow hits the hidden 1-9 digit numbers.

```bash
./mvnw clean package && java -jar target/unreadable_code-1.0-SNAPSHOT.jar 4
```

Demo

```
Secret code is 4-digits.
****

> 1234
turn | 1
hit  | 0
blow | 3

> 5678
turn | 2
hit  | 1
blow | 0

```
