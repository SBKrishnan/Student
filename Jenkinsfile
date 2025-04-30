pipeline {
    agent any

    environment {
        CONTAINER_NAME = 'student'
        IMAGE_NAME = 'student'
    }

    stages {
        stage('Build with Maven') {
            steps {
                bat './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat "docker build -t bk/${IMAGE_NAME}:${BUILD_NUMBER} ."
            }
        }

        stage('Run Docker Image'){
            steps{
                bat "docker run -d -p 8086:8086 ${IMAGE_NAME}"
            }
        }

    }
}