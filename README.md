setting up fn cli
=================
https://fnproject.io/tutorials/install/

create patient functions
========================
`fn init --runtime java --trigger http create`

create an app
=======
`fn create app codecamp-app`

deploy function to app
======
`fn --verbose deploy --app codecamp-app --local`

delete an app
=====
`fn delete app codecamp-app`

making a HTTP request
=====
`curl -H "Content-Type: application/json" -d '{"id":"1","name":"John Doe"}' http://localhost:8080/t/codecamp-app/create-trigger`

