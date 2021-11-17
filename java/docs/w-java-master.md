:books: **JAVA**

:beginner: _**EXCEPTIONS**_

:question: **exception**

- an abnormal condition
- that occurs at `runtime (runtime errors)`
- if not handled, program will terminate abruptly
- hanlde it with try...catch mechanism
-

:writing_hand: **_what if ; is missing_**  
`syntax errors`

- the compiler checks for syntax errors
- program fails to compile if it has syntax errors

:writing_hand: **_connect arrays with exceptions_**  

:thumbsdown: **Bad Practices**  
```java
 catch (NullPointerException abcef)
 Calculator1 xyz = null;
```
:thumbsup: **Best Practices**  
```java
 catch (NullPointerException nullPointerException)
 Calculator1 casioCalculator = null;
```