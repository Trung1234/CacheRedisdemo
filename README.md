Step 1: Ensure Redis Server is Running
Download the Redis executable from Redis for Windows.
Extract the files and run redis-server.exe.

Step 2: Verify Redis Configuration
Ensure that the Redis configuration in your application.properties  file is correct.
spring.cache.type=redis
spring.redis.host=localhost
spring.redis.port=6379

Step 7: Run and Test the Application
Access the endpoint multiple times using a browser or a tool like Postman:
http://localhost:8080/data/1

The first request will trigger the getData method in MyService and store the result in the Redis cache. Subsequent requests with the same ID will retrieve the data from the cache instead of calling the method again, thus improving performance.