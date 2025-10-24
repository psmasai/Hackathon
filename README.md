let’s do this step by step so your “Hello World from Render” Spring Boot app is live. No fluff, ready-to-run instructions.
1️⃣ Make sure your project is ready
2️⃣ Push to GitHub
3️⃣ Go to Render
Open https://render.com
Sign in with GitHub
Click “New +” → “Web Service”
Select your GitHub repo

4️⃣ Fill Render settings
Field	Value
Name	hello-world-backend
Environment	Java
Build Command	./mvnw clean package -DskipTests
Start Command	java -jar target/improve-mycity-spring-backend-0.0.1-SNAPSHOT.jar
Instance Type	Free
Region	Singapore (closest to India)

Optional: if you plan to use prod profile:
Go to Environment → Add Environment Variable:
SPRING_PROFILES_ACTIVE=prod

5️⃣ Click Create Web Service
Render will:
Clone your repo
Build the JAR
Start your Spring Boot app
Check logs — look for something like:
Tomcat started on port(s): 10000
Started ImproveMyCitySpringBackendApplication in 5.123 seconds

6️⃣ Test your live API
Render gives you a URL, e.g.: https://hello-world-backend.onrender.com
Visit in browser or Postman:  https://hello-world-backend.onrender.com/api/v1/hello

✅ You should see:
Hello World from Render!
