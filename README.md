# spring-demo
Demonstrate some Spring and GraphQL

## Get Started
Clone the repository, `cd` in, and run.

```shell
git clone git@github.com:dmargolies/spring-demo.git
cd spring-demo
./gradlew bootRun
```

## Make a GraphQL request
- Download [Postman](https://www.postman.com/).
- Configure a POST request against `localhost:8080`
- Set the POST Body to GraphQL
- Send a query:
```graphql
query greeting {
    greeting(name: "david")
    fullGreeting(firstName: "David", lastName: "Margolies") {
        fullGreeting
        shortGreeting
    }
}
```

GraphQL Schema lives [here](src/main/resources/graphql/demo.graphqls)