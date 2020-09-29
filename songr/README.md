# songr

## How to run

after pulling down the code from https://github.com/PVOBrien/springFullStackApp
 - from the root (or, the folder with the gradlew file) run ./gradlew bootRun
    - go to localhost:8080 to land on the homepage.
    - go to localhost:8080/capitalize/\<_your text here_\> to return \<_your text here_\> completely capitalized
    - go to localhost:8080/albums/ to see three albums displayed
 
 - ./gradlew test to test that the Album constructor and its getters and setters are working.
 
## Functionality

- Spring app will load to a splash screen.
- hello world greeting on "/hello" route.
- /capitalize/\<your words\> will return those words capitalized.
- localhost:8080/albums shows three albums (hardcoded).