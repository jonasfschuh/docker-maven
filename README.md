# Docker Maven 

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)


This project demonstrates how to use the spotify <code class="cx pa pb pc pd b">dockerfile-maven</code> 
plugin. Based on a dockerfile file, maven generates an image according to the tags in the POM.XML file and pushes it to docker hub.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [ScreenShots](#screenshots)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/jonasfschuh/docker-maven.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080/api/hello
3. The actuator will be accessible at http://localhost:8080/actuator/health
4. In your M2_HOME directory, update a settings.xml file with the following content:
```xml
<servers>
	<server>
		<id>docker.io</id>
		<username>dockerhub_user</username>
		<password>dockerhub_password</password>
		<configuration>
			<email>your@email.com</email>
		</configuration>
	</server>    
  </servers>

```

To build the docker image, run the following command:
```bash
mvn package
```

To push the docker image to docker hub, run the following command:
```bash
mvn dockerfile:push
```


## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.

## Screenshots
Actuator
![Actuator](https://github.com/jonasfschuh/docker-maven/blob/main/docs/img/actuator.gif?raw=true&sanitize=true)

Hello test example
![HellpTest](https://github.com/jonasfschuh/docker-maven/blob/main/docs/img/hello.jpg?raw=true&sanitize=true)

Docker Hub Tags
![Dockerhub](https://github.com/jonasfschuh/docker-maven/blob/main/docs/img/docker_hub.gif?raw=true&sanitize=true)