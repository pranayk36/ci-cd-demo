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

	stage('Deploy to Kubernetes') {
 	   steps {
        	bat 'kubectl apply -f deploy.yaml'
	        bat 'kubectl apply -f service.yaml'
    	    }
	}	
    }
}
