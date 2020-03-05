# restian
Java REST database access layer


## Design notes
### Request processing
1. Transform HTTP request into ApiRequest
    1. Identify the type of the operation
    2. Transform query string into SQL where statements
    3. Identify collections in the request
    4. Identify collections to be returned
2. Authorize the query
3. Build full SQL query
4. Execute the query
5. Serialize query results and send the response 
