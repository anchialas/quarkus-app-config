
build:
	mvn clean install

doc:
	mvn compile -Pdocs && mvn pre-site -Pdocs
