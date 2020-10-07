# songr

## How to run

After pulling down the code from https://github.com/PVOBrien/springFullStackApp:

- Go to your heroku 
- Create an app
- Go to resources
 - search Heroku Postgres
 - deploy it to the app
 - go to the Heroku Postrgres -> Settings -> View Credentials
 - in your application.properties in the src/main/resources set these properties up replacing <###> with the appropriate field from your Heroku Settings credential fields.
 ```
   - spring.datasource.url=jdbc:postgresql://<HOST>:<PORT>/<DATABASE>
   - spring.datasource.username=<USER>
   - spring.datasource.password=<PASSWORD>
```
After creating the Heroku Postrgres Database:

   - from the root (or, the folder with the gradlew file) run ./gradlew bootRun 
   - ./gradlew test to test that the Album constructor and its getters and setters are working.
 
## Functionality

- Spring app will load to a splash screen.
- hello world greeting on "/hello" route.
- /capitalize/\<your words\> will return those words capitalized.
- localhost:8080/albums allows a user to input details for an album, and displays it.
- http://localhost:8080/songsalbum/#? will return an album's info (if an album exists at that #). You can return back to /albums from the top of the page.

## Lab 13 Functionality

- wired many-to-one relational database from songs to album, and one to many from albums to song.
- included fields to input songs details, that is saved to the songRepository, and is persistent.
- upon album or song add, an alert appears to confirm the item has been added. Accomplished via <script></script at end of body in albumsPageToShow.html.
