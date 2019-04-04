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
`fn create app AIS`

deploy function to app
======
`fn --verbose deploy --app AIS --local`

delete an app
=====
`fn delete app AIS`

making a HTTP request
=====
`curl -H "Content-Type: application/json" -d '{"id":"","name":"John Doe"}' http://localhost:8080/t/AIS/patient-create-trigger`



create doctor functions
========================
`fn init --runtime java --trigger http create`

create an app
=======
`fn create app AIS`

deploy function to app
======
`fn --verbose deploy --app AIS --local`

delete an app
=====
`fn delete app AIS`

making a HTTP request
=====
`curl -H "Content-Type: application/json" -d '{"id":"","name":"Acula","specialization":"blood analysis"}' http://localhost:8080/t/AIS/doctor-create-trigger`
