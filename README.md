# Service Delivery API.

To build and run unit tests

```bash
./gradlew clean build
```

### Auth API

#### Creating new user

POST```http://localhost:8080/users/registration```

```
{
    "username": "denys",
    "firstName": "denys",
    "lastName": "bond",
    "email": "denys2@email.com",
    "password": "1234"
}
```

#### Login

POST```localhost:8080/auth/login```

```
{
    "email": "denys2@email.com",
    "password": "1234"
}
```

Another endpoints should have ```Authorization``` header from ```/login``` endpoint.