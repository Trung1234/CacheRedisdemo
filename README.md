## Redis is often used for caching due to its unique features and advantages, which make it an ideal choice for this purpose
   - <b>High Performance</b>: Redis is an in-memory data store, meaning it stores data in RAM. This allows for extremely fast read and write operations, often in the order of microseconds to milliseconds, which is crucial for caching purposes.
### To configure Redis as the data store for Spring Boot cache
   - ### Step 1: Ensure Redis Server is Running
  For Windows:
  
  Download the Redis executable from Redis for Windows.
  Extract the files and run 
  <code> redis-server.exe. </code>

 - ### Step 2: Verify Redis Configuration
  Ensure that the Redis configuration in your application.properties  file is correct.
  <code>
    spring.cache.type=redis  
    spring.redis.host=localhost  
    spring.redis.port=6379
  </code>
  
 - ### Step 3: Run and Test the Application
      Access the endpoint multiple times using a browser or a tool like Postman:
      + http://localhost:8080/data/1

The first request will trigger the getData method in MyService and store the result in the Redis cache. Subsequent requests with the same ID will retrieve the data from the cache instead of calling the method again, thus improving performance.
