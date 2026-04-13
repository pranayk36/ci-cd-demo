pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
		bat 'mvn test -DskipTests=false'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

	stage('Docker Build') {
 	   steps {
        	bat 'docker build -t ci-cd-demo .'
    	    }
	}
	
	stage('Deploy') {
    	   steps {
		bat 'docker stop ci-cd-container || exit 0'
	        bat 'docker rm ci-cd-container || exit 0'
        	bat 'docker run -d -p 8082:8080 --name ci-cd-container ci-cd-demo'
    	    }
	}
    }
}
