setting up fn cli
=================
https://fnproject.io/tutorials/install/

create patient functions
========================
`fn init --runtime java --trigger http create`

build a function
=====
`fn --verbose build`

create an app
=======
`fn create app codecamp-patient-app`

deploy function to app
======
`fn --verbose deploy --app codecamp-patient-app --local`

delete an app
=====
`fn delete app codecamp-patient-app`

making a HTTP request
=====
`curl -H "Content-Type: application/json" -d '{"id":"1","name":"John Doe"}' http://localhost:8080/t/codecamp-patient-app/patient-create-trigger`



create doctor functions
========================
`fn init --runtime java --trigger http create`

create an app
=======
`fn create app codecamp-doctor-app`

deploy function to app
======
`fn --verbose deploy --app codecamp-doctor-app --local`

delete an app
=====
`fn delete app codecamp-doctor-app`

making a HTTP request
=====
`curl -H "Content-Type: application/json" -d '{"id":"1","name":"Acula","specialization":"vampire"}' http://localhost:8080/t/codecamp-doctor-app/doctor-create-trigger`
